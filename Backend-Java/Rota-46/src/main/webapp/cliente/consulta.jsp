<%@page import="modelo.cliente.Cliente"%>
<%@page import="modelo.persistencia.DAOCliente"%>
<%@page import="java.util.*" %>

	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
<% 

	Cliente c = (Cliente) request.getAttribute("cli");
%>	
<div class="container">
<h1 class="titulo-paginas">Consulta</h1>

<div class="row">
	<div class="col-3">
		<p>
   			 <a class="btn btn-success text-white" href="adicionar.jsp" >Adicionar</a>
		</p>
	</div>
	<div class="col d-flex justify-content-end">		
		<form action="" method="post" class="form-group">
			<div class="d-flex justify-content-end">					
				<input type="text" name="txtCPF" class="form-control mr-2" placeholder="Informe CPF">	
				<button type="submit" class="btn btn-success">Consultar</button>					
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
                Nome
            </th>
            <th>
                Endereco
            </th>
            <th>
                Telefone
            </th>
            <th>
                CPF
            </th>
            <th>
                Sexo
            </th>
            <th>
                Idade
            </th>
            <th></th>
        </tr>
    </thead>
    <tbody>    	
		<tr>
			<td>
		        <%=c.getId() %>
		    </td>
		    <td>
		        <%=c.getNome() %>
		    </td>
		    <td>
		        <%=c.getEndereco() %>
		    </td>
		    <td>
		    	<%=c.getTelefone() %>
		    </td>
		    <td>
		        <%=c.getCpf() %>
		    </td>
		    <td>
		        <%=c.getSexo() %>
		    </td>
		    <td>
		        <%=c.getIdade() %>
		    </td>
		    <td>
		    	<div class="row pr-2 justify-content-end">
		    		<div class="p-1 m-0">
				    	<form action="editar.jsp" method="post">
				    		<input type="hidden" name="txtId" value="<%=c.getId() %>">
				    		<input type="submit" value="Editar" class="btn btn-primary" style="width:70px;">
				    	</form>		    		
		    		</div>
		    		<div class="p-1 m-0">
				    	<form action="excluir.jsp" method="post">
				    		<input type="hidden" name="txtId" value="<%=c.getId() %>">
				    		<input type="submit" value="Excluir" class="btn btn-danger" style="width:70px;">
				    	</form>		    		
		    		</div>
		    	</div>
		    </td>
		</tr>	
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