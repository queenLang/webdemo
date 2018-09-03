<?php

//get的网络请求
function http_GET($url){
    $curl = curl_init();
    curl_setopt($curl, CURLOPT_URL, $url);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    $res = curl_exec($curl);
    curl_close($curl);
    return $res;
}
//获取get请求的值,如果$_GET["pageNum"]获取的值为空,网址不拼接,因为上面的网址显示的是自己的网址,
//当获取的值不为空时,网址拼接,将$thisPage变化的值赋给$pageNum
//判断某个key值在关联数组中是否存在 , 不存在返回false
if(isset($_GET["pageNum"])==false){
    //初始值为1
    $pageNum=1;
}else{
    //将更改的值赋给将要传递的值
    $pageNum = $_GET["pageNum"];
}

$url = "http://localhost/180502/05%E6%8E%A5%E5%8F%A3&&curl%E8%AF%B7%E6%B1%82/04homework_%E4%B8%8B%E4%B8%80%E9%A1%B5%E6%9F%A5%E6%89%BE/02%E6%8E%A5%E5%8F%A3.php";
$newUrl = $url."?pageNum=".$pageNum;
//echo $newUrl;
$result = http_GET($newUrl);
//将json字符串转换成数组
$newResult = json_decode($result, true);




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
    <?php
    for ($i = 0; $i < count($newResult); $i++) {
        echo "<tr>";
        echo "<td>" . $newResult[$i]["TABLE_CATALOG"] . "</td>";
        echo "<td>" . $newResult[$i]["TABLE_SCHEMA"] . "</td>";
        echo "<td>" . $newResult[$i]["TABLE_NAME"] . "</td>";
        echo "<td>" . $newResult[$i]["COLUMN_NAME"] . "</td>";
        echo "<td>" . $newResult[$i]["ORDINAL_POSITION"] . "</td>";
        echo "</tr>";
    }
    ?>
</table>
<!--点击之后刷新页面 PHP的方法  刷新的是本页面,可以看做是向本页面发送get请求 , 所以跳到上面if 判断-->
<input type="button" value="上一页" onclick="location.href='01页面.php?pageNum=<?=$pageNum==1?1:$pageNum-1?>'">
<input type="button" value="下一页" onclick="location.href='01页面.php?pageNum=<?=$pageNum+1?>'">

</body>
</html>