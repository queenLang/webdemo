<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/25
 * Time: 上午9:29
 */
header("content-type:text/html;charset=utf-8");

//参数  页数  每页20条数据

//从0条数据 返回20条

//第一页   0   20  (pageNum - 1) * 20
//第二页   20  20
//第三页   40  20

include_once "tool.php";

$pageNum = $_GET["pageNum"];   //1,2,3


$startCount = ($pageNum - 1) * 20;

$sql = "SELECT * FROM COLUMNS LIMIT $startCount,20";

$mysqli = new mysqli("localhost","root","","information_schema");

$result = sql_select($mysqli,$sql);

echo json_encode($result);

?>
