<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        
        <label>Nome:</label>
        
        <?php
        $nome = "";
        $idade = 18;
        $nomeSubmit = "";
        function validar($nome, $idade) {
            if ($idade >= 18) {
                echo $nome . " é maior de idade";
                echo"<script language='javascript' type='text/javascript'>"
        . "alert($nome.' é menor de idade');window.location.href='index.php'</script>";
            } else {
                echo $nome . " é menor de idade";
            }
        }
        
        echo "<input type='text' name='$nomeSubmit' id='nome' title='Nome' required oninvalid='setCustomValidity('Por favor, preencha o nome')' onchange='try{setCustomValidity('')}catch(e){}'/><br/>";
        $nome = $nomeSubmit;
        echo "<input class='buttom' type='submit' value='Enviar' onclick='validar()' id='enviar' name='enviar'/>";
        
        
        ?>
    </body>
</html>
