<?php
include ("header.php");
?>
<div id="formulario">
    <h2>Login</h2>
    <form method="POST" action="logar.php">
        <label>Usuário:</label>
        <input type="text" name="login" id="login" title="Login" required oninvalid="setCustomValidity('Por favor, preencha o login')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <label>Senha:</label>
        <input type="password" name="senha" id="senha" title="Senha" required oninvalid="setCustomValidity('Por favor, preencha a senha')" onchange="try{setCustomValidity('')}catch(e){}"/><br/>
        <a href="cadastro.php">Não possui uma conta? <span class="underline">Cadastre-se</span></a><br><br>
        <input class="buttom" type="button" onclick="window.location.href = 'index.php'; "value="Cancelar"/>
        <input class="buttom" type="submit" value="Entrar" id="entrar" name="entrar"/><br/>
    </form>
</div>
</body>
</html>
