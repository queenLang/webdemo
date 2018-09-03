window.onload = function() {

	document.getElementById('myUL').onclick = function(event) {
		if(event.target.tagName == 'LI') {
			// 获取到所有的 classname, 添加横线样式.
			// toggle 有就删除, 没有就添加
			event.target.classList.toggle('checked');
		}
	};

	/* 功能1: 添加一个新任务 */
	//获取add按钮元素
	var addBtn = document.getElementsByClassName('addBtn')[0];
	//    按钮添加点击事件
	addBtn.onclick = function() {

		//获取用户输入的内容
		var inputValue = document.getElementById('myInput').value;
		console.log("inputValue: " + inputValue);
		if(!inputValue || inputValue == "") {
			swal("请添加小秘密内容", "了解~\(≧▽≦)/~", "warning")
		} else {

			swal({
				position: 'center',
				type: 'success',
				title: '小秘密添加成功~',
				showConfirmButton: false,
				timer: 1500
			})

			//创建新的li元素,用于生成新的任务列表
			var li = document.createElement('li');

			//将用户输入的内容添加到列表上.
			li.appendChild(document.createTextNode(inputValue));

			//把任务添加到列表上
			document.getElementById('myUL').appendChild(li);

			//给新创建的添加关闭按钮
			addCloseBtn(li);
		}
	};

	/* 给默认元素添加关闭按钮 */
	//获取已存在的列表元素
	var lists = document.getElementsByTagName('li');
	//遍历获取到的li元素集合,给每一个li元素添加关闭按钮
	for(var i = 0; i < lists.length; i++) {
		addCloseBtn(lists[i]);
	}

	//添加关闭按钮方法
	function addCloseBtn(liElement) {
		//创建关闭按钮
		var span = document.createElement('span');
		span.appendChild(document.createTextNode('\u00D7'));
		//给元素添加属性.
		span.setAttribute('class', 'close');
		liElement.appendChild(span);

		span.onclick = function(ev) {
			var ev = ev || window.event;
			swal({
				title: "确定删除小秘密？",
				text: "你将无法恢复的呦!~",
				type: "warning",
				showCancelButton: true,
				confirmButtonText: '确定',
				cancelButtonText: '取消',
			}).then(function(isConfirm) {
				console.log(isConfirm);
				if(isConfirm.value == true) {
					// 删除!
					span.parentNode.remove();
					swal("删除！", "你的小秘密已经被删除。",
						"success");

				} else {
					swal({
						  title: "取消！", 
				  text: "放心, 你的小秘密很安全:)", 
				  timer: 1500, 
				  showConfirmButton: false 
				 
					});
				}
			});

			

			//this指代的就是调用此函数的对象
			//			this.parentNode.style.display = 'none';
		}
	}

};