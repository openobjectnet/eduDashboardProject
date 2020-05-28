<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../common/topbar.jsp"%>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>EduDashboard:: Detail</title>

  <!-- Custom fonts for this template-->
  <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>
<body>


<div class="row">
	<div class="col-lg-12">
		<h1 class='page-header'>Board Modify Page</h1>
	</div>
	<!-- /. col-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">

			<div class="panel-heading">Board Modify Page</div>
			<!-- /.panel-heading -->
			<div class="panel-body">

				<form role="form" action="/yboard/modify" method="post">
				
				
					<div class="form-group">
						<label>Bno</label><input class="form-control" name='bno'
							value='<c:out value="${board.bno}"/>' readonly="readonly">
					</div>

					<div class="form-group">
						<label>Title</label><input class="form-control" name='title'
							value='<c:out value="${board.title}"/>'>
					</div>

					<div class="form-group">
						<label>Text area</label>
						<textarea class="form-control" rows="3" name='content'><c:out
								value="${board.content}" /></textarea>
					</div>

					
					<button data-oper='modify' class="btn btn-default"
						onclick="location.href='/yboard/modify?bno=<c:out value="${board.bno }"/>'">Modify</button>

					<button data-oper='remove' class="btn btn-info">Remove</button>					
<!-- 					<button data-oper='remove' class="btn btn-info"
						onclick="location.href='/yboard/list'">Remove</button>					 -->
					

					<button data-oper='list' class="btn btn-info"
						onclick="location.href='/yboard/list'">List</button>
				</form>
				
			</div>
			<!-- end panel-body -->
		</div>
		<!-- end panel-body -->
	</div>
	<!-- end panel -->

</div>
<!-- /.row -->

</body>
<script src="../../../resources/vendor/jquery/jquery.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		
	

		var formObj = $("form");

		$('button').on("click", function(e) {

			e.preventDefault();

			var operation = $(this).data("oper");

			console.log(operation);
		
			
			if (operation === 'remove') {
				
				formObj.attr("action", "delete"); 
			} else if (operation === 'list') {
				//move to list
				formObj.attr("action", "/yboard/list").attr("method", "get");				
				
				formObj.empty();
				
			}

			formObj.submit();
		});

	});
</script>