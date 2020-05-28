<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%-- <%@include file="../includes/header.jsp"%> --%>
<%@include file="../common/topbar.jsp"%>


<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>EduDashboard:: List</title>

  <!-- Custom fonts for this template-->
  <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>
<body>
<div class="row">
	<div class="col-lg-12">
	
		<h1 class="page-header">Tables</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">


	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				Board List Page
				<button id='regBtn' type="button" class="btn btn-xs pull-right">Register
					New Board</button>
			</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<table class="table table-stripped table-bordered table-hover">
					<thead>
						<tr>
							<th>#번호</th>
							<th>제목</th>							
							<th>작성일</th>
							<th>수정일</th>
						</tr>
					</thead>

					<c:forEach items="${list}" var="board">
						<tr>
							<td><c:out value="${board.bno}" /></td>
							<%-- <td><a class='move' href='<c:out value="${board.bno}"/>'>
									<c:out value="${board.title}" />
							</a></td> --%>
							<td><a href="get?bno=${board.bno}">${board.title}</a></td>
							<td><fmt:formatDate pattern="yyyy-MM-dd"
									value="${board.reg_date }" /></td>
							<td><fmt:formatDate pattern="yyyy-MM-dd"
									value="${board.mod_date }" /></td>
						</tr>
					</c:forEach>
				</table>
				<!-- table 태그의 끝 -->


				<form action="actionForm" action="/board/list" method='get'>
					<input type="hidden" id='bno' name='bno' value='<c:out value="${board.bno }"/>'>
				</form>


 
			</div>
			<!-- end panel-body -->
		</div>
		<!-- end panel -->
	</div>
</div>
<!-- /.row -->
 <!-- Bootstrap core JavaScript-->
  <script src="/resources/vendor/jquery/jquery.min.js"></script>
  <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="/resources/js/sb-admin-2.min.js"></script>
    
</body>
<%@include file="../common/footer.jsp" %>
<script type="text/javascript">
	$(document).ready(
					function() {				
						var actionForm = $("#actionForm");

						$("#regBtn").on("click", function() {
							self.location = "/yboard/register";
						});						
					

						$(".move").on("click",function(e) {

											e.preventDefault();
											actionForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+ "'>");
											actionForm.attr("action","/yboard/get");
											actionForm.submit();
										});						
					
					
					});
</script>




