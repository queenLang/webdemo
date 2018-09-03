<?php
/**
 * Created by PhpStorm.
 * User: HeXin
 * Date: 17/4/12
 * Time: 上午12:12
 */
header("content-type:text/html;charset=utf-8");

require_once "tools.php";
//
$get_json_url = "https://movie.douban.com/j/search_subjects?type=movie&tag=热门&sort=recommend&page_limit=1000&page_start=0";
$result = httpGet($get_json_url);

$info = json_decode($result,true);

for ($i = 0; $i < count($info["subjects"]); $i++) {
    $id    = $info["subjects"][$i]['id'];
    $title = $info["subjects"][$i]['title'];
    $rate  = $info["subjects"][$i]['rate'];
    $cover = $info["subjects"][$i]['cover'];
    $coverX = $info["subjects"][$i]['cover_x'];
    $coverY = $info["subjects"][$i]['cover_y'];
    $isnew  = $info["subjects"][$i]['is_new'];
    $url = $info["subjects"][$i]['url'];


    // 四种类型的电影 0 为不是此种类型 1 为是这种类型
    // 假数据 主要是为了帮助前台实现逻辑
    $chinese = rand(0,1);
    $hot = rand(0,1);
    $USA = rand(0,1);
    $Korea = rand(0,1);

    $sql_address = new mysqli("localhost", "root", "", "PHP0502");
    //将数据插入到后台数据中
    $sql_cmd = "INSERT INTO `douban`(`id`, `title`, `imgurl`, `rate`, `hot`, `chinese`, `USA`, `Korea`) VALUES ('$id','$title','$cover','$rate','$hot','$chinese','$USA','$Korea')";



    $result = sql_operation($sql_address, $sql_cmd);
    var_dump($result);

}




?>
