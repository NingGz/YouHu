# maven使用手册

#### maven的优点

1 pox中直接引入jar

2 一条命令编译整个工程

3 测试更强，能够帮助coder更好的测试

4 无需手动打包

#### maven依赖管理

传统jar: jar在项目中

mavne项目jar：通过pox直接通过导入

#### maven项目一键构建

![1567128172796](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567128172796.png)

#### maven私服

概念:根据项目需要公司自己建立的服务器

![1567128659127](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567128659127.png)

#### 本地仓库维护位置

![1567128699114](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567128699114.png)

#### 标准maven目录结构

![1567128982708](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567128982708.png)

#### maven常用命令

mvn clean 删除本地编译信息(项目在带的编译信息)

mvn compile  对src main中的方法进行编译

mvn test  运行测试代码

mvn test-compile 编译测试代码

mvn package 将项目打成包

mvn jar:jar 只打jar包

mvn install 在等地Repository中安装jar

mvn eclipse:clean 清除一些eclipse系统设置

mvn depioy 上传到私服

mvn dependency:list 查看项目当前依赖

mvn clean install-U 强制检查更新

mvn source:jar 打包源码

#### maven的生命周期

![1567130718252](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567130718252.png)

#### maven概念模型图

![1567130885691](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567130885691.png)

#### maven 包冲突解决

```xml
<dependency>	
	<scope>加入作用域</scope>
    <!-- 在编译的时候使用-->
    <scope>provided</scope>
    <!-- 在test中使用-->
    <scope>test</scope>
</dependency>
```

#### maven工程环境变量修改

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.tomcat.maven</groupId>
            <artifactId>tomcat8-maven-plugin</artifactId>
            <version>8.5</version>
        </plugin>
    </plugins>
</build>
```

