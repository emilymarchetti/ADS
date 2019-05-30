<?php

$nome=$_POST['nome'];
$email=$_POST['email'];
$titulo=$_POST['titulo'];
$texto=$_POST['texto'];

$Destinatario="contato@seusite.com.br";

$Titulo="$titulo";

$mensagem="
Uma mensagem vinda do site !
Algum vistante mandou essa mensagem pelo site.
Nome: $nome
Email: $email
Mensagem: $texto";

mail("$Destinatario","$Titulo", "$mensagem","From:$email");

echo "<script type='text/javascript'> alert('Sua mensagem foi enviada com sucesso!');  window.location='index.html';</script>"; 
?>

