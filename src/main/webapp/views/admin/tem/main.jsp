<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인템플릿이다.</title>
</head>
<body>
메인 temp ${AdmUrlData.cate }/${AdmUrlData.service }

<table border="">
	<tr>
		<td colspan="2">
			<jsp:include page="inc/top.jsp"/>
		</td>
	</tr>
	<tr>
		<td width="200"><jsp:include page="inc/menu.jsp"/></td>
		
		<c:if test="${not empty admUrlData }">
		나온다
		<td width="800"><jsp:include page="../../admin/${admUrlData.cate }/${admUrlData.service }.jsp"/></td>
	
		</c:if>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="inc/bottom.jsp"/>
		</td>
	</tr>
</table>
<!-- 
<c:choose>    <c:when test="${name eq '홍길동'}">
        홍길동이 맞습니다.
    </c:when>

    <c:when test="${name eq '철수'}">
        홍길동이 아닙니다.
    </c:when>

    <c:otherwise>
        사람이 없습니다 ㅜㅜ
    </c:otherwise>
</c:choose>
 -->

</body>
</html>