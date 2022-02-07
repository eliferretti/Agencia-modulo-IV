<%@page import="modelo.pacote.Pacote"%>
<%@page import="modelo.persistencia.DAOPacote"%>
<%@page import="java.util.*" %>
<%@page import="java.text.NumberFormat" %>


 
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	
<% 
	String id = request.getParameter("txtId");	
	DAOPacote dao = new DAOPacote(); 
	Pacote p = dao.ConsultarId(Integer.parseInt(id));
%>	
	
<div class="container">
<h1 class="titulo-paginas">Excluir</h1>
<h3 class="p-2 rounded text-danger alert-danger">Tem certeza que deseja excluir pacote?</h3>
<div>
    <dl class="row">
        <dt class = "col-sm-2">Id</dt>              <dd class = "col-sm-10"><%=p.getId() %></dd>
        <dt class = "col-sm-2">Id Cliente</dt>      <dd class = "col-sm-10"><%=p.getIdCliente() %></dd>
        <dt class = "col-sm-2">Id Destino</dt>      <dd class = "col-sm-10"><%=p.getIdDestino() %></dd>  
        <dt class = "col-sm-2">Data de compra</dt>  <dd class = "col-sm-10"><%=p.getDataCompra() %></dd>        
        <dt class = "col-sm-2">Data da viagem</dt>  <dd class = "col-sm-10"><%=p.getDataViagem() %></dd>
        <%  Locale ptBr = new Locale("pt", "BR");
            String valorString = NumberFormat.getCurrencyInstance(ptBr).format(p.getPreco()); %>
        <dt class = "col-sm-2">Preço</dt>           <dd class = "col-sm-10"><%=valorString %></dd>
    </dl>   
    <form action="excluirpacote" method="post">
        <input type="hidden" name="txtId" value="<%=p.getId() %>"/>
        <input type="submit" value="Excluir" class="btn btn-danger" style="width:auto"/> 
        <a class="btn btn-primary" href="listarpacote">Voltar</a>
    </form>
</div>
</div>
	<%@ include file="footer.jsp" %>
</body>