<?php

//Dados do banco
$host = "localhost";
$user = "root";
$pass = "";
$db = "idw_bd";

//conectando com o banco de dados
$mysqli = new mysqli($host, $user, $pass, $db);

if ($mysqli->connect_errno) {
    echo "Falha na conexão " . $mysqli->connect_errno;
}
?>

