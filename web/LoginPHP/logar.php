<?php

$login = $_POST['login'];
$senha = MD5($_POST['senha']);
$entrar = $_POST['entrar'];

include("conexao.php");

if (isset($entrar)) {

    //Consulta no banco de dados
    $query_select = "SELECT * FROM usuario WHERE login = '$login' AND senha = '$senha'";
    $select = $mysqli->query($query_select) or die($mysqli->error);
    if (mysqli_num_rows($select) <= 0) {
        echo"<script language='javascript' type='text/javascript'>"
        . "alert('Login e/ou senha incorretos');window.location.href='login.php';</script>";
        die();
    } else {
        $array = mysqli_fetch_array($select);
        $arrayNome = $array['nome'];
        $expira = time() + 120; //segundos
        setcookie("login", $arrayNome, $expira);
        header("Location:index.php");
    }
}
?>