<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/index3.css">
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	
	function morder(orderName){
		
		var orderMethod ='${vo.orderMethod}';
		orderMethod = orderMethod=='desc'?'asc':'desc';
		
		location.href="/list?orderName="+orderName+"&orderMethod="+orderMethod;
	}
</script>
</head>
<body>
	
	<form action="/list" method="post">
		电影名称：<input type="text" name="name" value="${vo.name}"> &nbsp;上映时间<input type="text" name="t1" value="${vo.t1}">--<input type="text" name="t2" value="${vo.t2}"><br>
		导演：<input type="text" name="acter" value="${vo.acter}"> &nbsp;价格<input type="text" name="p1" value="${vo.p1}">--<input type="text" name="p2" value="${vo.p2}"><br>
		电影年代：<input type="text" name="years"> &nbsp;电影时长<input type="text" name="l1" value="${vo.l1}">--<input type="text" name="l2" value="${vo.l2}"><br>
		<button type="submit" class="btn btn-info">查询</button>
	</form>

	<table>
		<tr>
			<td>序号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td><a href="javascript:morder('price')">票价</a></td>
			<td>上映时间</td>
			<td>电影时长</td>
			<td>年代</td>
			<td>类型</td>
			<td>区域</td>
			<td>状态</td>
		</tr>
		<c:forEach items="${list}" var="m" varStatus="i">
			<tr>
				<td>${i.count}</td>
				<td>${m.name}</td>
				<td>${m.acter}</td>
				<td>${m.price}</td>
				<td>${m.uptime}</td>				
				<td>${m.longtime}</td>				
				<td>${m.years}</td>
				<td>${m.type}</td>
				<td>${m.area}</td>
				<td>${m.status}</td>
			</tr>
		</c:forEach>
		<tr>
			<td></td>
		</tr>
	</table>
</body>
</html>