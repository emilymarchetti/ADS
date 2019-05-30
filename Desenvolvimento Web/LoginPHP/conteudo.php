<?php
include("conexao.php");

    //Consulta no banco de dados
    $query_select = "SELECT titulo, conteudo, fonte FROM conteudo";
    $query = $mysqli->query($query_select) or die($mysqli->error);
    $array = mysqli_fetch_assoc($query);
    $total = mysqli_num_rows($query);
    ?>
        <?php
        if ($total > 0) {
            do {
				echo "<div id='post'>";
                echo "<h1>" . $array['titulo'] . "</h1><br>";
                echo "<p>" . $array['conteudo'] . "</p><br>";
				echo "<p id='fonte'>Fonte: " . $array['fonte'] . "</p><br>";
				echo "</div>";
				echo "<br>";
            } while ($array = mysqli_fetch_assoc($query));
        } else {
            echo "<h4>Nenhum conteudo cadastrado</h4>";
        }
        ?>
    <?php
	
mysqli_free_result($query);
?>