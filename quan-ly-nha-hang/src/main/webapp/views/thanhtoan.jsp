<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Chọn thanh toán</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form id="thanhToan" action='<c:url value="/thanh-toan"/>' method="POST">
			<c:if test="${not empty message}">
				<div class="alert alert-${alert}">
				    ${message}
				</div>
			</c:if>
			<div class="row">
				<div class="form-group">
	                <label for="banan"><b>Chọn bàn</b> </label>
	                <select id="banan" name="banan" class="custom-select">
	                	<c:forEach items="${bans}" var="item"> 
                            <option value="${item.idBan}"> ${item.tenBan}</option>
                        </c:forEach> 
                    </select>
                    
	            </div>
			</div>
			<button type="submit" class="btn btn-primary" id="btnThanhToan">Xem hóa đơn</button>
		</form>
		
	</div>
</body>
</html>