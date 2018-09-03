//list = list.reverse();

getNewList();

function getNewList() {
	for(var i in list) {
		//创建tr
		var $trs = $("<tr>" + i + "</tr>");
		$("table.table").append($trs);
		//创建块
		var $inputTd = $("<td class='count_c'><input class='down_input' value='0' type='checkbox' /></td>");
		$trs.append($inputTd);
		//创建id的td
		var $idTd = $("<td class='count_c'>" + list[i]["id"] + "</td>");
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
		$trs.append($deleteaTd);
	}
}

var newHot = "0";
var newChinese = "0";
var newUSA = "0";
var newKorea = "0";
//最热`等`四个按钮的点击事件
$("#btn_all button").off().click(function() {
	//判断是否含有某个类名
	var flag = $(this).hasClass("hot_yes");
	var $btnIndex = $(this).index();
	console.log($btnIndex);
	if(flag) {
		$(this).removeClass("hot_yes");
		$(this).css("background-color", "");
		if($btnIndex == "0") {
			newHot = "0";
		};
		if($btnIndex == "1") {
			newChinese = "0";
		};
		if($btnIndex == "2") {
			newUSA = "0";
		};
		if($btnIndex == "3") {
			newKorea = "0";
		};

	} else {
		$(this).addClass("hot_yes");
		$(this).css("background-color", "dodgerblue");
		if($btnIndex == "0") {
			newHot = "1";
		};
		if($btnIndex == "1") {
			newChinese = "1";
		};
		if($btnIndex == "2") {
			newUSA = "1";
		};
		if($btnIndex == "3") {
			newKorea = "1";
		};
	}
	console.log(newHot + newChinese + newUSA + newKorea);
})

//新增的点击事件
$("body").on("click", "button.button_add", function() {
	emptyAll();
	console.log(22222)
	$(".mo_add").html("新增");
	//提交的点击事件
	$("#box_foot_submit").off().click(function() {
		console.log(22222)
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
			//将一个元素添加到数组开头
		list.unshift(aJson);
		//将table清空
		$("table.table .info").nextAll().remove();
		getNewList();
	})
})

//编辑的点击事件
$("body").on("click", "button.compile", function() {
	emptyAll();
	var $compileIndex = $(this).parents("tr").index() - 1;
	//	 console.log(list);
	console.log($compileIndex);
	//	console.log(list[$compileIndex]);
	//更改里面内容
	$(".mo_add").html("编辑");
	$("#box_foot_id").val(list[$compileIndex]["id"]);
	$("#box_foot_name").val(list[$compileIndex]["title"]);
	$("#box_foot_src").val(list[$compileIndex]["imgurl"]);
	$("#box_foot_hot").val(list[$compileIndex]["rate"]);
	if($(this).parents("tr").children().eq(5).html() == "1") {
		$("#btn_all button:first").addClass("new_yes");
		$("#btn_all button:first").css("background-color", "dodgerblue");
	}
	if($(this).parents("tr").children().eq(6).html() == "1") {
		$("#btn_all button:nth-of-type(2)").css("background-color", "dodgerblue");
	}
	if($(this).parents("tr").children().eq(7).html() == "1") {
		$("#btn_all button:nth-of-type(3)").css("background-color", "dodgerblue");
	} else {
		$("#btn_all button:nth-of-type(3)").css("background-color", "");
	}
	if($(this).parents("tr").children().eq(8).html() == "1") {
		$("#btn_all button:last").css("background-color", "dodgerblue");
	} else {
		$("#btn_all button:last").css("background-color", "");
	}

	//提交的点击事件
	$("#box_foot_submit").off().click(function() {
		console.log("哈哈`" + $compileIndex);
		var neWJson = {
			id: $("#box_foot_id").val(),
			title: $("#box_foot_name").val(),
			imgurl: $("#box_foot_src").val(),
			rate: $("#box_foot_hot").val(),
			hot: newHot,
			chinese: newChinese,
			USA: newUSA,
			Korea: newKorea
		}
		console.log(neWJson);
		list.splice($compileIndex, 1, neWJson);
		$("table.table .info").nextAll().remove();
		getNewList();
	})

})

//删除点击事件
$("body").on("click", "button.delete", function() {
		var delNewIndex = $(this).parents("tr").index();
		$(this).parents("tr").remove();
		console.log(delNewIndex);
		list.splice((delNewIndex - 1), 1);
		swal({
			position: 'center',
			type: 'success',
			title: '删除成功~',
			showConfirmButton: false,
			timer: 3000
		})
	})
	//全选、反选
var line = 1;
$("#all_check").on("click", function() {
	console.log(212121)
	if(line == 1) {
		$(".down_input").prop("checked", true).val("1");
		line = 0;
	} else {
		$(".down_input").prop("checked", false).val("0");
		line = 1;
	}
});
//单选 
$(".down_input").on("click", function() {
	if($(this).val() == 0) {
		$(this).prop("checked", true).val("1");
	} else {
		$(this).prop("checked", false).val("0");
	}

});
//删除所有选中的
$("#all_delete").on("click", function() {
	$(".down_input[value=1]").parents("tr").empty();

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