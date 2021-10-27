<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table width="100%">
	<tr>
		<td><a href='<c:url value="/admin/sitecontrol/siteMainControl"/>'>유저웹관리</a></td>
		<td>
		<a	href='<c:url value="/admin/moviecontrol/movieTimetableView"/>'>영화시간표관리</a></td>
		<td><a href='<c:url value="/admin/alarmcontrol/searchReceiver"/>'>알림전송</a></td>
		<td><a href='<c:url value="/admin/storecontrol/"/>'>스토어관리</a></td>
		<td><a
			href='<c:url value="/admin/salescontrol/salesViewByCate"/>'>매출관리</a></td>
	</tr>
</table>