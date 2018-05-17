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

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <%@ include file = "/include/jquery.jsp" %>
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
    <script>
    	$(function(){
    		$('.act').on('click',function(){
    			$(this).parent().submit();
    			
    		});
    		
    		$('#insertCate').on('click', function(){
    			document.location="${pageContext.request.contextPath}/insertCate.jsp?mem_id=${mem_id}"
    		})
    		
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
          <div class="table-responsive">
            <table class="table table-striped table-hover">
              <thead>
                <tr>
                  <th>게시판번호</th>
                  <th>게시판명</th>
                  <th>게시판생성일</th>
                  <th>생성한 멤버ID</th>
                  <th>게시판 활성여부</th>
                  <th>게시판 활성/비활성화</th>
                  
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${cateList}" var="CateVO" varStatus="loopStatus">
                <tr>
                  <td>${CateVO.cate_seq}</td>
                  <td>${CateVO.cate_mem_id}</td>
                  <td>${CateVO.cate_title}</td>
                  <td>${CateVO.cate_dt}</td>
                  <td>${CateVO.cate_act_yn}</td>
                  <td>
                  	<form action="<%=request.getContextPath()%>/CateActServlet" method="get">
                  		<input type="hidden" value="${CateVO.cate_seq}" name="cate_seq">
                  		<input type="hidden" value="${CateVO.cate_act_yn}" name="cate_act_yn">
	                  	<input type="button" value="활성/비활성" class="act">
                  	</form>
                  </td>
                </tr>
              </c:forEach>

              </tbody>
            </table>
            <input type="button" value="새 게시판 생성" id="insertCate">
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>


</body>
</html>