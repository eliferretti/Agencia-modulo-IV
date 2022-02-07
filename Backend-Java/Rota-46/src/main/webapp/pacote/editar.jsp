<%@page import="modelo.pacote.Pacote"%>
<%@page import="modelo.persistencia.DAOPacote"%>
<%@page import="java.util.*" %>
  
<%@ include file="cabecalho.jsp" %>
<body>
<%@ include file="menu.jsp" %>
<% 
	String id = request.getParameter("txtId");	
	DAOPacote dao = new DAOPacote(); 
	Pacote p =  dao.ConsultarId(Integer.parseInt(id));   
%>
<div class="container">
<h1 class="titulo-paginas border-bottom">Editar</h1>
<div class="row">
    <div class="col-md-6">
        <form name="form" action="controleralterar" method="post">  
       		<input type="hidden" name="txtId" class="form-control" value="<%=p.getId() %>" />
            <div class="form-group col-md-3">
                <label class="control-label">Id Cliente</label>
                <input type="text" name="txtIdCliente" class="form-control" value="<%=p.getIdCliente() %>" />
            </div>
            <div class="form-group col-md-3">
                <label class="control-label">Id Destino</label>
                <input type="text"  name="txtIdDestino" class="form-control" value="<%=p.getIdDestino() %>" />
            </div>
            <div class="form-group col-md-5">
                <label class="control-label">Data da compra</label>
                <input type="date"  name="txtDataCompra" class="form-control" value="<%=p.getDataCompra() %>" />
            </div>
            <div class="form-group col-md-5">
                <label class="control-label">Data da viagem</label>
                <input type="date"  name="txtDataViagem" class="form-control" value="<%=p.getDataViagem() %>" />
            </div>
            <div class="form-group col-md-3">
                <label class="control-label">Preço</label>
                <input type="text"  type="text" name="txtPreco" class="form-control" value="<%=p.getPreco() %>" />
            </div>
            <div class="form-group col-md-6">
                <input type="submit" value="Alterar" onclick="return verificarcampospacote()" class="btn btn-success" style="width:auto"/>
                 <a class="btn btn-primary" href="listarpacote" >Voltar</a>
            </div>
        </form>    
    </div>
</div>
<br />
</div>
<%@ include file="footer.jsp" %>
</body>