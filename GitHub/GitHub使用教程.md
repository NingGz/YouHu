# GitHub使用教程

### Git和Github详细教程

#### 一  概述：

说到Git，很多人会想到svn,svn是集中式的版本控制工具，相比Git,Git更强大，Git出自linux之父林纳斯之手，而Git又全面兼容linux，这对编程开发人员来说是非常爽的，下面我们看看版本控制工具应该具备的功能 :

1 协同修改，多人并行不悖的修改服务器端的同一个文件，数据备份。
2 不仅保存目录和文件的当前状态， 还能够保存每一个提交过的历史状态。
3 版本管理
4 在保存每一个版本的文件信息的时候要做到不保存重复数据， 以节约存储空间， 提高运行效率。 这方面 SVN 采用       的是增量式管理的方式， 而 Git 采取了文件系统快照的方式。
5 权限控制
6 对团队中参与开发的人员进行权限控制。
7 对团队外开发者贡献的代码进行审核——Git 独有。
8 历史记录
9 查看修改人、 修改时间、 修改内容、 日志信息。
10 将本地文件恢复到某一个历史状态。
11 分支管理
12 允许开发团队在工作过程中多条生产线同时推进任务， 进一步提高效率。

#### 二  版本控制介绍

#####        2.1 版本控制简介

​             工程设计领域中使用版本控制管理工程蓝图的设计过程。 在 IT 开发过程中也可以

#####  	 2.2 版本控制工具

​        	集中式版本控制工具：CVS、 SVN、 VSS  and so  on

![img](https://img-blog.csdn.net/20180609163114362?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4OTc0NjM0/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

​		

##### 分布式版本控制工具

Git、 Mercurial、 Bazaar、 Darcs and so on分布式版本控制工具像Git支持分支管理，如下：

![img](https://img-blog.csdn.net/20180609163309706?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4OTc0NjM0/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

# Git历史

####  3.1 Git发展史





![img](https://img-blog.csdn.net/20180609163937377?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4OTc0NjM0/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)





#### 3.2 Git官网

​       Git官网地址：https://git-scm.com/

#### 3.3 Git优势

​        1  大部分操作在本地完成，不需要联网

​		2 完整性保证

​		3 尽可能添加数据而不是删除或修改数据

​		4 分支操作非常快捷流畅

​		5 与Linux命令全面兼容

#### 3.5 Git的结构

![img](https://img-blog.csdn.net/20180609164905731?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4OTc0NjM0/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

#### 3.6 本地库和远程库

![img](https://img-blog.csdn.net/20180609165205257?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4OTc0NjM0/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)



### 四  Git操作

#### 4.1 Git安装

##### 	4.1.1 准备Git安装包以及乌龟svn管理软件安装包

​	![img](file:///C:\Users\32621\AppData\Roaming\Tencent\Users\326212101\QQ\WinTemp\RichOle\B0~YI$XH%LUVRC]M[_`TR{F.png)

##### 	4.1.2 安装过程 以及注意事项

​	（Git安装全选默认，直接点击下一步即可这里不做过多介绍）

​									A. 安装Git

![1571020344148](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571020344148.png)





​									B.安装svn

![1571020420686](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571020420686.png)



#### 			（注意在这个地方要选择第二个 其余全选默认这里不做过多解释）

![1571020498448](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571020498448.png)



​								    C.添加中文语言环境

![1571020636855](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571020636855.png)

​									

​									![1571020674055](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571020674055.png)





### 						D 注意首次打开乌龟的时候 会出现可选的配置框

​									(在这里一定要先安装语言包这样在首次配置的时候就能将语言设置为汉语)

​				![1571020787275](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571020787275.png)		

#### 			（这里要注意留下自己的名称和邮箱地址 这相当联系方式 需要确实可行的）

​			![1571021239574](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571021239574.png)



#### 4.2 创建本地仓库文件夹

##### 4.2.1在磁盘中创建一个工作空间（文件夹）右键选中 选择在此位置创建仓库



##### 文件初始化创建时空的，如果文件夹中有文件。那么需要将文件夹中存在的文件提交到分支中



#### 4.3 添加文件到缓存区/将文件上传到版本分支中

4.3.1 添加（添加是将文件添加到缓存区中 只存在于本地）

4.3.2 提交 （将问价上传到项目分支中 需要写工作日志记录更新的内容）

4.4 修改/查看日志

​		a.在对本地仓库根目录中的文件进行修改后文件会出现红色图标（表示源文件发生修改）

​		b.版本中修改的日志可以右键选择显示日志，如果想看文件中不同的地方 可以选择对比版本不同功能

Tortoise

#### 4.4 删除/修改文件

4.4.1 删除文件

删除文件可以通过乌龟菜单选项卡中提供的删除，或者将文件直接删除然后再此提交更新本地仓来实现删除效果

4.4.2 修改文件 

直接在源文件上进行修改，或者提供同名文件对上一个文件进行覆盖

#### 4.5 创建远程仓库

4.5.1 在github网站中注册账号 注册完成后选择 open project 创建一个新的项目

4.5.2 选择一个通信协议 https  / ssh

ssh方法

##### 1 生成ssh密钥对：通过git命令 ssh-keygen -t rsa 来生成密钥

![1571038021740](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038021740.png)

 

2 生成的密钥在 user 文件夹下的 .ssh 文件中（此处我的ID为32621）

![1571038119019](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038119019.png)

#### 找到这个文件夹



![1571038147708](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038147708.png)

打开文件夹

![1571038269231](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038269231.png)

4.6 在远程端 配置公钥

（在头像中找到设置 按照一下图片流程）

![1571038387670](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038387670.png)



​						![1571038426317](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038426317.png)



​							![1571038522716](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038522716.png)

#### 	将公钥配置进入远程端（用记事本打开公钥文件 复制粘贴）

​	![1571038609983](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038609983.png)





![1571038762995](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038762995.png)







#### 添加完成

![1571038698785](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571038698785.png)





4.6 使用可视化（乌龟） 将本地仓库中的项目导入远程仓库中

如以下图流程

在项目文件夹空白处右击，找到设置

![1571041008894](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571041008894.png)



找到网络 将客户修改成git下载位置文件夹中的ssh.exe



![1571041056179](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571041056179.png)

![1571041163365](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571041163365.png)

#### 添加远程端（URL 是 github网站自动生成的）

![1571041212105](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571041212105.png)

#### 添加私钥（第一个是私钥）

![1571041327765](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571041327765.png)

##### (在putty密钥输入框中配置好私钥后 点击添加/保存 此时可视化操作界面会自动进行一次本地到远程的链接)

![1571122416817](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571122416817.png)

#### （配置好远端后即可将本地仓库的内容上传到git服务器中托管）

#### （点击git同步）

![1571051708761](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571122790762.png)

#### （点击推送 将本地未被忽略的受版本控制的不是在暂存区的文件上传到远端）

![1571122961563](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571122961563.png)

#### （完成上传）

![1571123128272](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571123128272.png)

#### （刷新远端界面）

![1571051764767](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571051764767.png)



#### 4.6 克隆远程仓库到本地

##### （在文件夹空白的地方右击 选择的克隆）

![1571124070268](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571124070268.png)

##### （在选项卡中 粘贴克隆的路径）

![1571054298573](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571054298573.png)

##### （点击确定将远程仓库中的文件克隆到本地）

![1571124319166](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571124319166.png)



# （注意事项）

#### 在hosts文件夹中加入你远程服务器的ip地址 和域名 这样加快解析 也能防止连接出错

![1571054777432](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571054777432.png)

#### 4.7 GitHub 修改冲突

当多个人对同一个文件进行修改的时候 如果修改的位置不是很贴近那么git会自动将修改前后的文件进行合并，否则如果修改文件过近，那么git就不能会将文件合并，而是将文件不一样的地方都放到问价中。让开发者自己决定使用那一段

#### 选中冲突的文件 或者文件夹 选择解决冲突 （冲突的文件上会有黄色感叹号）

![1571126102871](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571126102871.png)



#### 4.8 github 版本分支

##### 4.8.1 创建本版本分支

##### 主分支

![1571128570905](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571128570905.png)

##### 创建分支

![1571128651274](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571128651274.png)

#### 在选项卡中选择创建分支

![1571129027675](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571129027675.png)

![1571129288634](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571129288634.png)



##### 切换分支

![1571129248680](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571129248680.png)

##### (分支相当于一个小组开发的一方面内容 由于项目是同时进行的,为了确保每个小组之间互不干扰的开发采取分支)

#### 4.9 分支的合并

##### 1 先将当前的分支切换为主分支 

![1571149411836](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571149411836.png)

![1571149434973](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571149434973.png)

##### 2 选择合并选项卡 

选择不受主分支控制的分支 并且对其进行合并操作

![1571149583342](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1571149583342.png)

#### 确认合并后 主分支和分支共有的文件会 可能发生冲突 这个时候需要管理这自行决定使用那个分支的文件



### 5 在idea中加入Git （Intellij IDEA和Git同步）

-------暂时没有 使用Interllij 有需要的话 请自行百度