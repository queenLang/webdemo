<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/24
 * Time: 下午3:43
 */
header("content-type:text/html;charset=utf-8");

//定义请求参数
$phone = $_GET["phone"];
$pass = $_GET["password"];

//$phone = $_POST["phone"];
//$pass = $_POST["password"];

if ($phone == "110" && $pass == "123"){
    $dog1 = ["name"=>"来福","age"=>3];
    $dog2 = ["name"=>"雪球","age"=>2];
    $dog3 = ["name"=>"富贵","age"=>1];

    $dogArr = [$dog1,$dog2,$dog3];
    $dogJson = ["狗狗"=>$dogArr];

    echo json_encode($dogJson);

}





?>
