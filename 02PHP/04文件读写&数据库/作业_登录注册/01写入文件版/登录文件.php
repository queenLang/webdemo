<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/22
 * Time: 下午8:49
 */
header("content-type:text/html;charset=utf-8");


$name = $_POST["uname"];
$pass = $_POST["pass"];
//print_r($name);

$userArr = file("01.txt");
//print_r($userArr);
//echo "~~~~~~~~~1"."<hr>";

$noFlag = true;
$index=0;

for ($i = 0; $i < count($userArr); $i++) {
    $newArr = explode(",", $userArr[$i]);
//    print_r($newArr);
//    echo "~~~~~~~~~2"."<hr>";
    if (in_array($name,$newArr)){
        $noFlag=false;
        $index=$i;
        break;
    }

}
if ($noFlag==true){
    echo "用户名不存在";
}else{
     $newArr = explode(",", $userArr[$index]);
//     var_dump($newArr);
     if ($pass == trim($newArr[1])){
          echo "登录成功~~";
     }else{
         echo "密码错误";
     }
}

?>
