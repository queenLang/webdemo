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


//jsonStr转数组
//$resArr = json_decode($res,true);
//数组转jsonStr
//$jsonStr = json_encode($resArr);


//get请求
function http_GET($url){
    //1.创建对象
    $curl = curl_init();
    //2.设置$curl的网络请求
    curl_setopt($curl,CURLOPT_URL,$url);
    curl_setopt($curl,CURLOPT_RETURNTRANSFER,true);
    //3.执行网络请求
    $res = curl_exec($curl);
    //4.关闭网络请求
    curl_close($curl);
    //返回结果
    return $res;
}
//$url = "http://localhost/180502/05%E6%8E%A5%E5%8F%A3&&curl%E8%AF%B7%E6%B1%82/03curl/02%E6%8E%A5%E5%8F%A3.php?phone=110&password=123";
//
//$result = http_GET($url);
//
//echo $result;


//对http的get请求
function httpGet($url)
{
    $curl = curl_init();
    curl_setopt($curl, CURLOPT_URL, $url);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);
    curl_setopt($curl, CURLOPT_SSL_VERIFYHOST, false);
    $req = curl_exec($curl);
    if (curl_errno($curl)){
        echo curl_errno($curl);
    }
    curl_close($curl);
    return $req;
}

//post请求
function http_post($url,$data){
    $curl = curl_init();
    //设置请求方式
    curl_setopt($curl,CURLOPT_POST,true);

    curl_setopt($curl,CURLOPT_URL,$url);

    curl_setopt($curl,CURLOPT_POSTFIELDS,$data);

    curl_setopt($curl,CURLOPT_RETURNTRANSFER,true);

    //执行网络请求

    $res = curl_exec($curl);

    curl_close($curl);

    return $res;
}
//$postUrl = "http://localhost/180502/05%E6%8E%A5%E5%8F%A3&&curl%E8%AF%B7%E6%B1%82/03curl/02%E6%8E%A5%E5%8F%A3.php";
//
//$data = "phone=110&password=123";
//
//$result1 = http_post($postUrl,$data);




?>
