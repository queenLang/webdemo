<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/27
 * Time: 上午11:38
 */
header("content-type:text/html;charset=utf-8");

//定义请求参数

$url1 = "http://c.3g.163.com/recommend/getChanRecomNews?channel=duanzi&passport=91153191bdb987ca2bc10b1d3e7a5004@tencent.163.com&devId=CE80EFE4-9CE9-4E06-B117-DFA8DE7893F1&size=20";
$result = http_GET($url1);
echo $result;


function http_GET($url)
{
    //1.创建对象
    $curl = curl_init();
    //2.设置$curl的网络请求
    curl_setopt($curl, CURLOPT_URL, $url);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    //3.执行网络请求
    $res = curl_exec($curl);
    //4.关闭网络请求
    curl_close($curl);
    //返回结果
    return $res;
}

?>
