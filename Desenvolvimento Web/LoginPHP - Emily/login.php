<?php
include ("header.php");
?>
<div id="formulario">
    <h2>Login</h2>
    <form method="POST" action="logar.php">
        <label>Login:</label>
        <input type="text" name="login" id="login" required="required"/><br/>
        <label>Senha:</label>
        <input type="password" name="senha" id="senha" required="required"/><br/>
        <label></label>
        <input type="submit" value="entrar" id="entrar" name="entrar"/><br/>
        <a href="cadastro.php">Cadastre-se<a/>
    </form>
</div>
</body>
</html>
