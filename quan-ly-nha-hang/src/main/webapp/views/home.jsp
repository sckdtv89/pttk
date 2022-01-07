<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Trang chu</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href='<c:url value="/thanh-toan"/>'>Thanh Toán</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Quản Lý nhân viên</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Thống Kê</a>
    </li>
  </ul>
</nav>
	<%-- <div class="container">
		<div class="row">
			<button class="btn btn-primary">
				<a href='<c:url value="/thanh-toan"/>'>Thanh Toán</a>
			</button>
		</div>
		<div class="row">
			<button class="btn btn-primary">
				<a href="addservice.jsp">Thống kê</a>
			</button>
		</div>
		<div>
			<button class="btn btn-primary">
				<a href="addservice.jsp">Quản lý</a>
			</button>
		</div>
		
	</div> --%>
</body>
</html>