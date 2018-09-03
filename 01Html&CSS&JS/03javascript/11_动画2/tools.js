/**
 * 获得最终 CSS 属性值  获取的是字符串 "~px"
 * @param {Object} obj
 * @param {Object} attr
 */

function getStyle(obj, attr) {
	if(obj.currentStyle) {
		//支持 IE
		return obj.currentStyle[attr];
	} else {
		return getComputedStyle(obj)[attr];
	}
}

//随机数
function getNum(max, min) {
	var a = Math.floor(Math.random() * (max - min + 1) + min);
	return a;
}

//随机颜色
/**
 * @param 
 */
function getRandomColor() {
	var r = Math.floor(Math.random() * 256);
	var g = Math.floor(Math.random() * 256);
	var b = Math.floor(Math.random() * 256);
//	var a = Math.random();
    var a = 1;
	return "rgba(" + r + "," + g + "," + b + "," + a + ")";
}

/**
 * 匀速运动
 * 无论输入width,left,top,height ,正负  都可以使用这个函数
 * @param {Object} obj
 * @param {Object} torgetPos
 * @param {Object} speed
 * @param {Object} attr
 * @param {Object} time
 */
function startMove(obj, torgetPos, speed, attr, time) {
	clearInterval(obj.timer);
	obj.timer = setInterval(function() {
		var attrValue = parseInt(getStyle(obj, attr));
		if(Math.abs(attrValue - torgetPos) <= Math.abs(speed)) {
			obj.style[attr] = torgetPos + "px";
			clearInterval(obj.timer);
		} else {
			obj.style[attr] = attrValue + speed + "px";
		}
		console.log(getStyle(obj, attr));
	}, time)
}
/**
 * 缓冲运动
 * @param {Object} obj
 * @param {Object} attrJson
 * @param {Object} speedScale
 * @param {Object} time
 */
function easeMove(obj, attrJson, speedScale, time) {

	clearInterval(obj.timer);
	obj.timer = setInterval(function() {
		var isStop = true; //记录是否清除当前属性的定时器 true 清除
		for(var attr in attrJson) {
			console.log("attr: " + attr + " isStop" + isStop);
			var targetPos = attrJson[attr];

			var attrValue = getStyle(obj, attr);
			attrValue = attr == "opacity" ? attrValue * 100 : parseInt(attrValue);

			var speed = (targetPos - attrValue) / speedScale;
			speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed);

			//console.log("speed: " + speed + "attrValue: " + attrValue + "targetPos: " + targetPos);

			if(attrValue != targetPos) {
				//如果当前属性的值与目标值不相同,定时器不能清除
				isStop = false;
				obj.style[attr] = attr == "opacity" ? (attrValue + speed) / 100 : attrValue + speed + "px";
			}
		}
		console.log("--------------");
		//如果是 true ,说明完成运动,所以可以清除
		if(isStop) {
			clearInterval(obj.timer);
		}
		console.log(getStyle(obj, attr));
	}, time)
}