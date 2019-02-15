<?php 

	include "../../accesseur/PenseeDAO.php";
	$penseeDAO = new PenseeDAO();
	//print_r($penseeDAO);
	$nombre_pensee = $penseeDAO->getNombrePensees();
	$trouverPensee = $penseeDAO->trouverPensee(rand(1,$nombre_pensee->nbr));
	//print_r($listePensees);
?><?php 

header("Content-type: text/xml");
echo '<?xml version="1.0" encoding="UTF-8"?>';
//utf8_encode()
?>
<pensee>
	<auteur><?=($trouverPensee->auteur)?></auteur>
	<message><?=($trouverPensee->message)?></message>
	<annee><?=$trouverPensee->annee?></annee>
	<id><?=$trouverPensee->idPensee?></id>
</pensee>