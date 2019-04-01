<?php
include ("header.php");
?>
<div id="formulario">
    <h2>Cadastro</h2>
    <form method="POST" action="cadastrar.php">
        <label>Nome:</label>
        <input type="text" name="nome" id="nome" required="required"/><br/>
        <label>Login:</label>
        <input type="text" name="login" id="login" required="required"/><br/>
        <label>Senha:</label>
        <input type="password" name="senha" id="senha" required="required"/><br/>
        <label></label>
        <input type="submit" value="cadastrar" id="entrar" name="cadastrar"/><br/>
    </form>
</div>
</body>
</html>
