<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<style type="text/css">
    table{
        width: 900px;
        height: 700px;
        text-align: center;
        border-collapse: collapse;
    }
    table img{
        width: 200px;
        height:300px;
    }
</style>
</head>
<body>
<?php
// print_r($_POST);
//echo "<hr>";
//print_r($_FILES);
//echo "<hr>";
$all = $_POST;
print_r($all);
?>
<table border="" cellspacing="" cellpadding="">

    <tr>
        <td>姓名</td>
        <td>
            <?php
            $all = $_POST["uname"];
            print_r($all);
            ?>
        </td>
        <td>性别</td>
        <td>
            <?php
            $all = $_POST["sex"];
            print_r($all);
            ?>
        </td>
        <td rowspan="5">
            <?php
            $all = $_FILES["photo"];
//            print_r($all);
            $tmpUrl = $all["tmp_name"];
//            print_r($tmpUrl);
            move_uploaded_file($tmpUrl,"img/".$all["name"]);
            $a = "img/".$all["name"];

//            echo "<img src="."img/".$all["name"].">";
            echo "<img src='$a'>";



            ?>
        </td>
    </tr>
    <tr>
        <td>民族</td>
        <td>
            <?php
            $all = $_POST["nation"];
            print_r($all);
            ?>
        </td>
        <td>籍贯</td>
        <td>
            <?php
            $all = $_POST["place"];
            print_r($all);
            ?>
        </td>
    </tr>
    <tr>
        <td>出生日期</td>
        <td>
            <?php
            $all = $_POST["date"];
            print_r($all);
            ?>
        </td>
        <td>政治面貌</td>
        <td>
            <?php
            $all = $_POST["politics"];
            print_r($all);
            ?>
        </td>
    </tr>
    <tr>
        <td>学历</td>
        <td>
            <?php
            $all = $_POST["education"];
            print_r($all);
            ?>
        </td>
        <td>婚姻状况</td>
        <td>
            <?php
            $all = $_POST["marriage"];
            print_r($all);
            ?>
        </td>
    </tr>
    <tr>
        <td>专业</td>
        <td>
            <?php
            $all = $_POST["major"];
            print_r($all);
            ?>
        </td>
        <td>健康状况</td>
        <td>
            <?php
            $all = $_POST["health"];
            print_r($all);
            ?>
        </td>
    </tr>
    <tr>
        <td>求职方向</td>
        <td colspan="4">银行相关专业，行政助理</td>
    </tr>
    <tr>
        <td>毕业院校</td>
        <td colspan="2">北京大学</td>
        <td>邮编</td>
        <td>116000</td>
    </tr>
    <tr>
        <td>电话</td>
        <td>12345679900</td>
        <td colspan="2">邮箱</td>
        <td>1234567@163.com</td>
    </tr>

</table>

</body>
</html>