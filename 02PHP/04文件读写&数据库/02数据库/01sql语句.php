

插入

    INSERT INTO 表名 (字段名1,字段名2...) VALUES (值1,值2...)

    插入一条数据
    INSERT INTO user(name,age,sex) VALUES('傅恒',20,'男')

    插入多条数据
    INSERT INTO user (name,age,sex) VALUES ("晶晶",16,"女"),("杨紫",16,"女")

删除

    DELETE FROM 表名

    删除表格中的数据,但是表存在
    DELETE FROM user

    删除user表中 id为1的数据
    DELETE FROM user WHERE id = 1

    删除user表中 年龄大于20 且 性别为男  用AND连接
    DELETE FROM user WHERE age > 20 AND sex = "男"

改

    如果不写条件会更新表中该字段对应的所有的数据
    UPDATE 表名 SET 字段名1 = 值1,字段2 = 值2.... WHERE 条件

    将user表中id为2 改为 name = "邓伦",age = 18
    UPDATE user SET name = "邓伦",age = 18 WHERE id = 2

查找

    SELECT * FROM 表名 WHERE 条件

    查找表中所有的数据
    SELECT * FROM user

    只查找所有name字段对应的数据
    SELECT name FROM user

    只查找name,age字段对应的数据
    SELECT name,age FROM user

    查找年龄不等于18岁
    SELECT * FROM user WHERE age != 18
    SELECT * FROM user WHERE age <>18


    模糊查询

    查找name以 鱼 开头的
    SELECT * FROM user WHERE name like "鱼%"
    查找name以 鱼 结尾的
    SELECT * FROM user WHERE name like "%鱼"
    查找name包含 红
    SELECT * FROM user WHERE name like "%鱼%"

    排序查询

    按照年龄排序 默认升序  升序 : asc  降序 : desc
    SELECT * FROM user ORDER BY age
    降序排序
    SELECT * FROM user ORDER BY age desc

    按照拼音排序
    SELECT * FROM user order by convert(name using gbk)

    从第二个开始找,查询4个
    数据库中的数据默认从0开始
    SELECT * FROM user LIMIT 2,4



























