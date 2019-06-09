<?php
include ("conexao.php");

$nome_produto = strtoupper(($_POST['nome_produto']));
$genero = strtoupper(($_POST['genero']));
$marca = strtoupper(($_POST['marca']));
$preco = ($_POST['preco']);
$foto = ($_POST['foto']);

$query_select = "SELECT nome_produto FROM produto WHERE nome_produto = '$nome_produto'";
$query = $mysqli->query($query_select) or die($mysqli->error);
$array = mysqli_fetch_array($query);
$arraynome = $array['nome_produto'];
if ($arraynome == $nome_produto) {
    echo"<script language='javascript' type='text/javascript'>"
    . "alert('Esse produto já existe');window.location.href='cadastro_produto.php';</script>";
    die();
} else {
    $query_insert = "INSERT INTO produto (nome_produto, genero, marca, preco, foto) VALUES ('$nome_produto','$genero','$marca','$preco','$foto')";
    $insert = $mysqli->query($query_insert) or die($mysqli->error);
    if ($insert) {
        echo"<script language='javascript' type='text/javascript'>"
        . "alert('Produto cadastrado com sucesso!');window.location.href='index.php'</script>";
    } else {
        echo"<script language='javascript' type='text/javascript'>"
        . "alert('Não foi possível cadastrar o produto');window.location.href='cadastro_produto.php'</script>";
    }
}
?>