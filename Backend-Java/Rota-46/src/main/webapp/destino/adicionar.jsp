<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
	<div class="container">
		<h1 class="titulo-paginas border-bottom">Novo destino</h1>
		<div class="row">
		    <div class="col-md-6">
		        <form name="form" action="controlerincluir" method="post">  
		            <div class="form-group col-md-6">
		                <label class="control-label">Título</label>
		                <input type="text" name="txtTitulo" class="form-control" />
		            </div>
		            <div class="form-group col-md-12">
		                <label class="control-label">Descrição</label>
		                <textarea name="txtDescricao" class="form-control" rows="3" style="min-height:6em"></textarea>
		            </div>
		            <div class="form-group col-md-4">
		                <label class="control-label">Tipo</label>
		                <select class="custom-select" name="slcTipo">
		                    <option selected>-</option>
		                    <option>Nacional</option>
		                    <option>Internacional</option>
		                </select>
		            </div>
		            <div class="form-group col-md-3">
		                <label class="control-label">Promoção</label>
		                <select class="custom-select" name="slcPromo">
		                    <option selected>-</option>
		                    <option>Sim</option>
		                    <option>Não</option>
		                </select>
		            </div>
		            <div class="form-group col-md-3">
		                <label class="control-label">Preço</label>
		                <input type="text" name="txtPreco" class="form-control" />
		            </div>
		            <div class="form-group col-md-6">
		                <input type="submit" value="Adicionar" onclick="return verificarcamposdestino()" class="btn btn-success" style="width:auto"/>
		                 <a class="btn btn-primary" href="listardestino" >Voltar</a>
		            </div>
		        </form>
		    </div>
		</div>
	</div>
	<br />
	<%@ include file="footer.jsp" %>
</body>