<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">

    <%@ include file = "/include/jquery.jsp" %>
    <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
    
    <script>
    	$(function(){
    		$('#addCate').on('click', function(){
    			$('#frm').submit();
    		});
    	})
    </script>
    
    
</head>
<body>
<%@ include file="/layout/header.jsp" %>
    <div class="container-fluid">
    
      <div class="row">
  		<%@ include file="/layout/left.jsp" %>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

          <h2 class="sub-header">게시판</h2>
          		<form id="frm" action="${pageContext.request.contextPath}/InsertCateServlet" method="post" class="form-horizontal" role="form">
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
						<div class="col-sm-offset-2 col-sm-4">
							<button id="addCate" type="button" class="btn btn-default">게시판 생성</button>
						</div>
					</div>
				</form>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>

</body>
</html>