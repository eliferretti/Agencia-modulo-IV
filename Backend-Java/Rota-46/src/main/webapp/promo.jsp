<%@page import="modelo.destino.Destino"%>
<%@page import="modelo.persistencia.DAODestino"%>
<%@page import="java.util.*" %>	
<%@page import="java.text.NumberFormat" %>
	
	<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
<div class="container">
<h1 class="titulo-paginas text-center">Conheça nossos destinos</h1>
    <div class="row">
        <main class="d-flex flex-wrap justify-content-start col-sm-12">
        
        
	<% 
		List<Destino> destinos = (List<Destino>) request.getAttribute("dest");
	%>        
    <% for(Destino d: destinos)
	{
	%>
        <div class="col-sm-3">
            <div class="bg-light text-center rounded m-2 rounded" style="box-shadow: 3px 3px 3px rgba(0, 0, 0, 0.171);">
                <img src="imagens/turismo.jpg" class="img-fluid mx-auto d-block rounded"/>
                <h4 class="px-1"><%=d.getTitulo() %></h4>
                <p class="px-1 mh-100"><%=d.getDescricao() %></p>
                <%  Locale ptBr = new Locale("pt", "BR");
                	String valorString = NumberFormat.getCurrencyInstance(ptBr).format(d.getPreco()); %>
                <p class="px-1 py-2 bg-danger text-light">Apenas <strong><%=valorString %></strong></p>
            </div>
        </div>	
	<%	
	}
	%>
            
        </main>
    </div>

<br />
<br />
<br />
    
</div>    
	<%@ include file="footer.jsp" %>
</body>