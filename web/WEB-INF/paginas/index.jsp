<%-- 
    Document   : index
    Created on : 03/11/2016, 21:05:22
    Author     : Renan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tabletag.com.br/tags" prefix="tag" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Table Tag</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css">
        <link href="css/cabecalho.css" rel="stylesheet" type="text/css">
        <link href="css/rodape.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
            <div>
                <h1>Table Tag</h1>
                <nav>
                    <ul>
                        <li class="active"><a href="index.html">Table Tag</a></li>
                        <li><a href="#simpleTable">Simple Table</a></li>
                        <li><a href="#customTable">Custom Table</a></li>
                        <li><a href="#personalize">Personalize</a></li>
                        <li><a href="#download">Baixar Table Tag</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <main>
            <section>
                <h2>Uso Básico</h2>
                <hr>
                <h3>Como?</h3>
                <code>&lt;%@taglib uri="http://tabletag.com.br/tags" prefix="tag" %></code>
                <h3>Porque?</h3>
                <p>Para utilizar as tags da biblioteca é necessário importá-la nas páginas JSP, utilizando o código acima.</p>
                <div class="information">
                    <a href="">Mais Informações</a>
                </div>
            </section>
            <section id="simpleTable">
                <h2>Simple Table</h2>
                <hr>
                <h3>Exemplo</h3>
                <tag:SimpleTable headList="${listaCabecalho}" bodyList="${listaPessoas}"/>
                <h3>Como?</h3>
                <code>&lt;tag:SimpleTable headList="lista_de_cabeçalhos" bodyList="lista_de_dados"/></code>
                <h3>Porque?</h3>
                <p>Esse é o modo mais simples de se fazer uma tabela através da nossa biblioteca, usando uma lita de dadoss.</p>
                <div class="information">
                    <a href="">Mais Informações</a>
                </div>
            </section>
            <section id="customTable">
                <h2>Custom Table</h2>
                <hr>
                <h3>Exemplo</h3>
                <tag:CustomTable bodyList="${listaPessoas}" customHead="${listaCabecalhoCustom}" presentedOnTable="${arrayPresentedOnTable}" fullHead="${listaCabecalho}"/>
                <h3>Como?</h3>
                <code>&lt;tag:CustomTable bodyList="lista_de_dados" customHead="lista_de_cabeçalhos" presentedOnTable="array_de_dados_mostrados"/></code>
                <h3>Porque?</h3>
                <p>Esse é o modo mais complexo de se fazer uma tabela usando nossa biblioteca, porém é deste modo que você tem mais flexibilidade para personzalizar suas tabelas e usar um filtro de dados por colunas.</p>
                <div class="information">
                    <a href="">Mais Informações</a>
                </div>
            </section>
            <section id="personalize">
                <h2>Personalize</h2>
                <hr>
                <p>Você pode usar CSS para estilizar qualquer componente da nossa biblioteca, como se estivesse utilizando HTML e CSS normalmente. Na <i>customTable</i> existem mais opções de personalização que na <i>simpleTable</i>, acesse a seção de cada um para mais informções.</p>
                <div class="information">
                    <a href="">Mais Informações</a>
                </div>
            </section>
            <section id="download">
                <h2>Download</h2>
                <hr>
                <div>
                    <div id="botaoDownload" class="information">
                        <h3><a href="">Baixe Table Tag</a></h3>
                    </div>
                    <br><small><strong>Versão 1.0 Beta</strong></small>
                </div>
            </section>
        </main>
        <%@include file="../jspf/rodape.jspf" %>
    </body>
</html>
