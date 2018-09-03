<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/16
 * Time: 上午9:13
 */
header("content-type:text/html;charset=utf-8");
$a = 1;
if ($a == 1){

}else if ($a == 0){

}else{

}

switch ($a){
    case 1;
       echo "a是1";
       break;
    case 2;
        echo "a是4";
        break;
    case 3;
        echo "a是3";
        break;
    case 4;
        echo "a是2";
        break;
    default;
        break;
}

?>
