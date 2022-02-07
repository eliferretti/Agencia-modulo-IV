<%@page import="modelo.destino.Destino"%>
<%@page import="modelo.persistencia.DAODestino"%>
<%@page import="java.util.*" %>
<%@page import="java.text.NumberFormat" %>

    
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	<% 
		List<Destino> destinos = (List<Destino>) request.getAttribute("dest");
	%>
<div class="container">
<h1 class="titulo-paginas">Lista de destinos</h1>

<div class="row">
	<div class="col-3">
		<p>
   			 <a class="btn btn-success text-white" href="adicionar.jsp" >Adicionar</a>
		</p>
	</div>
	<div class="col d-flex justify-content-end">		
		<form name="form" action="consultardestino" method="post" class="form-group">
			<div class="d-flex justify-content-end">					
				<input type="text" name="txtTitulo" class="form-control mr-2" placeholder="Informe Destino">	
				<button type="submit" class="btn btn-success" onclick="return verificaconsultardestino()" >Consultar</button>					
			</div>
		</form>	
	</div>
</div>

<div class="overflow-auto">
<table class="table table-striped" >
    <thead class="border-top">
        <tr>
        	<th>
                Id
            </th>
            <th>
                Destino
            </th>
            <th>
                Descrição
            </th>
            <th>
                Tipo
            </th>
            <th>
                Promo
            </th>
            <th>
                Preço
            </th>
            <th></th>
        </tr>
    </thead>
    <tbody>    	
	<% for(Destino d: destinos)
	{
	%>
		<tr>
			<td>
		        <%=d.getId() %>
		    </td>
		    <td>
		        <%=d.getTitulo() %>
		    </td>
		    <td>
		    	<%=d.getDescricao() %>
		    </td>
		    <td>
		    	<%=d.getTipo() %>
		    </td>
		    <td>
		        <%=d.getPromo() %>
		    </td>
		    <td>
			    <%  Locale ptBr = new Locale("pt", "BR");
	           		String valorString = NumberFormat.getCurrencyInstance(ptBr).format(d.getPreco()); %>
		        <%=valorString %>
		    </td>
		    <td>
		    	<div class="row pr-2 justify-content-end">
		    		<div class=" p-1 m-0">
				    	<form action="editar.jsp" method="post">
				    		<input type="hidden" name="txtId" value="<%=d.getId() %>">
				    		<input type="submit" value="Editar" class="btn btn-primary" style="width:70px;">
				    	</form>		    		
		    		</div>
		    		<div class=" p-1 m-0">
				    	<form action="excluir.jsp" method="post">
				    		<input type="hidden" name="txtId" value="<%=d.getId() %>">
				    		<input type="submit" value="Excluir" class="btn btn-danger" style="width:70px;">
				    	</form>		    		
		    		</div>
		    	</div>
		    </td>
		</tr>	
	<%	
	}
	%>
    </tbody>
</table>
</div>
<br />
<br />
<br />
<br />
</div>	
	<%@ include file="footer.jsp" %>
</body>