function verificarcampos() {

	var txtNome = form.txtNome.value;
	var txtEndereco = form.txtEndereco.value;
	var txtTelefone = form.txtTelefone.value;
	var txtCPF = form.txtCPF.value;
	var slcSexo = form.slcSexo.value;
	var txtIdade = form.txtIdade.value;
	
	if (txtNome == "") {
		alert('Preencha o campo Nome');
		form.txtNome.focus();
		return false;
	}
		if (txtNome.length < 3) {
		alert('Digite seu nome completo');
		form.txtNome.focus();
		return false;
	}
	if (txtEndereco == "") {
		alert('Preencha o campo Endereço');
		form.txtEndereco.focus();
		return false;
	}
	if (txtTelefone == "") {
		alert('Preencha o campo Telefone');
		form.txtTelefone.focus();
		return false;
	}
	if (txtCPF == "") {
		alert('Preencha o campo CPF');
		form.txtCPF.focus();
		return false;
	}
	if (slcSexo == "-") {
		alert('Selecione o sexo');
		form.slcSexo.focus();
		return false;
	}
	if (txtIdade == "") {
		alert('Preencha o campo Idade');
		form.txtIdade.focus();
		return false;
	}	
	if(isNaN(txtIdade) || !isInt(txtIdade))
	{
		alert('Preencha o campo Idade com valor inteiro');
		form.txtIdade.focus();
		return false;
	}
}

function verificarcamposdestino(){
	var txtTitulo = form.txtTitulo.value;
	var txtDescricao = form.txtDescricao.value;
	var slcTipo = form.slcTipo.value;
	var slcPromo = form.slcPromo.value;
	var txtPreco = form.txtPreco.value;
	
	if(txtTitulo == "")
	{
		alert('Informe o Título.');
		form.txtTitulo.focus();
		return false;
	}
	if(txtDescricao == "")
	{
		alert('Informe a Descrição.');
		form.txtDescricao.focus();
		return false;
	}
	if(slcTipo == "-")
	{
		alert('Selecione o Tipo.');
		form.slcTipo.focus();
		return false;
	}
	if(slcPromo == "-")
	{
		alert('Selecione Sim ou Não');
		form.slcPromo.focus();
		return false;
	}
		if(txtPreco == "" || !isFloat(txtPreco))
	{
		alert('Informe o Preço');
		form.txtPreco.focus();
		return false;
	}	
}

function verificaconsultardestino(){
	var txtTitulo = form.txtTitulo.value;
	if(txtTitulo.length < 3)
	{
		alert('Informe ao menos 3 primeiras letras do destino');
		form.txtTitulo.focus();
		return false;
	}
}

function verificarcampospacote(){
	var txtIdCliente = form.txtIdCliente.value;
	var txtIdDestino = form.txtIdDestino.value;
	var txtDataCompra = form.txtDataCompra.value;
	var txtDataViagem = form.txtDataViagem.value;
	var txtPreco = form.txtPreco.value;
	
	if(txtIdCliente == "")
	{
		alert('Informe Id cliente');
		form.txtIdCliente.focus();
		return false;
	}
		if(txtIdDestino == "")
	{
		alert('Informe Id destino');
		form.txtIdDestino.focus();
		return false;
	}
		if(txtDataCompra == "")
	{
		alert('Informe a data de compra');
		form.txtDataCompra.focus();
		return false;
	}
		if(txtDataViagem == "")
	{
		alert('Informe a data da viagem');
		form.txtDataViagem.focus();
		return false;
	}
		if(txtPreco == "" || !isFloat(txtPreco) )
	{
		alert('Informe preço');
		form.txtPreco.focus();
		return false;
	}
	
}