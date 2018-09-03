<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/24
 * Time: 下午2:12
 */
header("content-type:text/html;charset=utf-8");



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


/*$resUrl = "http://c.3g.163.com/recommend/getChanRecomNews?channel=duanzi&passport=91153191bdb987ca2bc10b1d3e7a5004@tencent.163.com&devId=CE80EFE4-9CE9-4E06-B117-DFA8DE7893F1&size=20";

$res = http_GET($resUrl);

//echo $res;

//jsonStr转数组

$resArr = json_decode($res,true);
//var_dump($resArr);

//数组转jsonStr

$jsonStr = json_encode($resArr);
var_dump($jsonStr);*/



$url = "http://localhost/180502/05%E6%8E%A5%E5%8F%A3&&curl%E8%AF%B7%E6%B1%82/03curl/02%E6%8E%A5%E5%8F%A3.php?phone=110&password=123";

$result = http_GET($url);

echo $result;





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



$postUrl = "http://localhost/180502/05%E6%8E%A5%E5%8F%A3&&curl%E8%AF%B7%E6%B1%82/03curl/02%E6%8E%A5%E5%8F%A3.php";

$data = "phone=110&password=123";

$result1 = http_post($postUrl,$data);


//echo $result1;

?>
