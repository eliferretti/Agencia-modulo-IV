<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	<div class="container">
		<h1 class="titulo-paginas border-bottom">Novo cliente</h1>
		<div class="row">
		    <div class="col-md-6">
		        <form name="form" action="controlerincluir" method="post">  
		            <div class="form-group col-md-6">
		                <label class="control-label">Nome</label>
		                <input type="text" name="txtNome" class="form-control" />
		            </div>
		            <div class="form-group col-md-12">
		                <label class="control-label">Endereço</label>
		                <input type="text" name="txtEndereco" class="form-control" />
		            </div>
		            <div class="form-group col-md-4">
		                <label class="control-label">Telefone</label>
		                <input type="text" name="txtTelefone" class="form-control" />
		            </div>
		            <div class="form-group col-md-4">
		                <label class="control-label">CPF</label>
		                <input type="text" name="txtCPF" class="form-control" />
		            </div>
		            <div class="form-group col-md-3">
		                <label class="control-label">Sexo</label>
		                <select class="custom-select" name="slcSexo">
		                    <option selected>-</option>
		                    <option>M</option>
		                    <option>F</option>
		                </select>
		            </div>
		            <div class="form-group col-md-3">
		                <label class="control-label">Idade</label>
		                <input type="text" name="txtIdade" class="form-control" />
		            </div>
		            <div class="form-group col-md-6">
		                <input type="submit" value="Adicionar" onclick="return verificarcampos()" class="btn btn-success" style="width:auto"/>
		                 <a class="btn btn-primary" href="listarcliente" >Voltar</a>
		            </div>
		        </form>
		    </div>
		</div>
	</div>
	<br />
	<%@ include file="footer.jsp" %>
</body>