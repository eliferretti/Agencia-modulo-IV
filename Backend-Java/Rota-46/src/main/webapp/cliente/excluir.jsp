<%@page import="modelo.cliente.Cliente"%>
<%@page import="modelo.persistencia.DAOCliente"%>
<%@page import="java.util.*" %>
  
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	
<% 
	String id = request.getParameter("txtId");	
	DAOCliente dao = new DAOCliente(); 
	Cliente cliente = dao.consultarcliente(Integer.parseInt(id));
%>	
	
<div class="container">
<h1 class="titulo-paginas">Excluir</h1>
<h3 class="p-2 rounded text-danger alert-danger">Tem certeza que deseja excluir cliente?</h3>
<div>
    <dl class="row">
        <dt class = "col-sm-2">Nome</dt>     <dd class = "col-sm-10"><%=cliente.getNome() %></dd>
        <dt class = "col-sm-2">Endereço</dt> <dd class = "col-sm-10"><%=cliente.getEndereco() %></dd>
        <dt class = "col-sm-2">Telefone</dt> <dd class = "col-sm-10"><%=cliente.getTelefone() %></dd>
        <dt class = "col-sm-2">CPF</dt>      <dd class = "col-sm-10"><%=cliente.getCpf() %></dd>
        <dt class = "col-sm-2">Sexo</dt>     <dd class = "col-sm-10"><%=cliente.getSexo() %></dd>
        <dt class = "col-sm-2">Idade</dt>    <dd class = "col-sm-10"><%=cliente.getIdade() %></dd>
    </dl>   
    <form action="excluircliente" method="post">
        <input type="hidden" name="txtId" value="<%=cliente.getId() %>"/>
        <input type="submit" value="Excluir" class="btn btn-danger" style="width:auto"/> 
        <a class="btn btn-primary" href="listarcliente">Voltar</a>
    </form>
</div>
</div>
	<%@ include file="footer.jsp" %>
</body>