<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shopping Cart</title>
</head>
<body>
	<p>
		<a href="${pageContext.request.contextPath }/modelList">Product List</a>
	</p>
	<table width="50%" border="1">
		<tr bgcolor="#cccccc">
			<td>Model Description</td>
			<td>Quantity</td>
			<td>Unit Price</td>
			<td>Total</td>
		</tr>
		<c:forEach items="${db}" var="item">
			<form name="item" method="post" action="cartController">
				<tr>
					<td>
						<c:out value="${item.strModelDescription}"></c:out> 
						<input type="hidden" name= "id" value="${item.id}">
					</td>
					<td>
						<input type="text" name="iQuantity" value='<c:out value="${item.iQuantity}"></c:out>'><br>
						<input type="submit" name="action" value="Update"> 
						<input type="submit" name="action" value="Delete">
					</td>
					<td>
						<c:out value="${item.dbUnitCost}"></c:out>
					</td>
					<td>
						<c:out value="${item.dbTotalCost}"></c:out>
					</td>
				</tr>
			</form>
		</c:forEach>
		<tr>
			<td colspan="2"></td>
			<td></td>
			<td>
				<%double total =(double) request.getAttribute("total");%>
				Subtotal: <%=total %>
			</td>
		</tr>
	</table>
</body>
</html>