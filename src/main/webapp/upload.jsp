<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test</title>
</head>
<body>
	<h1>fileupload</h1>
	<form action="file/upload" method="post" enctype="multipart/form-data">
		请选择文件：<input type="file" name="pic"/><br /> 
			<input type="submit" value="upload">
	</form>
</body>
</html>