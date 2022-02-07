<%@page import="modelo.pacote.PacoteJoin"%>
<%@page import="modelo.persistencia.DAOPacote"%>
<%@page import="java.util.*" %>
<%@page import="java.text.NumberFormat" %>

    
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	<% 
		List<PacoteJoin> pacotesJoin = (List<PacoteJoin>) request.getAttribute("pac");
	%>
<div class="container">
<h1 class="titulo-paginas">Lista de Pacotes</h1>

<div class="row">
	<div class="col-3">
		<p>
   			 <a class="btn btn-success text-white" href="adicionar.jsp" >Adicionar</a>
		</p>
	</div>
	<div class="col d-flex justify-content-end">		
		<form name="form" action="consultarpacote" method="post" class="form-group">
			<div class="d-flex justify-content-end">					
				<input type="text" name="txtId" class="form-control mr-2" placeholder="Informe Id pacote">	
				<button type="submit" class="btn btn-success" >Consultar</button>					
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
                Cliente
            </th>
            <th>
                Destino
            </th>
            <th>
                Data Compra
            </th>
            <th>
                Data Viagem
            </th>
            <th>
                Preço
            </th>
            <th></th>
        </tr>
    </thead>
    <tbody>    	
	<% for(PacoteJoin p: pacotesJoin)
	{
	%>
		<tr>
			<td>
		        <%=p.getId() %>
		    </td>
		    <td>
		        <%=p.getNomeCliente() %>
		    </td>
		    <td>
		    	<%=p.getTituloDestino() %>
		    </td>
		    <td>
		    
		    	<%=p.getDataCompra() %>
		    </td>
		    <td>
		    	<%=p.getDataViagem() %>
		        
		    </td>
		    <td><%  Locale ptBr = new Locale("pt", "BR");
                	String valorString = NumberFormat.getCurrencyInstance(ptBr).format(p.getPreco()); %>
		        <%=valorString %>
		    </td>
		    <td>
		    	<div class="row pr-2 justify-content-end">
		    		<div class=" p-1 m-0">
				    	<form action="editar.jsp" method="post">
				    		<input type="hidden" name="txtId" value="<%=p.getId() %>">
				    		<input type="submit" value="Editar" class="btn btn-primary" style="width:70px;">
				    	</form>		    		
		    		</div>
		    		<div class=" p-1 m-0">
				    	<form action="excluir.jsp" method="post">
				    		<input type="hidden" name="txtId" value="<%=p.getId() %>">
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