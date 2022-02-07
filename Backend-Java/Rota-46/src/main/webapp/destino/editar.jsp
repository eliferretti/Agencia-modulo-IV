<%@page import="modelo.destino.Destino"%>
<%@page import="modelo.persistencia.DAODestino"%>
<%@page import="java.util.*" %>
  
<%@ include file="cabecalho.jsp" %>
<body>
<%@ include file="menu.jsp" %>
<% 
	String id = request.getParameter("txtId");	
	DAODestino dao = new DAODestino(); 
	Destino d =  dao.ConsultarId(Integer.parseInt(id));   
%>
<div class="container">
<h1 class="titulo-paginas border-bottom">Editar</h1>
<div class="row">
    <div class="col-md-6">
	    <form name="form" action="controlereditar" method="post">  
	    	<input type="hidden" name="txtId" value="<%=d.getId() %>" class="form-control" />
	        <div class="form-group col-md-6">
	            <label class="control-label">Título</label>
	            <input type="text" name="txtTitulo" value="<%=d.getTitulo() %>" class="form-control" />
	        </div>
	        <div class="form-group col-md-12">
	            <label class="control-label">Descrição</label>
	            <textarea name="txtDescricao" class="form-control" rows="3" style="min-height:6em"><%=d.getDescricao() %></textarea>
	        </div>
	        <div class="form-group col-md-4">
	            <label class="control-label">Tipo</label>
	            <select class="custom-select" name="slcTipo">
	                <option selected><%=d.getTipo() %></option>
	                <option>Nacional</option>
	                <option>Internacional</option>
	            </select>
	        </div>
	        <div class="form-group col-md-3">
	            <label class="control-label">Promoção</label>
	            <select class="custom-select" name="slcPromo">
	                <option selected><%=d.getPromo() %></option>
	                <option>Sim</option>
	                <option>Não</option>
	            </select>
	        </div>
	        <div class="form-group col-md-3">
	            <label class="control-label">Preço</label>
	            <input type="text" name="txtPreco" value="<%=d.getPreco() %>" class="form-control" />
	        </div>
	        <div class="form-group col-md-6">
	            <input type="submit" value="Salvar" onclick="return verificarcamposdestino()" class="btn btn-success" style="width:auto"/>
	             <a class="btn btn-primary" href="listardestino" >Voltar</a>
	        </div>
	    </form>
    </div>
</div>
<br />
</div>
<%@ include file="footer.jsp" %>
</body>