<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	.jumbotron{
		background-color: #fff !important;
	}
</style>
<script type="text/javascript">
	$(function(){
		$('a[id^=delete]').click(function(){
			var no = $(this).attr('id').replace('delete-btn-', '');
			
			$.ajax({
				url:'deleteTodo',
				type:'post',
				data: {todoNo : no},
				dataType: 'json',
				success: function(data){
					console.log(data);
				}
				
			})
		});
	})
</script>
</head>
<body>
	<div class="container">
		<%@ include file="nav.jsp" %>
		<div class="row">
			<div class="col-sm-8">
				<c:forEach var="todo" items="${todoList }">
					<div class="panel panel-default">
						<div class="panel-heading text-center">
							<h3>${todo.title }</h3>
						</div>
						<div class="panel-body text-center">
							<p>${todo.contents }</p>
						</div>
						<div class="panel-footer">
							<div class="form-inline">
								<strong>Start Date : </strong>${todo.startDate }
								<strong style="margin-left: 20px;">End Date : </strong>${todo.endDate }
								<a id="delete-btn-${todo.no }" class="btn btn-danger btn-xs pull-right">삭제</a>
							</div>
						</div>
					</div>
				</c:forEach>
				<c:if test="${empty todoList }">
					<div class="panel panel-danger">
						<div class="panel-heading text-center">
							<h3>todoList is not defind</h3>
						</div>
					</div>
				</c:if>
			</div>
			<div class="col-sm-4">
				<div class="jumbotron text-center">
			  		<h3>일정등록</h3>
				</div>
				<form action="addTodo" method="post" class="form-inline">
					<div class="row">
						<div class="text-center">
							<label>제목</label>
							<input type="text" name="title" id="todoTitle" class="form-control input-sm pull-right" size="25">
						</div>
					</div>
					<div class="row">
						<div class="text-center">
							<label>내용</label>
							<textarea rows="5" name="contents" id="todoContents" class="form-control pull-right" style="width: 198px;"></textarea>
						</div>
					</div>
					<div class="row">
						<label style="margin-left: 70px;">시작날짜</label>
						<input style="width: 198px;" type="date" name="startDate" id="todoStrDate" class="form-control input-sm pull-right" size="25">
					</div>
					<div class="row">
						<label style="margin-left: 70px;">종료날짜</label>
						<input style="width: 198px;" type="date" name="startDate" id="todoStrDate" class="form-control input-sm pull-right" size="25">
					</div>
					<div class="row text-right" style="margin-top: 15px;">
						<button type="submit" class="btn btn-default btn-xs">등록</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>