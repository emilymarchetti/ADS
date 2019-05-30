<!DOCTYPE html>
<html lang="pt-br" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="UTF-8" />
        <title>LoginPHP</title>
        <link href="estilo.css" rel="stylesheet"/>
    </head>
    <body>
    <div id="pagina">
    <div id="topo">
		<div id="logo">
			<a href="index.html">
				<img src="imagens/logo12.png" alt="Newspaper" />
			</a>
		</div>
		
		<div id="fundomenu">
		<div id="menu">
			<ul>
				<li>
					<a href="index.php">Home</a>
				</li>	
				
				<?php
				if (isset($_COOKIE['login'])) {
					$login_cookie = $_COOKIE['login'];
					echo "<li><a href='cadastroConteudo.php'>Cadastrar conteúdo</a></li>";
					echo "<li><a class='right capitalize'>$login_cookie</a></li>";
				}else{
					echo "<li><a class='right' href='login.php'>Login</a></li>";
					echo "<li><a class='right' href='cadastro.php'>Cadastre-se</a></li>";
				}
				?>
			</ul>
		</div>
		</div>
	</div>
	<br><br>
    