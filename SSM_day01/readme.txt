spring+springmvc+mybatis  maven管理配置

配置pom.xml，导入包
手动导入oracle数据库驱动
配置web.xml， spring监听器和springmvc的核心控制器
配置applicationContext.xml（spring）、db.properties（数据源）、log4j.properties（日志）、
    MyBatis-config.xml（mybatis）、springmvc-servlet.xml（springmvc）
反向生成dao层和model层（需要更改mapper文件中的包名，需要添加一个按条件查询的方法，需要更改id自增序列）
编写service层与action层


测试：http://localhost:8686/SSM_day01/user/query.do