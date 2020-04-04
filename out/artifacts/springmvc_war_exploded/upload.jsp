<%--
  Created by IntelliJ IDEA.
  User: lyy0217
  Date: 2020-04-05
  Time: 01:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

<form action="uploadImage" method="post" enctype="multipart/form-data">
    选择图片:<input type="file" name="image" accept="image/*"/> <br>
    <input type="submit" value="上传">
</form>
