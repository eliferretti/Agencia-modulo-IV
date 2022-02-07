
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	<% 
		String msg = (String) request.getAttribute("msg"); 
	%>

	<div class="container text-center alert alert-success mt-5 pt-4 text-success">
		<h3><%=msg %><a class="btn btn-success ml-2" href="listardestino">OK</a></h3>
	</div>

	<%@ include file="footer.jsp" %>
</body>