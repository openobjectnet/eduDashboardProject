<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<style type="text/css">
input.form-control[readonly], textarea.form-control[readonly] { 
  background-color: #fff;
}
</style>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>EduDashboard :: H-Board Read</title>

  <!-- Custom fonts for this template-->
  <link href="../../../resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="../../../resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

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
          <h1 class="h3 mb-4 text-gray-800">H-Board Page</h1>
			
			<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body">
			<div class="row">
				<div class="col-lg-12">
						<input type="hidden" id="id" name="id" value="${member.id}">
						<input type="hidden" id="bno" name="bno" value="${vo.bno}">
						<div class="card shadow mb-4">
			                <div class="card-header py-3">
			                  	<%-- <input type="text" readonly="readonly" class="form-control" value="${vo.title}"> --%>
			                  	&nbsp;&nbsp;${vo.title}
			                </div>
			                <div class="card-body">
			                  <textarea readonly="readonly" name="content" id="content" style="margin-top: 0px; margin-bottom: 0px; height: 321px;" class="form-control" placeholder="Enter content...">${vo.content }</textarea>
			                </div>
			                
			                <div class="card-footer">
			                	<div style="text-align: right;">
			                		<button class="btn btn-danger" id="btn-danger">삭제</button>
			                		<a href="update?bno=${vo.bno}" class="btn btn-primary">수정</a>
			                		<a href="list" class="btn btn-secondary">목록</a>
			                	</div>
			                </div>
		              	</div>
				</div>
			</div>
			</div>
			</div>
        </div>ea
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
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="../../../resources/vendor/jquery/jquery.min.js"></script>
  <script src="../../../resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="../../../resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="../../../resources/js/sb-admin-2.min.js"></script>

</body>

<script type="text/javascript">
$("#btn-danger").click(function(){
	var cf = confirm("삭제하시겠습니까?");
	var bno = $("#bno").val();
	if(cf == true) {
		location.href = "delete?bno="+bno;
	} else {
		return false;
	}
});
</script>

</html>
