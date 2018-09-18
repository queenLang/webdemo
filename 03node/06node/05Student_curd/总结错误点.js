



/*
*
*
* 1.在页面接收json数据时,如果json 里面直接是数据 ,那么可以直接获取,不用each
*
* 2.如何在点击编辑时确定点击的是第几个?
* each 有自带的属性 index / $index ,可以把 index属性 拼接在要传过来的网址上,
* 如 a?item={{$index}}
* 到js文件中 ,通过 urlObj.query.item 来获取下标,确定是数组中的第几个,在把获得的数据返回到页面
*
* 3. 在点击编辑时, 如何通过node传过来的值, 来确定男女的值,在value上做判断
*
* 4. 如何在新增时,确定id的为继续往下, 首先 在新增提交时,需要将填写的值写成json字符串,添加到数组中,
* 所以,想确定id的值,可以根据数组里的下标进行判断,
* json.students.length != 0 ? json.students[json.students.length - 1].id + 1 : 1
* 判断数组的长度是不是不等于0,如果不等于0,那么id 等于数组里最后一个得下标 + 1
*
* 5.因为新增和编辑都是一个页面,所以在首页点击新增和编辑时,需要更改addStudent的显示的内容,并且在提交时需要进行判断,
* 是继续向数组中添加,还是修改数组里面的数据,可以在最外层定义两个变量 ,
* let choice = ""; 用来定义是add 还是 编辑
  let subIndex = 0; 用来定义当前下标,在编辑时,将传过来的下标赋值给subIndex,
* 然后在提交得时候进行判断 choice == add ,当等于 add时, 向数组中添加数据,
* 当 != add时, 用json.students.splice(subIndex, 1, mesObj); 将数组中 下标为 subIndex 的值删除,
* 再将新数组赋值
*
*
* */