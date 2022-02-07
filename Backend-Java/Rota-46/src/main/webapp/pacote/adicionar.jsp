<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	<div class="container">
		<h1 class="titulo-paginas border-bottom">Novo pacote</h1>
		<div class="row">
		    <div class="col-md-6">
		        <form name="form" action="controlerincluir" method="post">  
		            <div class="form-group col-md-3">
		                <label class="control-label">Id Cliente</label>
		                <input type="text" name="txtIdCliente" class="form-control" />
		            </div>
		            <div class="form-group col-md-3">
		                <label class="control-label">Id Destino</label>
		                <input type="text"  name="txtIdDestino" class="form-control" />
		            </div>
		            <div class="form-group col-md-5">
		                <label class="control-label">Data da compra</label>
		                <input type="date"  name="txtDataCompra" class="form-control" />
		            </div>
		            <div class="form-group col-md-5">
		                <label class="control-label">Data da viagem</label>
		                <input type="date"  name="txtDataViagem" class="form-control" />
		            </div>
		            <div class="form-group col-md-3">
		                <label class="control-label">Preço</label>
		                <input type="text"  type="text" name="txtPreco" class="form-control" />
		            </div>
		            <div class="form-group col-md-6">
		                <input type="submit" value="Adicionar" onclick="return verificarcampospacote()" class="btn btn-success" style="width:auto"/>
		                <a class="btn btn-primary" href="listarpacote" >Voltar</a>
		            </div>
		        </form>
		    </div>
		</div>
	</div>
	<br />
	<%@ include file="footer.jsp" %>
</body>