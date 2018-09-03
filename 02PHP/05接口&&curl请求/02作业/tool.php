<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/24
 * Time: 上午10:39
 */
header("content-type:text/html;charset=utf-8");


//$mysqli = new mysqli("localhost","root","","PHP0502");

//增删改
function sql_operation($mysqli,$sql){

    if ($mysqli->connect_errno){
        die($mysqli->connect_errno);
    }
    $mysqli->query("set names utf8");
    $result = $mysqli->query($sql);
    $mysqli->close();
    return $result;
}

//查
function sql_select($mysqli,$sql){

    if ($mysqli->connect_errno){
        die($mysqli->connect_errno);
    }
    $mysqli->query("set names utf8");
    $result = $mysqli->query($sql);
    $mysqli->close();
    if (is_bool($result)){
        return $result;  //false
    }else{
        return $result->fetch_all(MYSQLI_ASSOC);
    }

}








?>
