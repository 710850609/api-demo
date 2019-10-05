# api-demo
## 项目简介
- 一个简单增删改查服务
- 前后端分离.前端使用vue,后端基于spring-boot,h2database,mybatis实现


## 编译运行
下载源代码
```bash
git clone https://github.com/710850609/api-demo.git
```

编译代码
```bash
cd api-demo
mvn clean install
```

运行
```bash
cd target
java -jar api-demo-v1.0.jar
```
默认以80端口启动,如果出现端口占用使用其他端口启动.如使用8888端口启动,命令如下
```bash
java -jar api-demo-v1.0.jar --server.port=8888
```

## 运行效果
本地访问 http://localhost:80

![查询页面](https://upload.cc/i1/2019/10/05/ynsLxB.png)
![编辑页面](https://upload.cc/i1/2019/10/05/4lTS8q.png)