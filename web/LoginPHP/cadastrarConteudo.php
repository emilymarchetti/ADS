<?php

$titulo = $_POST['titulo'];
$conteudo =($_POST['conteudo']);
$fonte = $_POST['fonte'];

//Dados do banco
$host = "localhost";
$user = "root";
$pass = "";
$db = "idw_bd";

//conectando com o banco de dados
$mysqli = new mysqli($host, $user, $pass, $db);

//Consulta no banco de dados
$query_select = "SELECT titulo FROM conteudo WHERE titulo = '$titulo'";
$query = $mysqli->query($query_select) or die($mysqli->error);
$array = mysqli_fetch_array($query);
$arraylogin = $array['titulo'];
if ($arraylogin == $titulo) {
    echo"<script language='javascript' type='text/javascript'>"
    . "alert('Esse titulo já existe');window.location.href='cadastroConteudo.php';</script>";
    die();
} else {
    $query_insert = "INSERT INTO conteudo (titulo,conteudo,fonte) VALUES ('$titulo','$conteudo','$fonte')";
    $insert = $mysqli->query($query_insert) or die($mysqli->error);
    if ($insert) {
        echo"<script language='javascript' type='text/javascript'>"
        . "alert('Conteúdo cadastrado com sucesso!');window.location.href='index.php'</script>";
    } else {
        echo"<script language='javascript' type='text/javascript'>"
        . "alert('Não foi possível cadastrar esse conteúdo');window.location.href='cadastroConteudo.php'</script>";
    }
}
?>