<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<h1>나는 ${admUrlData.cate }</h1>
<table width="100%">
<c:forEach items="${subMenu }" var="mm">
<tr>
	<td><a href='<c:url value="/admin/${admUrlData.cate}/${mm.url }"/>'>${mm.ttt }</a></td>
</tr>
</c:forEach>
</table>