<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/27
 * Time: 下午3:45
 */
header("content-type:text/html;charset=utf-8");



$dog1 = ["name"=>"来福","age"=>3];
$dog2 = ["name"=>"雪球","age"=>2];
$dog3 = ["name"=>"富贵","age"=>1];

$dogArr = [$dog1,$dog2,$dog3];
$dogJson = ["狗狗"=>$dogArr];


if (isset($_GET["back"]) && $_GET["back"]){

    $back = $_GET["back"];
    echo $back."(".json_encode($dogJson).")";

}else{

    echo json_encode($dogJson);
}





?>
