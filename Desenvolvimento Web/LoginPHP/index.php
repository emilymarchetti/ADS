<?php
include ("header.php");
?>
<div id="formulario">
    <?php
    if (isset($_COOKIE['login'])) {
        $login_cookie = $_COOKIE['login'];
        echo"<h1>Bem-vindo, $login_cookie </h1>";
        echo"<p>Essas informações PODEM ser acessadas por você</p>";
        include ("listausuario.php");
    } else {
        echo"<h1>Bem-vindo, convidado </h1>";
        echo"<p>Essas informações infelizmente não podem ser acessadas por você</p>";
        echo"<p><a href='login.php'>Faça login</a> para ter acesso</p>";
    }
    ?>
</div>        
</body>
</html>  