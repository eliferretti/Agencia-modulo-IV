
    
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	<% 
		String msg = (String) request.getAttribute("msg"); 
	%>

	<div class="container text-center alert alert-danger mt-5 pt-4 text-danger">
		<h3><%=msg %><a class="btn btn-danger ml-2" href="listarpacote">OK</a></h3>
	</div>
	<%@ include file="footer.jsp" %>
</body>