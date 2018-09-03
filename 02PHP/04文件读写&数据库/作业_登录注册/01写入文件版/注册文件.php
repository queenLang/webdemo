<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/22
 * Time: 下午5:06
 */
header("content-type:text/html;charset=utf-8");

//print_r($_POST);
//echo "<hr>";


$name = $_POST["uname"];
$pass = $_POST["pass"];


$fileW = fopen("01.txt", "a+");

$userArr = file("01.txt");

if ($userArr == null) {
    fwrite($fileW, "$name,$pass\n");
    echo "注册成功";
} else {
    $flag = true;
    for ($i = 0; $i < count($userArr); $i++) {
        $newArr = explode(",", $userArr[$i]);
//        print_r($newArr);
        if (in_array($name, $newArr)) {
            echo "用户名已存在";
            $flag = false;
            break;
        }

    }

    if ($flag == true){
        fwrite($fileW, "$name,$pass\n");
        echo "注册成功";
    }
}

fclose($fileW);


?>
