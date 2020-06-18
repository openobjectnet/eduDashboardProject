<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EduDashBoard :: Mentoring Budget Management List</title>



<!-- Custom fonts for this template -->
<link href="/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link
	href="/resources/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">
	
	
	
	<!-- Bootstrap core JavaScript-->
	<script src="/resources/vendor/jquery/jquery.min.js"></script>
	<script
		src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="/resources/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script
		src="/resources/vendor/datatables/jquery.dataTables.min.js"></script>
	<script
		src="/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="/resources/js/demo/datatables-demo.js"></script>

<script type="text/javascript">



$(function(){
	alert("나왕!!");
	$.ajax({
	    url:"/mentoring/list2",
	    type:'post',
	    
	    success:function(result){
	        alert("성공이얌");
	        console.log("list!!!");
	      
	    },
	    error:function(e){
	        alert("실패얌"+e);
	    },
	    complete: function(){
	        alert("완료얌");
	    }

	});
});


</script>

</head>
<h1>ㄴㅇㅇㅇ</h1>
<%-- <body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<%@ include file="../common/sidebar.jsp"%>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<%@ include file="../common/topbar.jsp"%>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-2 text-gray-800">Mentoring Budget Management Page</h1>

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<!-- <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">H-Board List</h6>
            </div> -->
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-bordered" id="dataTable" width="100%"
									cellspacing="0">
									<thead align="center">
										<tr>
											<th style="width: 5px"></th>
											<th>index</th>
											<th>날짜</th>
											<th>적요</th>
											<th>금액</th>
											<th>비고</th>
										</tr>
									</thead>
									<tbody align="center">
										<c:forEach items="${list}" var="list">
											<tr>
												<td>${list.idx}</td>
												<td>${list.orderdate}</td>
												<td>${list.orderrecord}</td>
												<td>${list.price}</td>
												<td>${list.remark}</td>
										</c:forEach>
									</tbody>
								</table>


							</div>
						</div>
						<div class="card-footer">
							<div style="text-align: right;">
								<c:if test="${not empty member.id}">
									<a href="insert" class="btn btn-primary">등록</a>
								</c:if>
							</div>
						</div>
					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<%@ include file="../common/footer.jsp"%>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	

</body> --%>





</html>