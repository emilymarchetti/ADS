<?php

$login = $_POST['login'];
$senha = MD5($_POST['senha']);
$nome = $_POST['nome'];

//Dados do banco
$host = "localhost";
$user = "root";
$pass = "";
$db = "idw_bd";

//conectando com o banco de dados
$mysqli = new mysqli($host, $user, $pass, $db);

//Consulta no banco de dados
$query_select = "SELECT login FROM usuario WHERE login = '$login'";
$query = $mysqli->query($query_select) or die($mysqli->error);
$array = mysqli_fetch_array($query);
$arraylogin = $array['login'];
if ($arraylogin == $login) {
    echo"<script language='javascript' type='text/javascript'>"
    . "alert('Esse login já existe');window.location.href='cadastro.php';</script>";
    die();
} else {
    $query_insert = "INSERT INTO usuario (login,senha,nome) VALUES ('$login','$senha','$nome')";
    $insert = $mysqli->query($query_insert) or die($mysqli->error);
    if ($insert) {
        echo"<script language='javascript' type='text/javascript'>"
        . "alert('Usuário cadastrado com sucesso!');window.location.href='login.php'</script>";
    } else {
        echo"<script language='javascript' type='text/javascript'>"
        . "alert('Não foi possível cadastrar esse usuário');window.location.href='cadastro.php'</script>";
    }
}
?>