<?php
/**
 * Created by PhpStorm.
 * User: HeXin
 * Date: 18/3/20
 * Time: 上午10:48
 */
header("content-type:text/html;charset=utf-8");
require_once "tool.php";
//type
// 1 代表插入
// 2 代表 查询
// 3 代表删除
$type = $_GET["type"];

switch ($type){
    case 1:
        insert();
        break;
    case 2:
        select();
        break;
    case 3:
        delete();
        break;
    default:
        break;
}

function delete() {
    $theId = $_GET["id"];
    $mySql = new mysqli("localhost","root","","PHP1211");
    $sql = "DELETE FROM message WHERE id ='$theId'";

    $result = sql_operation($mySql,$sql);

    if ($result){
        $resultArr = ["status"=>1];
        echo json_encode($resultArr);
    } else {
        $resultArr = ["status"=>0];
        echo json_encode($resultArr);


    }
}

function select() {
    $mySql = new mysqli("localhost","root","","PHP1211");

    $sql = "SELECT * FROM message";

    $res = sql_select($mySql,$sql);

    if($res){
        $resultArr = ["result"=>$res,"status"=>1];
        echo json_encode($resultArr);
    } else {
        $resultArr = ["result"=>"","status"=>0];
        echo json_encode($resultArr);
    }

}

function insert() {
    $mes = $_GET["mes"];
    $date = $_GET["date"];

    $mySql = new mysqli("localhost","root","","PHP1211");

    $sql = "INSERT INTO message(message,date)VALUES ('$mes','$date')";

    $res = sql_operation($mySql,$sql);

    $mySql1 = new mysqli("localhost","root","","PHP1211");

    $selectSql = "SELECT max(id) FROM message";
    $resultID = sql_select($mySql1,$selectSql);

//    print_r($resultID);


    if ($res){
        $resArr = ["status"=>1,"id"=>$resultID[0]["max(id)"]];
        echo json_encode($resArr);
    } else {
        $resArr = ["status"=>0,"id"=>""];
        echo json_encode($resArr);
    }

}
?>
