<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/25
 * Time: 下午5:55
 */
header("content-type:text/html;charset=utf-8");

include_once "tool.php";

$userName = $_GET["username"];
$time = $_GET["time"];
$content = $_GET["content"];

if ($userName == "小可爱" && $time == "a" && $content == "a"){
    $sql = "SELECT * FROM message_board";
    $mysqli = new mysqli("localhost","root","","PHP0502");
    $result = sql_select($mysqli,$sql);
    echo json_encode($result);
}

?>
