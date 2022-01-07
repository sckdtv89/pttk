<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Hóa đơn</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<form action='<c:url value="/hoa-don"/>' id = "hoaDonForm" method="post">
		
		<div class="form-group">
			<label for="ban"><b>Bàn</b> </label> <input
				id="ban" name="ban" type="text" class="form-control"
				value="${banDat.idBan}" readonly="readonly">
		</div>
		<div class="form-group">
			<label for="tenKhachHang"><b>Tên Khách Hàng</b> </label> <input
				id="tenKhachhang" name="tenKhachHang" type="text" class="form-control"
				value="${banDat.tenKhachHang}" readonly="readonly">
		</div>
		
		<div class="form-group">
			<label for="tenNhanVien"><b>Tên Nhân Viên</b> </label> <input
				id="tenNhanVien" name="tenNhanVien" type="text" class="form-control"
				value="${USER.hoTen}" readonly="readonly">
		</div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Món Ăn (Combo)</th>
					<th scope="col">Số lượng</th>
					<th scope="col">Đơn giá</th>
					<th scope="col">Thành tiền</th>
				</tr>
			</thead>
			<tbody>
				<%-- <c:forEach var="item" items="${monAns}">
					<tr>
						<td>${item.idMonAn}</td>
						<td>${item.tenMon}</td>
						<td>1</td>
						<td>${item.giaHienTai} VND</td>
					</tr>
				</c:forEach> --%>
				<c:forEach var="item" items="${monAns}">
					<tr>
						<td>${item.monAn.idMonAn}</td>
						<td>${item.monAn.tenMon}</td>
						<td>${item.soLuong}</td>
						<td>${item.monAn.giaHienTai} VND</td>
						<td>
							<c:set var = "thanhTien" scope = "session" value = "${item.monAn.giaHienTai*item.soLuong}"/>
      						<c:out value = "${thanhTien} VND"/>
						</td>
					</tr>
				</c:forEach>
				<c:forEach var="item" items="${combos}">
					<tr>
						<td>${item.combo.idCombo}</td>
						<td>${item.combo.tenCombo}</td>
						<td>${item.soLuong}</td>
						<td>${item.combo.giaHienTai} VND</td>
						<td>
							<c:set var = "thanhTienComBo" scope = "session" value = "${item.combo.giaHienTai*item.soLuong}"/>
      						<c:out value = "${thanhTienComBo} VND"/>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="form-group">
			<label for="maGiamGia"><b>Mã giảm giá</b> </label> 
			<select id="magiamgia" name="magiamgia" class="custom-select" onchange="getval(this);">
				<option value="0" selected>Chọn mã giảm giá</option>
          		<c:forEach items="${phieuGiamGias}" var="item"> 
                    <option value="${item.discount}">${item.moTa}: Giam gia ${item.discount} %</option>
                </c:forEach> 
            </select>
		</div>
		<div class="form-group">
			<label for="tongTien"><b>Tổng tiền</b> </label> <input
				id="tongTien" name="tongTien" type="text" class="form-control"
				value="${tongTien} VND" readonly="readonly">
			<input type="hidden" id="tongTienThanhToan" name="tongTienThanhToan" value="${tongTien} VND">
		</div>
		<button type="submit" class="btn btn-primary" id="btnThanhToan">Thanh Toán</button>
	</form>
	</div>
	<script src="${pageContext.request.contextPath}/resources/js/magiamgia.js"></script>
</body>
</html>