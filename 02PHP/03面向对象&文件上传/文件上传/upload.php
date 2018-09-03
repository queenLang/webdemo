<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 下午3:44
 */
header("content-type:text/html;charset=utf-8");

print_r($_POST);
//print_r($_GET);
echo "<hr>";
print_r($_FILES);

//["theFile"=>["name"=>黄景瑜3.jpg]]

$imgInfo = $_FILES["theFile"];

//临时存储路径

$tmpUrl = $imgInfo["tmp_name"];
//第一个参数:临时存储路径
//第二个参数:存储路径(相对于此文件的 相对路径)
//move_uploaded_file($tmpUrl,"img/01.jpeg");

move_uploaded_file($tmpUrl,"img/".$imgInfo["name"]);




?>

