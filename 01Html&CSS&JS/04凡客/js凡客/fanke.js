window.onload = function() {
	console.log(111);

	var Json = {
		"t1": [{
			"showId": "t11",
			"showImg": "img/秒杀/6378691-1j201711031614008077.jpg",
			"showIntruce": "衬衫 棉麻 小方领 男款 仓青",
			"showBrfore": "¥258",
			"showAfter": "¥218",
			"showMoney": "119"
		}, {
			"shouId": "t12",
			"showImg": "img/秒杀/6373860-1j201709191136144818.jpg",
			"showIntruce": "凡客皮肤衣 防晒轻弹 反光 女款 粉蓝",
			"showBrfore": "¥498",
			"showAfter": "¥208",
			"showMoney": "118"
		}, {
			"shouId": "t13",
			"showImg": "img/秒杀/6379493-1j201802051626499158.jpg",
			"showIntruce": "衬衫 棉麻 小方领 男款 仓青 凡客皮肤  防晒",
			"showBrfore": "¥498",
			"showAfter": "¥259",
			"showMoney": "117"
		}, {
			"shouId": "t14",
			"showImg": "img/秒杀/6379490-1j201802271358318879.jpg",
			"showIntruce": "牛仔裤  基础直筒 轻弹 男款 复古蓝",
			"showBrfore": "¥398",
			"showAfter": "¥318",
			"showMoney": "159"
		}, {
			"shouId": "t15",
			"showImg": "img/秒杀/6379122-1j201711290941169578.jpg",
			"showIntruce": "凡客女士精梳棉中筒袜 菱形格 提花款 (2双装) 浅米黄色",
			"showBrfore": "¥58",
			"showAfter": "¥36",
			"showMoney": "18"
		}],
		"t2": [{
			"shouId": "t21",
			"showImg": "img/熊本熊/01.jpg"
		}, {
			"shouId": "t22",
			"showImg": "img/熊本熊/02.jpg"
		}, {
			"shouId": "t23",
			"showImg": "img/熊本熊/03.jpg"
		}, {
			"shouId": "t24",
			"showImg": "img/熊本熊/04.jpg"
		}],
		"t3": [{
			"shouId": "t31",
			"showImg": "img/新品预售/1.jpg"
		}, {
			"shouId": "t32",
			"showImg": "img/新品预售/2.jpg"
		}, {
			"shouId": "t33",
			"showImg": "img/新品预售/6382228-2.jpg"
		}, {
			"shouId": "t34",
			"showImg": "img/新品预售/6382233.jpg"
		}]
	}

	var opull = document.getElementsByClassName("pull")
	var oTou = document.getElementsByClassName("Tou");

	for(var i = 0; i < oTou.length; i++) {

		oTou[i].index = i;
		oTou[i].onmouseover = function() {
			console.log(222);
			var list = opull[this.index].getElementsByTagName("li");
			var aHeight = getStyle(list[0], "height")
			var listH = list.length * parseInt(aHeight)
			console.log("listH:" + listH);

			easeMove(opull[this.index], listH, 15, "height", 20);

		}

		oTou[i].onmouseout = function() {
			easeMove(opull[this.index], 0, 15, "height", 20);
		}
	}

	function easeMove(obj, targetPos, speedScale, attr, time) {

		clearInterval(obj.timer)
		obj.timer = setInterval(function() {
			var isStop = true;
			var attrValue = getStyle(obj, attr);
			attrValue = attr == "opacity" ? attrValue * 100 : parseInt(attrValue);
			var speed = (targetPos - attrValue) / speedScale;
			speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed)

			console.log(speed);

			if(targetPos != attrValue) {
				isStop = false;
				obj.style[attr] = attr == "opacity" ? (attrValue + speed) / 100 : attrValue + speed + "px";
			}
			if(isStop) {

				clearInterval(obj.timer);
			}
			console.log(getStyle(obj, attr));
		}, time)
	}

	function getStyle(obj, attr) {
		if(obj.currentStyle) {
			//支持 IE
			return obj.currentStyle[attr];
		} else {
			return getComputedStyle(obj)[attr];
		}
	}

	//第一排秒杀
	var Seckill = document.getElementById("seckill_t1");
	for(var j in Json["t1"]) {
		//创建外层div
		var Clothes = document.createElement("div");
		Clothes.className = "seckill_clothes";
		//创建图片
		var Img = document.createElement("img");
		Img.className = "clo_show";
		Img.src = Json["t1"][j]["showImg"];
		//创建介绍
		var Introduce = document.createElement("div");
		Introduce.className = "clo_introduce";
		var oSpan = document.createElement("span");
		oSpan.innerHTML = Json["t1"][j]["showIntruce"];
		Introduce.appendChild(oSpan);
		//创建价格
		var Price = document.createElement("div");
		Price.className = "clo_price";
		//创建之前的价格
		var oBrfore = document.createElement("span");
		oBrfore.className = "price_brfore";
		oBrfore.innerHTML = Json["t1"][j]["showBrfore"];
		//创建现在的价格
		var oAfter = document.createElement("span");
		oAfter.className = "price_after";
		oAfter.innerHTML = Json["t1"][j]["showAfter"];
		//创建充值后的价格
		var oMoney = document.createElement("span");
		oMoney.className = "price_money";
		oMoney.innerHTML = "充值后  <strong>" + Json["t1"][j]["showMoney"] + "</strong>元";
		var oPhoto = document.createElement("img");
		oPhoto.src = "img/购物车(2).png";
		oPhoto.className = "price_add";

		Price.appendChild(oBrfore);
		Price.appendChild(oAfter);
		Price.appendChild(oMoney);
		Price.appendChild(oPhoto);

		Clothes.appendChild(Img);
		Clothes.appendChild(Introduce);
		Clothes.appendChild(Price);
		Seckill.appendChild(Clothes);
	}
	//获取熊本熊
	var oBear = document.getElementById("bear_t2");
	for(var k in Json["t2"]) {
		//创建外出div
		var bearClothes = document.createElement("div");
		//创建图片
		var bearImg = document.createElement("img");
		bearImg.src = Json["t2"][k]["showImg"];
		bearClothes.className = "bear_clothes";
		bearClothes.appendChild(bearImg);
		console.log(bearClothes);
		oBear.className = "bear_t2";
		oBear.appendChild(bearClothes);

	}

	//获取新品预售div
	var oNew = document.getElementById("new_t3");
	for(var j in Json["t3"]) {
		//创建外出div
		var newClothes = document.createElement("div");
		//创建图片
		var newImg = document.createElement("img");
		newImg.src = Json["t3"][j]["showImg"];
		newClothes.className = "new_clothes";
		newClothes.appendChild(newImg);
		console.log(newClothes);
		oNew.className = "new_t3";
		oNew.appendChild(newClothes);
	}

	//获取购物车
	var searchShop = document.getElementById("search_shop");
	var searchImg = document.getElementById("search_img");
	//购物车
	var shoppings = document.getElementById("shopping");
	//隐藏框
	var shopBox = document.getElementById("shop_box");
	var shopHidden = document.getElementById("shop_hidden");
	var shopWold = document.getElementById("shop_wold");
	var shopBottom = document.getElementById("shop_bottom");
	//购物车的移入移出
	searchShop.onmouseover = function() {
		searchImg.src = "img/顶部/shopCar.png";
		shoppings.style.color = "red";
		searchShop.style.borderColor = "red";
		searchShop.style.borderBottomColor = "white";
		shopBox.style.display = "block";
	}
	searchShop.onmouseout = function() {
			searchImg.src = "img/顶部/shopCar2.png";
			shoppings.style.color = "white";
			searchShop.style.borderColor = "white";
			shopBox.style.display = "none";
			if(shopHidden.innerHTML == "") {
				shopWold.innerHTML = "购物车中还没有添加商品~";
				shopBottom.style.display = "none";
			} else {
				shopWold.innerHTML = "最近加入的商品:";
				shopBottom.style.display = "block";
			}
		}
		//隐藏框的移入移出
	shopBox.onmouseover = function() {
		searchImg.src = "img/顶部/shopCar.png";
		shoppings.style.color = "red";
		searchShop.style.borderColor = "red";
		searchShop.style.borderBottomColor = "white";
		shopBox.style.display = "block";
	}
	shopBox.onmouseout = function() {
		searchImg.src = "img/顶部/shopCar2.png";
		shoppings.style.color = "white";
		searchShop.style.borderColor = "white";
		shopBox.style.display = "none";
	}

	//计数
	var num = 0;
	//计算总金额
	var sum = 0;
	//添加购物车
	Seckill.addEventListener("click", function(ev) {
		num++;
		var ev = ev || window.event;
		var target = ev.target || ev.srcElement;
		if(target.className.toLowerCase() == "price_add") {
			swal({
				position: 'center',
				type: 'success',
				title: '购物车添加成功~',
				showConfirmButton: false,
				timer: 1500
			})
			console.log(target);
			var cloPrice = target.parentNode; //父级
			var priceAfter = cloPrice.children[1].innerHTML; //现价
			console.log("现价: " + priceAfter);
			var secClothes = target.parentNode.parentNode; //爷爷呀
			var cloShow = secClothes.children[0].src; //图片路径`
			var cloIntroduce = secClothes.children[1].children[0].innerHTML; //简介
			console.log(cloIntroduce);
			console.log(cloShow);
			//创建新的div 放到隐藏购物车里
			var hiddenNew = document.createElement("div");
			var hiddenImg = document.createElement("img"); //图片
			var hiddenIntro = document.createElement("span"); //简介
			var hiddenAfter = document.createElement("span"); //价格
			var hiddenBtn = document.createElement("button"); //删除
			var inputAdd = document.createElement("input"); //加
			var inputSub = document.createElement("input"); //减
			var spanNum = document.createElement("span"); //数量
			var getallNum = document.createElement("div");
			console.log(hiddenBtn);
			hiddenImg.src = cloShow;
			hiddenIntro.innerHTML = cloIntroduce;
			hiddenAfter.innerHTML = priceAfter;
			hiddenBtn.innerHTML = "删除";
			hiddenNew.className = "hidden_new";
			hiddenImg.className = "hidden_img";
			hiddenIntro.className = "hidden_intro";
			hiddenAfter.className = "hidden_After";
			hiddenBtn.className = "hidden_btn";
			inputSub.type = "button";
			inputAdd.type = "button";
			inputSub.value = "-";
			spanNum.innerHTML = 1;
			inputAdd.value = "+";
			inputAdd.className = "input_add";
			inputSub.className = "input_sub";
			getallNum.className = "getall_num";
			getallNum.appendChild(inputSub);
			getallNum.appendChild(spanNum);
			getallNum.appendChild(inputAdd);
			hiddenNew.appendChild(hiddenImg);
			hiddenNew.appendChild(hiddenIntro);
			hiddenNew.appendChild(hiddenAfter);
			hiddenNew.appendChild(getallNum);
			hiddenNew.appendChild(hiddenBtn);
			shopHidden.appendChild(hiddenNew);
		}
		var newAfter = parseInt(priceAfter.substring(1));
		var newOK = document.createElement("div");
		newOK.innerHTML = "立即结算";
		newOK.className = "new_ok";
		sum += newAfter;
		shopBottom.innerHTML = "共计" + "<strong> ¥" + sum + "</strong>";
		shoppings.innerHTML = "购物车(" + num + ")";
		shopBottom.appendChild(newOK);
	})
	var nums = 0;
	var reg = /\d+/g;
	//点击删除
	shopHidden.addEventListener("click", function(ev) {
		var ev = ev || window.event;
		var target = ev.target || ev.srcElement;
		if(target.className.toLowerCase() == "hidden_btn") {
			//previousSibling  向上获取兄弟标签
			console.log(target.previousSibling.children[1]);
			var oas = parseInt(target.previousSibling.children[1].innerHTML);
			var Afternumber = parseInt(target.parentNode.children[2].innerHTML.substring(1));
			console.log(Afternumber);
			sum -= Afternumber * oas;
			shopBottom.innerHTML = "共计" + "<strong> ¥" + sum + "</strong>";
			target.parentNode.remove();
			num--;
			if(num <= 0) {
				num = 0;
			}
			shoppings.innerHTML = "购物车(" + num + ")";
		}
		//加号
		if(target.className.toLowerCase() == "input_add") {
			target.parentNode.children[1].innerHTML = parseInt(target.parentNode.children[1].innerHTML) + 1;
			var str = shopBottom.innerHTML;
			var oMoneys = parseInt(target.parentNode.parentNode.children[2].innerHTML.substring(1));
			shopBottom.innerHTML = "共计" + "<strong> ¥" + (parseInt(str.match(reg)) + oMoneys) +
				"</strong>";
			sum = parseInt(shopBottom.innerHTML.match(reg));
		}
		//减号
		if(target.className.toLowerCase() == "input_sub") {
			if(target.parentNode.children[1].innerHTML > 1) {
				//				target.parentNode.children[1].innerHTML = 1;
				target.parentNode.children[1].innerHTML = parseInt(target.parentNode.children[1].innerHTML) - 1;
				var str = shopBottom.innerHTML;
				var oMoneys = parseInt(target.parentNode.parentNode.children[2].innerHTML.substring(1));
				shopBottom.innerHTML = "共计" + "<strong> ¥" + (parseInt(str.match(reg)) - oMoneys) +
					"</strong>";
				sum = parseInt(shopBottom.innerHTML.match(reg));
			}
		}
		var newOK = document.createElement("div");
		newOK.innerHTML = "立即结算";
		newOK.className = "new_ok";
		shopBottom.appendChild(newOK);
	})

	//	倒计时
	function countTime() {
		var date = new Date();
		var now = date.getTime();
		var endDate = new Date("2018-08-03 16:00:00"); //设置截止时间
		var end = endDate.getTime();
		var leftTime = end - now; //时间差                              
		var h, m, s;
		if(leftTime >= 0) {
			h = Math.floor(leftTime / 1000 / 60 / 60 % 24);
			m = Math.floor(leftTime / 1000 / 60 % 60);
			s = Math.floor(leftTime / 1000 % 60);
			if(s < 10) {
				s = "0" + s;
			}
			if(m < 10) {
				m = "0" + m;
			}
			if(h < 10) {
				h = "0" + h;
			}
		} else {
			console.log('已截止');
		}
		//将倒计时赋值到div中
		var hh = document.getElementById("_h")
		hh.innerHTML = h + "时";
		var mm = document.getElementById("_m")
		mm.innerHTML = m + "分";
		var ss = document.getElementById("_s")
		ss.innerHTML = s + "秒";
		setTimeout(countTime, 50);
	}
	countTime();

}