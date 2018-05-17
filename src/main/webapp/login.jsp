<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
	<title>Insert title here</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/css/signin.css" rel="stylesheet">
    
    <%@ include file = "/include/jquery.jsp" %>
    <%@ include file = "/include/jscookie.jsp" %>
    
    <script>
    $(function(){
		$('#signinbtn').click(function(){
			$('#frm').submit();
		})
    })
    
    
    
    </script>
     

</head>
<body>
    <div class="container">

      <form id="frm" class="form-signin" action="<%=request.getContextPath()%>/loginServlet" method="post">
        <h2 class="form-signin-heading">Board login</h2>
        <label for="userId" class="sr-only">UserId</label>
        <input type="text" id="mem_id" name = "mem_id" class="form-control" placeholder="아이디를 입력해주세요" required autofocus value="a">
        
        <!-- 
        <label for="userId" class="sr-only">UserId</label>
        <input type="text" id="userIdsecond" name = "userId" class="form-control" placeholder="아이디를 입력해주세요" required autofocus>
        -->
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="mem_pass" name = "mem_pass" class="form-control" placeholder="비밀번호를 입력해주세요" required  value="1234">
        <br>
        <button id="signinbtn" class="btn btn-lg btn-primary btn-block" type="button">Sign in</button>
      </form>

    </div> <!-- /container -->
</body>
</html>