$(document).ready(function(){
	$(window).resize(setSize);
	chkCon();
	setSize();
});
function setSize(){
	var w = $(window).width();
	if(w < 640){
		$(".center").css({width:"96%"});
	}else if(w < 1200){
		$(".center").css({width:w * 0.78});
	}else{
		$(".center").css({width:"1200px"});
	}
	resizeCon();
}
function chkCon(){
	if($(".con img").height() < 10)
	{
		setTimeout(chkCon, 100);
		return;
	}
	resizeCon();
}
function resizeCon(){
	$(".con").css({height:($(".con img").height() + $(".con p").height())});
}