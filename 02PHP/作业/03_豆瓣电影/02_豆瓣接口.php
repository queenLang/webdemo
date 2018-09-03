<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/28
 * Time: 上午11:15
 */
header("content-type:text/html;charset=utf-8");
include_once "tools.php";

$num = $_GET["num"];
switch ($num) {
    //每次查询20条数据
    case 1:
        select();
        break;
    //新增,向数据库中添加数据
    case 2:
        insertNew();
        break;
    //删除,点击删除后,删除数据库中的数据
    case 3:
        delete();
        break;
    //查询所有数据id
    case 4:
        selectId();
        break;
    //编辑之后的提交点击事件,修改数据库里面的数据
    case 5:
        update();
        break;
    //点击查询后模糊查询姓名
    case 6:
        selectName();
        break;
}

//查询
function select()
{
    $pageNum = $_GET["pageNum"];
    $pageNum = ($pageNum - 1) * 20;
    $sql = "SELECT * FROM douban LIMIT $pageNum,20";
    $mysqli = new mysqli("localhost", "root", "", "PHP0502");
    $res = sql_select($mysqli, $sql);
    if ($res) {
        $resultArr = ["result" => $res, "status" => 1];
        echo json_encode($resultArr);
    } else {
        $resultArr = ["result" => "", "status" => 0];
        echo json_encode($resultArr);
    }

}


//新增
function insertNew()
{
    $result = $_GET["aJson"];
    $info = json_decode($result, true);
    $id = $info["id"];
    $title = $info["title"];
    $imgurl = $info["imgurl"];
    $rate = $info["rate"];
    $hot = $info["hot"];
    $chinese = $info["chinese"];
    $USA = $info["USA"];
    $Korea = $info["Korea"];

    $sql_address = new mysqli("localhost", "root", "", "PHP0502");
    //将数据插入到后台数据中
    $sql_cmd = "INSERT INTO `douban`(`id`, `title`, `imgurl`, `rate`, `hot`, `chinese`, `USA`, `Korea`) VALUES ('$id','$title','$imgurl','$rate','$hot','$chinese','$USA','$Korea')";

    $result = sql_operation($sql_address, $sql_cmd);

   echo $result;

}

//删除
function delete()
{
    $delId = $_GET["id"];
    $sql = "DELETE FROM douban WHERE id = $delId";
    $mysqli = new mysqli("localhost", "root", "", "PHP0502");
    $resDel = sql_operation($mysqli, $sql);
    echo $resDel;
}


//查询id
function selectId()
{
    $index = $_GET["index"];

    $mysqli = new mysqli("localhost", "root", "", "PHP0502");

    $sql = "SELECT * FROM douban WHERE id = '$index'";

    $res = sql_select($mysqli, $sql);
    if ($res) {
        $resultArr = ["result" => $res, "status" => 1];
        echo json_encode($resultArr);
    } else {
        $resultArr = ["result" => "", "status" => 0];
        echo json_encode($resultArr);
    }
}


//修改数据库里面的数据
function update()
{
    $updateId = $_GET["id"];
    $newJson = $_GET["newJson"];
//    var_dump($newJson);
    $update_json = json_decode($newJson,true);
//    print_r($update_json);
    $id = $update_json["id"];
    $title = $update_json["title"];
    $imgurl = $update_json["imgurl"];
    $rate = $update_json["rate"];
    $hot = $update_json["hot"];
    $chinese = $update_json["chinese"];
    $USA = $update_json["USA"];
    $Korea = $update_json["Korea"];

    $sql = "UPDATE douban SET title='$title',imgurl= '$imgurl', rate= '$rate',hot= '$hot', chinese= '$chinese',USA= '$USA', Korea= '$Korea' WHERE id = '$updateId'";

    $mysqli = new mysqli("localhost", "root", "", "PHP0502");

    $update_res = sql_operation($mysqli, $sql);

    echo $update_res;
}

//查询姓名
function selectName()
{
    $name = $_GET["name"];

    $mysqli = new mysqli("localhost", "root", "", "PHP0502");

    $sql = "SELECT * FROM douban WHERE title like '%$name%'";

    $res = sql_select($mysqli, $sql);
    if ($res) {
        $resultArr = ["result" => $res, "status" => 1];
        echo json_encode($resultArr);
    } else {
        $resultArr = ["result" => "", "status" => 0];
        echo json_encode($resultArr);
    }
}


?>
