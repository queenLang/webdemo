<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/25
 * Time: 下午5:56
 */
header("content-type:text/html;charset=utf-8");
include_once "tool.php";

//$userName = $_GET["username"];
//$time = $_GET["time"];
//$content = $_GET["content"];
$id = $_GET["id"];

$sql = "DELETE FROM message_board WHERE id='$id'";
$mysqli = new mysqli("localhost", "root", "", "PHP0502");
$result = sql_operation($mysqli, $sql);
echo json_encode($result);

?>
