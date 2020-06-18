<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Member Info Page</title>

<!-- Custom fonts for this template-->
<link href="/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Bootstrap core JavaScript-->
<script src="/resources/vendor/jquery/jquery.min.js"></script>
<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
<!-- Custom scripts for all pages-->
<script src="/resources/js/sb-admin-2.min.js"></script>




</head>

<body class="bg-gradient-primary">

	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
							<div class="col-lg-6">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">${member.name}님의
											마이페이지입니다.</h1>
									</div>
									<form class="user">
										<div class="form-group">
											<input type="hidden" id="mno" name="mno"
												value="${member.mno}"> Name <input type="name"
												class="form-control form-control-user" id="name" name='name'
												value="${member.name}" readonly="readonly">
										</div>
										<div class="form-group">
											ID<input type="id" class="form-control form-control-user"
												id="id" name='id' value="${member.id}" readonly="readonly">
										</div>
										<div class="form-group">
											E-mail<input type="email"
												class="form-control form-control-user" name='email'
												id="email" value="${info.email}" readonly="readonly">
										</div>

										<div class="form-group">
											Birth <input type="date"
												class="form-control form-control-user" name='birth'
												id="birth" value="${info.birth}" readonly="readonly">
										</div>
										<div class="form-group">
											Job <input type="job" class="form-control form-control-user"
												name='job' id="job" value="${info.job}" readonly="readonly">
										</div>

									</form>
									<hr>

									<div class="text-center">
										<%--  <a href="/info/modify?mno=${member.mno }" class="btn btn-primary btn-user btn-block">수정페이지로 이동
                    </a> --%>                    					
										<button id="regBtn" class='btn btn-info'>Register</button>																											
										<button id="modBtn" class='btn btn-info'>Modify</button>
									</div>
								</div>
							</div>
						</div>

						<!-- Modal -->
						<!-- Register Modal -->
						<div class="modal fade" id="modalRegisterForm" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<form role="form" method="post" action="/info/register">
										<div class="modal-header text-center">
											<h4 class="modal-title w-100 font-weight-bold">Register
												Info</h4>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<div class="modal-body mx-3">

											<div class="md-form mb-5">
												<i class="fas fa-user prefix grey-text"></i> <input
													type="text" id="job" name='job'
													class="form-control validate" placeholder="your job">
												<input type="hidden" id="mno" name="mno"
													value="${member.mno}">
											</div>

											<div class="md-form mb-5">
												<i class="fas fa-envelope prefix grey-text"></i> <input
													type="email" id="email" name='email'
													class="form-control validate" placeholder="your email">

											</div>

											<div class="md-form mb-5">
												<i class="fas fa-tag prefix grey-text"></i> <input
													type="date" id="birth" name='birth'
													class="form-control validate" placeholder="your birth">

											</div>



										</div>
										<div class="modal-footer d-flex justify-content-center">
											<button class="btn btn-info" type="submit">
												Register <i class="fas fa-paper-plane-o ml-1"></i>
											</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<!-- /.Register Modal -->

						<!-- Modify Modal -->
						<div class="modal fade" id="modalModifyForm" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<form role="form" id="modifyForm">
										<input type="hidden" id='mno' name='mno' value='${member.mno}'>
										<div class="modal-header text-center">
											<h4 class="modal-title w-100 font-weight-bold">Modify
												Info</h4>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<div class="modal-body mx-3">
											<div class="md-form mb-5">
												<i class="fas fa-user prefix grey-text"></i> <input
													type="text" id="job" name='job'
													class="form-control validate"> <label
													data-error="wrong" data-success="right" for="form34">Your
													job</label>
											</div>

											<div class="md-form mb-5">
												<i class="fas fa-envelope prefix grey-text"></i> <input
													type="email" id="email" name='email'
													class="form-control validate"> <label
													data-error="wrong" data-success="right" for="form29">Your
													email</label>
											</div>

											<div class="md-form mb-5">
												<i class="fas fa-tag prefix grey-text"></i> <input
													type="date" id="birth" name='birth'
													class="form-control validate"> <label
													data-error="wrong" data-success="right" for="form32">Birth</label>
											</div>



										</div>
										<div class="modal-footer d-flex justify-content-center">
											<button class="btn btn-info" onclick="modify();">
												Modify <i class="fas fa-paper-plane-o ml-1"></i>
											</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<!-- /.Modify modal -->
						<!-- /.Modal -->

					</div>
				</div>

			</div>

		</div>

	</div>
</body>


<script type="text/javascript">
	$(function(){
		$('#regBtn').click(function() {
			$('#modalRegisterForm').modal();
		});

		$('#modBtn').click(function() {
			$('#modalModifyForm').modal();
		});
	
	});
	
	
//수정 ajax 처리
function modify(){
/* 	var requestData = {};
	$.each($('#modalModifyForm input'),function(index,value){
		requestData[$(value).attr('name')] = $(value).val();
	});
	 */
	/* var requestData =  $('modalModifyForm input').serialize();
	 
	$.ajax({
		url:'/info/modify',
		type:'post',
		data:requestData,		
		success:function(result){
			alert("성공이얌");
		},
		error:function(e){
			alert("실패얌"+e);
		},
		complete: function(){
			alert("완료얌");
		}
		
	}); */
	
	var requestData = {};
	$.each($('#modalModifyForm input'), function(index, value) {
	    requestData[$(value).attr('name')] = $(value).val();
	});
	$.ajax({
	    url:"/info/modify",
	    type:'post',
	    data: requestData,
	    success:function(result){
	        alert("성공이얌");
	        $('#modalModifyForm').modal("hide");
	    },
	    error:function(e){
	        alert("실패얌"+e);
	    },
	    complete: function(){
	        alert("완료얌");
	    }

	});
	
	return false;
	
}
	
/* 	function AjaxCallBack(result){
		//제이쿼리 비우고 받아온 데이터 append
		//1. result안에있는 값	
		$("#email").html();
		$("#birth").html();
		$("#job").html();
		
		$("#email").empty();
		$("#birth").empty();
		$("#job").empty();
		
		$("#email").append(result.email);
		$("#birth").append(result.birth);
		$("#job").append(result.job);
		
	} */
</script>
</html>
