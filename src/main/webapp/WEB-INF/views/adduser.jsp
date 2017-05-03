<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<%@include file="nav.jsp" %>
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4">
				<div style="margin-top: 100px;" class="well">
					<form:form action="adduser" method="post" commandName="addUserForm" >
						<div class="form-inline form-group">
							<label>아이디</label>
							<form:input size="25" path="id" cssClass="form-control pull-right"/>
							<form:errors path="id" cssClass="text-danger"/>
						</div>
						<div class="form-inline form-group">
							<label>비밀번호</label>
							<form:password size="25" path="pwd" cssClass="form-control pull-right"/>
							<form:errors path="pwd" cssClass="text-danger"/>
						</div>
						<div class="form-inline form-group">
							<label>이름</label>
							<form:input size="25" path="name" cssClass="form-control pull-right"/>
							<form:errors path="name" cssClass="text-danger" />
						</div>
						<div class="form-inline form-group">
							<label>주소</label>
							<form:input size="25" path="addr" cssClass="form-control pull-right"/>
							<form:errors path="addr" cssClass="text-danger" />
						</div>
						<div class="form-inline form-group">
							<label>전화번호</label>
							<form:input size="25" path="phone" cssClass="form-control pull-right"/>
							<form:errors path="phone" cssClass="text-danger" />
						</div>
						<div class="form-group text-right">
							<button type="submit" class="btn btn-default btn-xs">가입</button>
							<a href="login" class="btn btn-danger btn-xs">뒤로가기</a>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>