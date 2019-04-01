<?php

$login = $_POST('login');
$senha = md5($_POST)('senha');
$nome = $_POST('nome');

//dados do banco
$host = "localhost";
$user = "root";
$pass = "";
$db = "idw_bd";

//conectando banco de dados
$mysqli = new mysqli($host,$user,$pass,$db);

//consulta banco de dados
$query_select = "SELECT login FROM usuario WHERE login = '$login'";
$query = $mysqli->query($query_select) or die($mysqli->error);
$array = mysqli_fetch_array($query);
$arraylogin = $array['login'];


