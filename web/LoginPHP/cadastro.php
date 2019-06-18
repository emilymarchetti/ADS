<?php
include ("header.php");
?>
<div id="formulario">
    <h2>Cadastre-se</h2>
    <form method="POST" action="cadastrar.php">
        <label>Nome:</label>
        <input type="text" name="nome" id="nome" title="Nome" required oninvalid="setCustomValidity('Por favor, preencha o nome')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Login:</label>
        <input type="text" name="login" id="login" title="Login" required oninvalid="setCustomValidity('Por favor, preencha o login')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Senha:</label>
        <input type="password" name="senha" id="senha" title="Senha" required oninvalid="setCustomValidity('Por favor, preencha a senha')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
		<a href="login.php">Já possui uma conta? <span class="underline">Faça login</span></a><br><br>
		<input class="buttom" type="button" onclick="window.location.href = 'index.php'; "value="Cancelar"/>
        <input class="buttom" type="submit" value="Cadastrar" id="cadastrar" name="cadastrar"/>
    </form>
</div>        
</body>
</html>    
