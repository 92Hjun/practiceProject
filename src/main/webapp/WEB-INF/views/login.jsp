<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>login Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<%@include file="nav.jsp" %>
		<div class="row">
			<div style="margin-top: 150px;" class="col-sm-4 col-sm-offset-4">
				<form action="login" method="post">
					<div class="form-inline form-group">
						<label>아이디</label>
						<input size="25" name="id" class="form-control pull-right input-sm"/>
					</div>
					<div class="form-inline form-group">
						<label>비밀번호</label>
						<input type="password" size="25" name="pwd" class="form-control pull-right input-sm"/>
					</div>
					<div class="form-group text-right">
						<button type="submit" class="btn btn-default btn-xs">로그인</button>
						<a href="adduser" class="btn btn-danger btn-xs">회원가입</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>