<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/25
 * Time: 下午5:56
 */
header("content-type:text/html;charset=utf-8");

include_once "tool.php";

$userName = $_GET["username"];
$time = $_GET["time"];
$content = $_GET["content"];

$sql = "INSERT INTO message_board (username,time,content) VALUES ('$userName','$time','$content')";
$sql1 = "SELECT id FROM message_board";
$mysqli = new mysqli("localhost", "root", "", "PHP0502");

$mysqli1 = new mysqli("localhost", "root", "", "PHP0502");

$result = sql_operation($mysqli, $sql);

$result1 = sql_select($mysqli1,$sql1);
echo json_encode($result1);


?>
