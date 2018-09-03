<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/25
 * Time: 上午9:37
 */
header("content-type:text/html;charset=utf-8");


include_once "tool.php";

//isset($_GET["pageNum"] && $_GET["pageNum"]  也可以判断前端传到后端的数据中必填的参数是否填写

//判断是否拼接参数 && 拼接的参数是否有值
if (isset($_GET["pageNum"]) && $_GET["pageNum"]){
    $pageNum = $_GET["pageNum"];
}else{
    $pageNum = 1;
}

$url = "http://localhost/180502/06Ajax/01%E4%BD%9C%E4%B8%9A%E6%8E%A5%E5%8F%A3%E7%AD%94%E6%A1%88/01%E6%8E%A5%E5%8F%A3.php?pageNum=$pageNum";

$dataArr = http_GET($url);

$dataArr = json_decode($dataArr,true);

//var_dump($dataArr);

?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table border="1">
    <tr>
    <?php
       foreach (array_keys($dataArr[0]) as $item){
         echo "<th>$item</th>";
       }

    ?>
    </tr>

    <?php
       foreach ($dataArr as $item){
           echo "<tr>";
           foreach ($item as $key=>$value){
               echo "<td>$value</td>";
           }
           echo "</tr>";
       }
    ?>
</table>
    <input type="button" value="下一页" onclick="location.href='02页面.php?pageNum=<?=$pageNum+1?>'">
</body>
</html>