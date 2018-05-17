<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="../../favicon.ico">
	
	<title>Jsp</title>
	
	<!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">
    
    <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
    <%@ include file = "/include/jquery.jsp" %>
    
    <script>
    	$(function(){
    		$('#addCate').on('click', function(){
    			$('#frm').submit();
    		});
    	})
    </script>
    
    
</head>
<body>
	<form id="frm" action="${pageContext.request.contextPath}/InsertCateServlet" method="post" class="form-horizontal" role="form"
				>

		<div class="form-group">
			<label for="Category" name="Category" class="col-sm-2 control-label">게시판명 : </label>
			<div class="col-sm-4">
				<input type="text" name="cate_title" placeholder="ex)자유게시판">
			</div>
		</div>
		
		<div class="form-group">
			<label for="mem_id" name="mem_id" class="col-sm-2 control-label">생성 ID : </label>
			<div class="col-sm-4">
			<label for="cate_mem_id" name="mem_id"><%=session.getAttribute("mem_id")%></label>
			<input type="hidden" name="cate_mem_id" value="<%=session.getAttribute("mem_id")%>">
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button id="addCate" type="button" class="btn btn-default">게시판 생성</button>
			</div>
		</div>
	</form>

</body>
</html>