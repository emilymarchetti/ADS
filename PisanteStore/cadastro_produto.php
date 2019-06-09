<?php
include ("header.php");
?>
<div id="formulario">
    <h2>Cadastre um novo produto</h2>
    <form method="POST" action="cadastrar_produto.php">
        <label>Nome:</label>
        <input type="text" name="nome_produto" id="nome_produto" title="Nome" required oninvalid="setCustomValidity('Por favor, preencha o nome')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Gênero:</label>
        <input type="text" name="genero" id="genero" title="Gênero" required oninvalid="setCustomValidity('Por favor, preencha o gênero')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Marca:</label>
        <input type="text" name="marca" id="marca" title="Marca" required oninvalid="setCustomValidity('Por favor, preencha a marca')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Preço:</label>
        <input type="text" name="preco" id="preco" title="Preço" required oninvalid="setCustomValidity('Por favor, preencha o preço')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Url da Imagem:</label>
        <input type="text" name="foto" id="foto" title="Imagem" required oninvalid="setCustomValidity('Por favor, preencha a url da imagem')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label></label>
        <input type="submit" value="Cadastrar" id="cadastrar" name="cadastrar"/>
    </form>
</div>        
</body>
</html>