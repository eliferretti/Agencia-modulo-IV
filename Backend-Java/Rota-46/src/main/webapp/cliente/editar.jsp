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
<h1 class="titulo-paginas border-bottom">Editar</h1>
<div class="row">
    <div class="col-md-6">
        <form name="form" action="alterarcliente" method="post">
            <input type="hidden" name="txtId" value="<%=cliente.getId() %>" />
            <div class="form-group col-md-6">
                <label class="control-label">Nome</label>
                <input name="txtNome" value="<%=cliente.getNome() %>" class="form-control" />
            </div>
            <div class="form-group col-md-12">
                <label class="control-label">Endereço</label>
                <input name="txtEndereco" value="<%=cliente.getEndereco() %>" class="form-control" />
            </div>
            <div class="form-group col-md-4">
                <label class="control-label">Telefone</label>
                <input name="txtTelefone" value="<%=cliente.getTelefone() %>" class="form-control" />
            </div>
            <div class="form-group col-md-4">
                <label class="control-label">CPF</label>
                <input name="txtCPF" value="<%=cliente.getCpf() %>" class="form-control" />
            </div>
            <div class="form-group col-md-3">
                <label class="control-label">Sexo</label>
                <select class="custom-select" name="slcSexo">
                    <option selected><%=cliente.getSexo() %></option>
                    <option>-</option>
                    <option>M</option>
                    <option>F</option>
                </select>
            </div>
            <div class="form-group col-md-3">
                <label class="control-label">Idade</label>
                <input name="txtIdade" value="<%=cliente.getIdade() %>" class="form-control" />
            </div>
            <div class="form-group col-md-6">
                <input type="submit" value="Salvar" onclick="return verificarcampos()" class="btn btn-success" style="width:auto" />
                <a class="btn btn-primary" href="listarcliente">Voltar</a>
            </div>
        </form>
    </div>
</div>
<br />
</div>
<%@ include file="footer.jsp" %>
</body>