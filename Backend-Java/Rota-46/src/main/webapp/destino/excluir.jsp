<%@page import="modelo.destino.Destino"%>
<%@page import="modelo.persistencia.DAODestino"%>
<%@page import="java.util.*" %>
<%@page import="java.text.NumberFormat" %>
 
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	
<% 
	String id = request.getParameter("txtId");	
	DAODestino dao = new DAODestino(); 
	Destino d = dao.ConsultarId(Integer.parseInt(id));
%>	
	
<div class="container">
<h1 class="titulo-paginas">Excluir</h1>
<h3 class="p-2 rounded text-danger alert-danger">Tem certeza que deseja excluir destino?</h3>
<div>
    <dl class="row">
        <dt class = "col-sm-2">Destino</dt>   <dd class = "col-sm-10"><%=d.getTitulo() %></dd>
        <dt class = "col-sm-2">Descrição</dt> <dd class = "col-sm-10"><%=d.getDescricao() %></dd>
        <dt class = "col-sm-2">Tipo</dt>      <dd class = "col-sm-10"><%=d.getTipo() %></dd>
        <dt class = "col-sm-2">Promoção</dt>  <dd class = "col-sm-10"><%=d.getPromo() %></dd>
        <%  Locale ptBr = new Locale("pt", "BR");
            String valorString = NumberFormat.getCurrencyInstance(ptBr).format(d.getPreco()); %>
        <dt class = "col-sm-2">Preço</dt>     <dd class = "col-sm-10"><%=valorString %></dd>
    </dl>   
    <form action="excluirdestino" method="post">
        <input type="hidden" name="txtId" value="<%=d.getId() %>"/>
        <input type="submit" value="Excluir" class="btn btn-danger" style="width:auto"/> 
        <a class="btn btn-primary" href="listardestino">Voltar</a>
    </form>
</div>
</div>
	<%@ include file="footer.jsp" %>
</body>