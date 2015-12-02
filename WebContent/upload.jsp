<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload</title>
</head>
<body background="paper.jpg">
    <center><h1 style="background:color-blue">Project Management</h1>
    </center>
    <center>
        <form method="post" action="UploadDownloadFileServlet" enctype="multipart/form-data">
            Select file to upload: 
            <input type="file" name="uploadFile" /><br/>
          
           <input class="pager" type="submit" value="Upload" />
           
        </form>
    
<c:forEach items="${file}" var="item">
     ${file} 
    
    </c:forEach>
    
    
    
    </center>
</body>
</html>