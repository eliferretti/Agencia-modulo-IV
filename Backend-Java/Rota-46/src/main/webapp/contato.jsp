
<%@ include file="cabecalho.jsp" %>
<body>
	<%@ include file="menu.jsp" %>
    <div class="">
        <main role="main" class="pb-3">


            <section class="conteudo-contato">

                <div class="banner-index">
                    <img src="imagens/contato.jpeg" >
                   
                </div>
        
                <div class="">
                    <div class="">
                            <h1 class="titulo-paginas text-center">Entre em contato conosco</h1>
                    </div>
                    <div class="">
                            <h4 style="text-align:center">Ficaremos felizes e saber o que você tem a nos dizer!</h4>
                    </div>
                    <div class="input-container">
                            <div class="">
                                <div class="styled-input wide">
                                    <input type="text" required />
                                    <label>Nome</label> 
                                </div>
                            </div>
                            <div class="">
                                <div class="styled-input">
                                    <input type="text" required />
                                    <label>Email</label> 
                                </div>
                            </div>
                            <div class="">
                                <div class="styled-input">
                                    <input type="text" required />
                                    <label>Telefone</label> 
                                </div>
                            </div>
                            <div class="">
                                <div class="styled-input wide">
                                    <textarea required></textarea>
                                    <label>Mensagem</label>
                                </div>
                            </div>
                            <button class="btn btn-primary">Enviar</button>
                           
                    </div>
                </div>
           
            </section>
        

        </main>
    </div>
	
	<%@ include file="footer.jsp" %>
</body>
</html>