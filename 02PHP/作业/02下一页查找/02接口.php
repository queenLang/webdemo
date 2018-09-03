<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/24
 * Time: 下午5:18
 */
header("content-type:text/html;charset=utf-8");

include_once "tool.php";

$page = $_GET["pageNum"];

$num = ($page-1)*20;

//从num页开始查找,每次查找20页 ,前面为变量,可以更改从多少页开始, 后面值固定为20页
$sql = "SELECT * FROM COLUMNS LIMIT $num,20";

$mysqli = new mysqli("localhost", "root", "", "information_schema");

$result = sql_select($mysqli, $sql);

echo json_encode($result);

//    print_r($result);


?>
