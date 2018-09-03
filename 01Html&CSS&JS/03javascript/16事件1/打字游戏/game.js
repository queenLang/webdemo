 
var CODE = "QWERTYUIOPASDFGHJKLZXCVBNM";
var codeArray = [];
var number = 0; 

//创建随机字母 
function createCode(){
	//0-25
	var index = parseInt(Math.random()*26);
	return CODE.charAt(index);
};
 
//创建显示label方法
function createLabel(code){
	/**
	 * <label class="label">
			A
		</label>
	 */
	var label = document.createElement("label");
	label.className = "label";
	label.style.top = "50px";
	label.style.color = getRandomColor();
	label.style.fontSize = "100px";
	label.innerHTML = code;
	label.code = code;
	
	var html = document.documentElement;
	
	//所有label标签的x坐标
	var labelX = parseInt(Math.random()*html.clientWidth);
	if(labelX>100){
		labelX-=20;
	}
	
	label.style.left = labelX+"px";
	
	return label;
}
 
window.onload = function(){
	document.getElementById("startBtn").disabled = false;
	
	
	//注册键盘事件
	document.documentElement.onkeydown=function(event){
		var keyCode = event.keyCode; //获取按下的吗
		var code = String.fromCharCode(keyCode);//A-Z
		for ( var i = 0; i < codeArray.length; i++) {
			//label标签
			var label = codeArray[i];
			if(label.code==code){
					clearInterval(label.interval_id);
					label.parentNode.removeChild(label);
					codeArray.splice(i,1);
					number+=10;
					
					document.getElementById("msg").innerHTML = number+"分";
				break;
			}
		}
	};
};
 
//让label标签慢慢的从上向下移动
function runLabelTop(label){
	
	//获取页面的高度
	var height = Math.max(document.documentElement.clientHeight,document.documentElement.scrollHeight);
	
	label.interval_id = setInterval(function(){
		//50px
		var top = parseInt(label.style.top);
		top+=1;
		//判断label是否已经超过页面的高度
		if(top>height-30){
			removeLabel(label,false);
		}else{
			label.style.top = top+"px";
		}
	},10);
}
 
//flag = false用户没有按下该字母
function removeLabel(label,flag){
	clearInterval(label.interval_id);
	label.parentNode.removeChild(label);
	codeArray.shift();
	number-=20;
	document.getElementById("msg").innerHTML = number+"分";
}
 
var game_id = null;
 
//开始游戏
function startGame(startButton){
	
	startButton.disabled = true;
	
	game_id = setInterval(function(){
		//创建要显示的字符
		var code =createCode();
		//创建一个label显示字符
		var label = createLabel(code);
		
		//让label标签慢慢向下移动,修改标签的style.top属性
		runLabelTop(label);
		
		//把label标签节加入到页面中
		document.body.appendChild(label);
		codeArray.push(label);
	},500);
}
 
//停止游戏
function stopGame(){
	clearInterval(game_id);
	for ( var i = 0; i < codeArray.length; i++) {
		clearInterval(codeArray[i].interval_id);
		codeArray[i].parentNode.removeChild(codeArray[i]);
	}
	codeArray = [];
	document.getElementById("startBtn").disabled = false;
}

 function getRandomColor() {
	var r = Math.floor(Math.random() * 256);
	var g = Math.floor(Math.random() * 256);
	var b = Math.floor(Math.random() * 256);
	//var a = Math.random();
    var a = 1;
	return "rgba(" + r + "," + g + "," + b + "," + a + ")";
}
 
 