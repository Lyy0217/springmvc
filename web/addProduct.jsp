<%--
  Created by IntelliJ IDEA.
  User: lyy0217
  Date: 2020-04-05
  Time: 00:35
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

<form action="product/addProduct" method="post">

    产品名称 ：<input type="text" name="name" value=""><br/>
    产品价格： <input type="text" name="price" value=""><br/>

    <input type="submit" value="增加商品">
</form>
