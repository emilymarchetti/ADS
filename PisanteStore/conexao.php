<?php

$host = "localhost";
$user = "root";
$pass = "";
$db = "pisante_db";

$mysqli = new mysqli($host, $user, $pass, $db);

if ($mysqli->connect_errno) {
    echo "Falha na conexão " . $mysqli->connect_errno;
}
?>