<?php
include ("header.php");
include ("conexao.php");

    $query_select = "SELECT nome_produto, genero, marca, preco, foto FROM produto";
    $query = $mysqli->query($query_select) or die($mysqli->error);
    $array = mysqli_fetch_assoc($query);
    $total = mysqli_num_rows($query);
    ?>
        <?php
        if ($total > 0 && $array['genero'] == "M") {
            do {
                echo "<div class='col-100 bloco-imagens-texto'>";
                echo "<div class='content' style='margin-left: 15%; float: left;'>";
                echo "<div class='col-3 bloco-texto bloco-imagem'>";
                echo "<img src=" . $array['foto'] . ">";
                echo "<p><b>" . $array['nome_produto'] . "</b></p>";
                echo "<div class='caixa'>";
                echo "<p>Masculino</p>";
                echo "</div>";
                echo "<p> R$ " . $array['preco'] . "</p>";
                echo "</div>";
                echo "</div>";
                echo "</div>";
            } while ($array = mysqli_fetch_assoc($query));
        } else {
            echo "<h4>Nenhum produto cadastrado</h4>";
        }
        ?>
    <?php
    
mysqli_free_result($query);
?>