SSM+vuejs开发新闻、段子发布系统,包括前台显示和后台管理

项目描述

SSM+vue新闻、段子发布系统，前后端分离。

运行环境

jdk8+tomcat8+mysql+IntelliJ IDEA+maven

项目技术(必填)

spring+spring mvc+mybatis+vuejs

注意事项(可选)

1.后台代码的端口是8081，地址是：http://localhost:8081/wcdog/

2.前端界面和后台界面都是vue项目，要先npm install ,然后npm run serve

3.解压后三个文件夹，wcdog-master，wcdog-manager-master，wcdog-web-master.

wcdog-master是后台代码（需要修改db.properties里面的数据库连接信息，包括user及password），wcdog-web-master是页面前端代码，wcdog-manager-master是后台管理界面代码

4.运行项目前先执行sql.

5.需要先运行ssm后台代码，在运行前端前台项目和前端后台项目，端口分别为8081,8080,8082.