<?php
include ("header.php");
?>
<div id="formulario">
    <h2>Crie um novo conteúdo</h2>
    <form method="POST" action="cadastrarConteudo.php">
        <label>Titulo:</label>
        <input type="text" name="titulo" id="titulo" title="Titulo" required oninvalid="setCustomValidity('Por favor, preencha o titulo')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Conteudo:</label>
        <input type="text" name="conteudo" id="conteudo" title="Conteudo" required oninvalid="setCustomValidity('Por favor, preencha o conteúdo')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Fonte:</label>
        <input type="text" name="fonte" id="fonte" title="Fonte" required oninvalid="setCustomValidity('Por favor, preencha a fonte')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label></label>
        <input type="submit" value="Cadastrar" id="cadastrar" name="cadastrar"/>
    </form>
</div>        
</body>
</html>    
