<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/22
 * Time: 上午9:16
 */
header("content-type:text/html;charset=utf-8");

//读取文件,要求文件必须存在
//is_file(文件路径)  判断该路径下,文件是否存在
if (is_file("01.txt")){
    //$fileR  资源类型
    //打开一个文件,返回值是resource类型
    $fileR = fopen("01.txt","r+");

    //获取文件长度
    $fileL = filesize("01.txt");
    var_dump($fileL);

    //读取文件
    //fread(文件流,读取的长度)
//    $result = fread($fileR,$fileL);
      $result = fread($fileR,8);

    echo $result;

    //必须关闭resource流
    fclose($fileR);

}




?>
