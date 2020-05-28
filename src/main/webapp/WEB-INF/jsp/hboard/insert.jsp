<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>EduDashboard :: H-Board Insert</title>

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
					<form method="post" onsubmit="return validate();">
						<input type="hidden" id="id" name="id" value="${member.id}">
						<div class="card shadow mb-4">
			                <div class="card-header py-3">
			                  	<input type="text" id="title" name="title" class="form-control" placeholder="Enter title...">
			                </div>
			                <div class="card-body">
			                  <textarea name="content" id="content" style="margin-top: 0px; margin-bottom: 0px; height: 321px;" class="form-control" placeholder="Enter content..."></textarea>
			                </div>
			                
			                <div class="card-footer">
			                	<div style="text-align: right;">
			                		<input class="btn btn-primary" type="submit" value="저장">
			                		<a href="list" class="btn btn-secondary">취소</a>
			                	</div>
			                </div>
		              	</div>
					</form>
				</div>
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
	function validate() {
		var id = $("#id").val();
		var title = $("#title").val();
		var content = $("textarea#content").val();

		if(id == ""){
			alert("잘못된 접근입니다.");

			return false;
		}
		if(title == ""){
			alert("제목을 입력해주세요.");
			$("#title").focus();

			return false;
		}
		if(content == ""){
			alert("내용을 입력해주세요");
			$("textarea#content").focus();

			return false;
		}

	}
</script>

</html>
