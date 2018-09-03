//加载所有数据
getData();
function getData() {
    var url = "02_豆瓣接口.php?num=1&pageNum=1";
    ajax_get(url, function (result) {
        var result = JSON.parse(result);
        // console.log(result);
        // console.log(result["result"]);
        var list = result["result"];
        getNewList(list);
    })
}


//下一页功能
var pageNum = 1;
var nextPage = document.getElementById("nextPage");
nextPage.onclick = function () {
    $("table.table .info").nextAll().remove();
    pageNum = pageNum + 1;
    changePage(pageNum);
    console.log(pageNum);
}
//上一页功能
var upPage = document.getElementById("upPage");
upPage.onclick = function () {
    $("table.table .info").nextAll().remove();
    if (pageNum<=1){
        pageNum=1;
    }else {
        pageNum = pageNum - 1;
    }
    changePage(pageNum);
    // console.log(pageNum);
}




var newHot = "0";
var newChinese = "0";
var newUSA = "0";
var newKorea = "0";
//最热`等`四个按钮的点击事件
$("#btn_all button").off().click(function () {
    //没有添加,有则删除
    $(this).toggleClass("hot_yes");
    // //判断是否含有某个类名
    // var flag = $(this).hasClass("hot_yes");
    // var $btnIndex = $(this).index();
    // console.log($btnIndex);
    // if (flag) {
    //     $(this).removeClass("hot_yes");
    //     $(this).css("background-color", "");
    //     if ($btnIndex == "0") {
    //         newHot = "0";
    //     }
    //     ;
    //     if ($btnIndex == "1") {
    //         newChinese = "0";
    //     }
    //     ;
    //     if ($btnIndex == "2") {
    //         newUSA = "0";
    //     }
    //     ;
    //     if ($btnIndex == "3") {
    //         newKorea = "0";
    //     }
    //     ;
    //
    // } else {
    //     $(this).addClass("hot_yes");
    //     $(this).css("background-color", "dodgerblue");
    //     if ($btnIndex == "0") {
    //         newHot = "1";
    //     }
    //     ;
    //     if ($btnIndex == "1") {
    //         newChinese = "1";
    //     }
    //     ;
    //     if ($btnIndex == "2") {
    //         newUSA = "1";
    //     }
    //     ;
    //     if ($btnIndex == "3") {
    //         newKorea = "1";
    //     }
    //     ;
    // }

    // console.log(newHot + newChinese + newUSA + newKorea);
})

//查询功能
$("body").on("click","button.button_select",function () {
    // console.log(1111);
    if($("#inputName").val().trim().length==0){
        alert("请输入内容");
    }else{
        var sel_name = $("#inputName").val();
        // console.log(sel_name);
        var name_Url = "http://localhost/180502/%E4%BD%9C%E4%B8%9A/03_%E8%B1%86%E7%93%A3%E7%94%B5%E5%BD%B1/02_%E8%B1%86%E7%93%A3%E6%8E%A5%E5%8F%A3.php?num=6&name=" + sel_name;
        ajax_get(name_Url,function (result) {
            var nameResult = JSON.parse(result);
            console.log(nameResult);
            if (nameResult["status"]==1){
                $("table.table .info").nextAll().remove();
                getNewList(nameResult["result"]);
            }

        })
    }

})


//新增的点击事件
$("body").on("click", "button.button_add", function () {
    emptyAll();
    $(".mo_add").html("新增");
    //提交的点击事件
    $("#box_foot_submit").off().click(function () {
        
        var aJson = {
            id: $("#box_foot_id").val(),
            title: $("#box_foot_name").val(),
            imgurl: $("#box_foot_src").val(),
            rate: $("#box_foot_hot").val(),
            hot: newHot,
            chinese: newChinese,
            USA: newUSA,
            Korea: newKorea
        }
        aJson = JSON.stringify(aJson);
        var $urlAdd = "http://localhost/180502/%E4%BD%9C%E4%B8%9A/03_%E8%B1%86%E7%93%A3%E7%94%B5%E5%BD%B1/02_%E8%B1%86%E7%93%A3%E6%8E%A5%E5%8F%A3.php?num=2&aJson=" + aJson;
        console.log($urlAdd);
        ajax_get($urlAdd, function (result) {
            if (result == 1) {
                //将table清空
                $("table.table .info").nextAll().remove();
                changePage(pageNum);
            }
        })

    })
})


//编辑的点击事件
$("body").on("click", "button.compile", function () {
    emptyAll();
    var compId = $(this).parent().parent().attr("index");
    var compUrl = "02_豆瓣接口.php?num=4&index="+ compId;
    ajax_get(compUrl,function (result) {
        var comResult = JSON.parse(result);
        // console.log(comResult["result"][0]["id"]);
       //更改里面内容
        $(".mo_add").html("编辑");
        $("#box_foot_id").val(comResult["result"][0]["id"]);
        $("#box_foot_name").val(comResult["result"][0]["title"]);
        $("#box_foot_src").val(comResult["result"][0]["imgurl"]);
        $("#box_foot_hot").val(comResult["result"][0]["rate"]);
        if (comResult["result"][0]["hot"] == "1") {
            $("#btn_all button:first").css("background-color", "dodgerblue");
        }
        if (comResult["result"][0]["chinese"] == "1") {
            $("#btn_all button:nth-of-type(2)").css("background-color", "dodgerblue");
        }
        if (comResult["result"][0]["USA"] == "1") {
            $("#btn_all button:nth-of-type(3)").css("background-color", "dodgerblue");
        }
        if (comResult["result"][0]["Korea"] == "1") {
            $("#btn_all button:last").css("background-color", "dodgerblue");
        }
    })

    //提交的点击事件
    $("#box_foot_submit").off().click(function () {
        var newJson = {
            id: $("#box_foot_id").val(),
            title: $("#box_foot_name").val(),
            imgurl: $("#box_foot_src").val(),
            rate: $("#box_foot_hot").val(),
            hot: newHot,
            chinese: newChinese,
            USA: newUSA,
            Korea: newKorea
        }
        newJson = JSON.stringify(newJson);
        var $urlAdd = "02_豆瓣接口.php?num=5&newJson=" + newJson + "&id=" + compId;
        ajax_get($urlAdd, function (result) {
            if (result == 1) {
                //将table清空
                $("table.table .info").nextAll().remove();
                changePage(pageNum);
            }
        })
    })

})

//删除点击事件
$("body").on("click", "button.delete", function () {
    var deleteId = $(this).parent().attr("index");
    // console.log(deleteId);
    var $urlDelete = "02_豆瓣接口.php?num=3&id=" + deleteId;
    ajax_get($urlDelete, function (result) {
        // console.log(result);
    })
    $(this).parents("tr").remove();
    swal({
        position: 'center',
        type: 'success',
        title: '删除成功~',
        showConfirmButton: false,
        timer: 500
    })
})
//全选、反选
var line = 1;
$("#all_check").on("click", function () {
    console.log(212121)
    if (line == 1) {
        $(".down_input").prop("checked", true).val("1");
        line = 0;
    } else {
        $(".down_input").prop("checked", false).val("0");
        line = 1;
    }
});
//单选 
$(".down_input").on("click", function () {
    if ($(this).val() == 0) {
        $(this).prop("checked", true).val("1");
    } else {
        $(this).prop("checked", false).val("0");
    }

});
//删除所有选中的
$("#all_delete").on("click", function () {


});

function emptyAll() {
    //将填写的内容清空
    $("#box_foot_id").val("");
    $("#box_foot_name").val("");
    $("#box_foot_src").val("");
    $("#box_foot_hot").val("");
    $("#btn_all button").removeClass("hot_yes");
    $("#btn_all button").css("background-color", "");
    newHot = "0";
    newChinese = "0";
    newUSA = "0";
    newKorea = "0";
}

function changePage(num) {
    var url = "02_豆瓣接口.php?num=1&pageNum=" + num;
    ajax_get(url, function (result) {
        var newResult = JSON.parse(result)["result"];
        // console.log(newResult);
        getNewList(newResult);
    })

}

function getNewList(list) {
    for (var i in list) {
        //创建tr
        var $trs = $("<tr>" + i + "</tr>");
        $trs.attr("index", list[i]["id"]);
        $("table.table").append($trs);
        //创建块
        var $inputTd = $("<td class='count_c'><input class='down_input' value='0' type='checkbox' /></td>");
        $trs.append($inputTd);
        //创建id的td
        var $idTd = $("<td class='count_c' id='id'>" + list[i]["id"] + "</td>");
        $trs.append($idTd);
        //创建title的td
        var $titleTd = $("<td class='count_c'>" + list[i]["title"] + "</td>");
        $trs.append($titleTd);
        //创建imgurl的td
        var $imgurlTd = $("<td class='down_imgurl'>" + list[i]["imgurl"] + "</td>");
        $trs.append($imgurlTd);
        //创建rate的td
        var $rateTd = $("<td class='count_a'>" + list[i]["rate"] + "</td>");
        $trs.append($rateTd);
        //创建hot的td
        var $hotTd = $("<td class='count_a'>" + list[i]["hot"] + "</td>");
        $trs.append($hotTd);
        //创建chinese的td
        var $chineseTd = $("<td class='count_a'>" + list[i]["chinese"] + "</td>");
        $trs.append($chineseTd);
        //创建USA的td
        var $USATd = $("<td class='count_a'>" + list[i]["USA"] + "</td>");
        $trs.append($USATd);
        //创建rate的td
        var $KoreaTd = $("<td class='count_a'>" + list[i]["Korea"] + "</td>");
        $trs.append($KoreaTd);
        //创建compile的td
        var $compileTd = $("<td class='count_b'><button class='btn btn-default btn-sm compile' data-toggle='modal' data-target='#myModal'>编辑</button></td>");
        $trs.append($compileTd);
        //创建delete的td
        var $deleteaTd = $("<td class='count_b'><button class='delete btn btn-danger btn-sm'>删除</button></td>");
        $deleteaTd.attr("index", list[i]["id"]);
        $trs.append($deleteaTd);
    }
}
