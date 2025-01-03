# kkblog
基于springboot+vue的个人博客系统
## 客户端体验地址
[kkblog客户端演示链接](http://106.53.179.195:8080/#/)
账号：kkk
密码：1234
## 管理端体验地址
[kkblog管理端演示链接](http://106.53.179.195:8787/))
账号：kkk
密码：1234

## **一. 技术特点**

1. 数据库及可视化工具：

​      数据库：mysql5.6

​      可视化工具：Navicat16

2. 开发工具包：JDK1.8

3. 技术栈：

​		语言：java,javascript

​		框架：springboot

4. 前端：vue

5. 其他技术：

​        Web + springBoot + redis + mybatis-plus + springscurity

# 二、 **客户端功能说明**

## **1. 注册账号：**

  \- 访问随心博客的注册页面。

  \- 输入您的用户名、邮箱和密码。

  \- 点击注册按钮，完成账号的创建。

![image](https://github.com/user-attachments/assets/165899b8-4b6d-4ea1-83af-fe600f1e8dee)


## **2. 登录账号：**

  \- 访问随心博客的登录页面。

  \- 输入您的用户名和密码。

  \- 点击登录按钮，完成账号的登录。

![image](https://github.com/user-attachments/assets/63570b62-5172-46f6-af37-fe5973678f9d)


## **3. 登录校验：**

  \- 随心博客使用Spring Security安全框架进行登录校验。

  \- 登录时，系统会验证您的用户名和密码是否正确。

  \- 如果登录信息无误，您将被重定向到博客主页。

 

![image](https://github.com/user-attachments/assets/175ae667-c00b-47a8-8999-b99349eb294b)


 

## **4. 热门推荐：**

 热门文章推荐功能：将博客系统中最受欢迎、关注度最高的前10篇博客文章进行排序

并展示给用户。这个功能可以帮助用户快速找到平台上最热门的内容，增加用户的阅	读兴趣和平台的用户粘性。

在随心博客中，热门文章排行通过文章浏览量进行排名。

![image](https://github.com/user-attachments/assets/21a37be0-6a6a-4bbb-832c-a2504fc07c90)


## 5. **查看文章详情**

在随心博客中，查看博客详情并增加其浏览量是博客系统的基本功能之一。以下是这个功能的描述：

### **5.1 查看博客详情：**

  \- 用户在博客列表或首页看到感兴趣的博客标题后，可以通过点击标题或查看详情按钮进入博客详情页面。

  \- 博客详情页面展示了文章的完整内容、作者信息、发布日期、浏览量、评论列表等。

### **5.2 增加浏览量：**

  \- 每当用户访问博客详情页面时，系统会记录一次浏览。

![image](https://github.com/user-attachments/assets/1c85e719-a132-43f8-8e0e-a9f7e4712cf7)


###  

## **6.评论管理**

评论功能是随心博客的重要组成部分，它允许用户对博客文章进行互动和讨论。在随心博客中，文章评论功能包括以下几个方面：

### **6.1 发表评论：**

  \- 用户在阅读博客详情时，可以输入评论内容并提交。

  \- 评论可以包含文字、表情和可能的附件（如图片）。

  \- 用户需要登录后才能发表评论，以维护社区秩序和用户责任感。

### **6.2 查询评论：**

  \- 博客详情页面会展示该文章的所有评论，通常按照时间顺序排列。

  \- 用户可以浏览评论来了解其他人的看法和讨论。

### **6.3 多级评论（嵌套评论或回复评论）：**

  \- 用户可以针对特定的评论进行回复，形成多级评论结构。

  \- 这样可以更好地组织讨论，让用户之间的对话更加清晰。

  \- 多级评论通常通过递归的方式在界面中进行展示，以便用户可以轻松地跟踪对话线索。

### **6.4 评论管理：**

  \- 博主或管理员可以对评论进行管理，包括审核、编辑、删除等操作。

  \- 这有助于维护社区的良好氛围，防止不当言论的出现。

![image](https://github.com/user-attachments/assets/6c6c58d8-8fe6-408e-94fc-4de6a2805797)


 

## **7文章分类功能**

文章分类是随心博客中的一个重要功能，它允许用户根据自己的兴趣或者特定的主题来浏览和查找文章。在随心博客中，文章分类的实现可以分为以下几个步骤：

### **7.1 分类展示：**

  \- 在博客的前台界面，通常会展示所有的分类或者部分热门分类。

  \- 用户可以通过点击某个分类来查看该分类下的所有文章列表。

### **7.2 文章关联分类：**

  \- 当博主撰写或编辑文章时，可以为文章选择一个或多个分类。

  \- 这样，文章就会与这些分类关联起来，便于用户通过分类来查找。

### **7.3 分类过滤：**

  \- 用户在浏览博客时，可以通过分类过滤功能来筛选出感兴趣的文章。

  \- 这通常通过在博客列表页面提供分类筛选菜单来实现。

![image](https://github.com/user-attachments/assets/8153cbee-6ba5-4aa7-bed9-4ee010408a16)


![image](https://github.com/user-attachments/assets/d77d9af9-61cf-4672-92e7-9579d5d4bf68)


 

## 8. **友链功能**

友链功能，即友情链接功能，是博客中的一种常见功能，它允许博主添加其他网站的链接，通常这些网站与自己的博客内容有一定的相关性或者互相有兴趣。在随心博客中，友链功能的实现和作用如下：

### **8.1 添加友链：**

  \- 博主可以在博客的后台管理系统中添加新的友情链接。

  \- 添加时需要提供友情链接的名称、URL以及可选的图标和描述。

### **8.2 友链展示：**

  \- 前台博客界面通常会设有专门的友情链接区域，如边栏或底部。

  \- 展示的友链可以按照添加顺序、名称字母顺序或自定义顺序排列。

### **8.3. 友链管理：**

  \- 博主可以管理友情链接，包括编辑、删除或调整显示顺序。

  \- 博主还可以查看友链的点击情况，了解用户对哪些链接更感兴趣。

![image](https://github.com/user-attachments/assets/02338543-feb1-48cd-8fd2-f8efa5aff706)


 

## 9. **修改个人信息**

修改个人信息是博客系统中的基本功能之一，它允许用户更新自己的个人资料，以保持信息的准确性和最新状态。在随心博客中，修改个人信息通常包括以下几个步骤：

### **9.1 访问个人资料页面：**

  \- 用户登录后，可以通过导航菜单或个人头像点击进入个人资料页面。

### **9.2.编辑个人信息：**

  \- 在个人资料页面，用户可以看到自己的基本信息，如用户名、头像、性别、年龄、个人简介等。

  \- 点击“编辑”按钮或相应的编辑链接，进入编辑模式。

### **9.3 修改信息：**

  \- 用户可以在编辑模式下修改自己的个人信息。

  \- 可以更改的内容通常包括头像、用户名、性别、年龄、个人简介、联系方式等。

### **9.4 保存更改：**

  \- 修改完成后，用户需要点击“保存”或“更新”按钮，以保存更改。

  \- 系统可能会要求用户重新输入密码以确认身份。

![image](https://github.com/user-attachments/assets/2ef5d5b6-9597-4835-a557-fa0237f03cbf)


 

# 三、 **管理端功能说明**

## 1. **首页**

用于对该博客项目做一个简介

![image](https://github.com/user-attachments/assets/6bca083b-5b77-4104-9275-51946b3eeb09)


## 2. **写博文**

在随心博客的管理端，写博文功能是一个核心功能，它允许博主创建和发布新的文章。以下是这个功能的详细说明：

### **2.1 文章编辑器：**

  \- 提供一个markdown编辑器，允许博主撰写文章内容。

  \- 编辑器应支持常见的文本格式化功能，如加粗、斜体、列表、标题等。

  \- 高级编辑器还可能支持插入图片、视频、代码块等。

### **2.2 上传图片：**

  \- 在撰写文章时，博主可以上传图片到文章中。

  \- 系统应提供图片上传功能，并支持图片的预览和编辑（如裁剪、缩放、旋转等）。

  \- 上传的图片可以存储在服务器上，或者使用第三方云存储服务。

### **2.3 文章缩略图：**

  \- 博主可以为文章选择一个缩略图，这个图片将显示在文章列表中，吸引用户点击。

  \- 缩略图应具有良好的视觉效果，且尺寸符合网站设计要求。

### **2.4 文章分类：**

  \- 在发布文章时，博主需要为文章选择一个或多个分类。

  \- 分类有助于用户根据兴趣快速找到相关文章。

### **2.5 文章标签：**

  \- 博主可以为文章添加标签，用于描述文章的内容或特点。

  \- 标签有助于提高文章的搜索引擎优化（SEO）效果。

### **2.6 是否置顶：**

  \- 博主可以设置文章是否置顶，置顶文章将在博客首页或分类页面的顶部显示，以增加曝光率。

### **2.7 是否允许评论：**

  \- 博主可以决定是否开启文章的评论功能。

  \- 如果关闭评论，用户将无法对文章进行评论和互动。

### **2.8 保存和预览：**

  \- 在撰写过程中，系统应提供保存草稿的功能，以便博主随时保存进度。

  \- 预览功能允许博主在发布前查看文章的实际显示效果。

### **2.9 发布和管理：**

  \- 博主完成文章撰写后，可以选择发布文章，使其对公众可见。

  \- 已发布的文章可以随时编辑或删除。

通过这些功能，随心博客为博主提供了一个强大而灵活的工具来创建和管理工作内容，同时为读者提供了丰富的阅读体验。

![image](https://github.com/user-attachments/assets/f0240fe5-0e9d-46e7-b2b3-297cd73827b4)


 

## 3. **文章管理**

3.1 增加文章：

  \- 博主可以通过管理界面创建新的文章。

  \- 在创建过程中，博主需要填写文章的标题、内容，并选择文章分类和标签。

  \- 创建完成后，文章将被保存到数据库中。

### **3.2 查看文章：**

  \- 博主可以查看已发布文章的列表，以及每篇文章的详细内容。

  \- 查看功能通常包括文章标题、内容、作者、发布日期等信息。

### **3.3 编辑文章：**

  \- 博主可以对已发布的文章进行编辑。

  \- 编辑功能允许修改文章的标题、内容、分类和标签等。

  \- 修改后，文章将更新数据库中的记录。

### **3.4 删除文章：**

  \- 博主可以删除不再需要的文章。

  \- 该功能只是对文章进行逻辑删除，并非从数据库中完全删除

这些功能是文章管理的基础，它们为博主提供了对博客内容的完全控制。通过这些操作，博主可以确保博客内容的准确性和时效性，同时也能够根据读者的反馈和需求进行调整。

![image](https://github.com/user-attachments/assets/c3f47ea0-33a8-4fc0-90fe-7f12475c7ef6)


(文章内容管理)

![image](https://github.com/user-attachments/assets/603a0fb2-8167-4286-ac36-bf368576e395)


​     （编辑文章）

 

## 4. **分类管理功能**

在随心博客中，分类功能的设计旨在提供全面的分类管理能力，包括新增、修改、查找、删除分类，以及导出分类数据为Excel表格。以下是这些功能的详细说明：

### **4.1 新增分类：**

  \- 用户可以通过管理界面添加新的文章分类。

  \- 在添加分类时，用户需要输入分类名称，并可以选择一个父分类，以创建子分类。

### **4.2 修改分类：**

  \- 用户可以编辑现有分类的名称或父分类。

  \- 修改分类的操作可以保持分类系统的准确性和更新。

### **4.3 查找分类：**

  \- 用户可以通过搜索功能快速找到特定的分类。

  \- 搜索可以基于分类名称进行，以提升查找效率。

### **4.4 删除分类：**

  \- 用户可以删除不再需要的分类。

  \- 删除分类时，系统应提供确认步骤，以防止误操作。

  \- 删除分类可能会影响到该分类下的文章，因此系统需要处理这些文章的分类归属问题。

### **4.5 导出分类数据为Excel表格：**

  \- 用户可以将分类数据导出为Excel表格。

  \- 导出功能通常包括分类的名称、父分类、创建日期等关键信息。

  \- 导出操作可以通过一个按钮或链接触发，系统会生成Excel文件并提供下载链接。

通过这些功能，随心博客能够提供强大的分类管理能力，使用户能够轻松地组织和管理文章分类，并且能够灵活地处理分类数据，以满足不同的管理需求。

![image](https://github.com/user-attachments/assets/5b48f783-f06a-476f-8a38-10b43801c3b8)


（分类管理）

![image](https://github.com/user-attachments/assets/26182bf2-1a36-4730-a057-838e18198877)


（导出分类数据）

 

### 5. **友链管理功能**

管理员或博主可以在后台上传友链链接以及友链logo提供给前台访问

![image](https://github.com/user-attachments/assets/b6192544-bd61-447a-8d23-d8257e8939ef)


 

## 6. **标签管理功能**

标签管理功能是博客系统中的一个重要部分，它允许博主对文章进行标签的添加、编辑、删除和查看等操作。在随心博客中，标签管理功能包括以下几个方面：

### **6.1 添加标签：**

  \- 博主可以在撰写或编辑文章时为文章添加标签。

  \- 添加标签时，博主需要输入标签名称。

### **6.2 编辑标签：**

  \- 博主可以修改已有标签的名称。

  \- 编辑标签有助于保持标签系统的清晰和组织。

### **6.3 删除标签：**

  \- 博主可以删除不再需要的标签。

  \- 删除标签时，系统应提供确认步骤，以防止误操作。

### **6.4 查看标签：**

  \- 博主可以查看所有标签的列表，包括标签名称和文章数量。

  \- 查看功能有助于博主快速了解当前的标签使用情况。
  
![image](https://github.com/user-attachments/assets/dc1e381c-a1f1-4528-97fc-2f9646274635)


 

## 7. **用户管理功能**

用户管理功能是博客系统中的一个关键部分，它允许博主或管理员对用户账户进行创建、查找、编辑、禁用和删除等操作，同时还可以设置用户的权限，以实现不同角色的管理。在随心博客中，用户管理功能通常包括以下几个方面：

### **7.1 新增用户：**

  \- 博主或管理员可以创建新的用户账户。

  \- 创建时需要输入用户名、密码、邮箱等基本信息。

  \- 管理员还可以选择用户的初始角色和权限。

### **7.2 查找用户：**

  \- 博主或管理员可以通过搜索功能快速找到特定的用户。

  \- 搜索可以基于用户名、邮箱、注册日期等信息进行。

### **7.3 修改用户：**

  \- 博主或管理员可以修改用户的账户信息，如用户名、邮箱、角色等。

  \- 修改用户信息可以帮助保持用户资料的准确性和更新。

### **7.4 禁用用户：**

  \- 博主或管理员可以暂时禁用某个用户账户。

  \- 禁用用户后，该用户将无法登录博客系统。

### **7.5 删除用户：**

  \- 博主或管理员可以永久删除某个用户账户。

  \- 删除用户操作通常需要确认，以防止误操作。

### **7.6 设置用户权限：**

  \- 博主或管理员可以为用户设置不同的权限级别。

  \- 常见的权限级别包括超级管理员、友链管理员、普通用户等。

  \- 不同权限的用户可以访问和执行不同的操作。

通过这些用户管理功能，随心博客能够帮助博主或管理员有效地管理和控制博客系统中的用户账户，确保系统的安全性和秩序性，同时也能够根据实际需求为用户提供适当的管理权限。

![image](https://github.com/user-attachments/assets/b974b973-0355-4b0d-a9d2-2fb87ebeef5b)


![image](https://github.com/user-attachments/assets/63da36ea-8f79-456e-b207-029e587abff1)


 

## 8. **角色管理**

角色管理是博客系统中的一个重要功能，它允许博主或管理员创建和管理不同的用户角色，并为每个角色分配特定的权限。在随心博客中，角色管理功能通常包括以下几个方面：

### **8.1 新增角色：**

  \- 博主或管理员可以创建新的角色。

  \- 创建角色时，需要定义角色的名称和描述。

  \- 管理员可以为新角色分配权限，如访问控制、操作权限等。

### **8.2 查看角色：**

  \- 博主或管理员可以查看所有角色的列表。

  \- 列表通常包括角色的名称、描述和分配的权限。

### **8.3 修改角色：**

  \- 博主或管理员可以修改现有角色的名称和描述。

  \- 修改角色时，可以重新分配或调整角色的权限。

### **8.4 设置角色的具体权限：**

  \- 博主或管理员可以为每个角色设置具体的权限。

  \- 权限包括对不同操作的访问控制，如文章管理、用户管理、系统设置等。

### **8.5 动态路由权限：**

  \- 管理员可以为角色设置动态路由权限。

  \- 动态路由权限允许角色根据当前登录用户或特定条件访问不同的页面或功能。

![image](https://github.com/user-attachments/assets/464d5db6-f7ca-4efa-b8ad-c5fca1513e09)


![image](https://github.com/user-attachments/assets/26709bad-0f5d-45a7-a477-7bc113e59fae)


 

## 9. **菜单管理**

菜单管理是后台管理端的一个重要功能，它允许博主或管理员创建、编辑和调整后台管理菜单的结构。在随心博客中，菜单管理功能通常包括以下几个方面：

### **9.1 设置后台管理端的菜单：**

  \- 博主或管理员可以在管理端设置和管理菜单。

  \- 菜单通常包括首页、文章管理、用户管理、系统设置等模块。

### **9.2 调整菜单位置：**

  \- 管理员可以调整菜单的显示顺序，以优化用户体验。

  \- 菜单的位置调整有助于保持后台管理端的布局清晰和易于导航。

### **9.3 新增菜单：**

  \- 管理员可以添加新的菜单项。

  \- 添加新菜单时，需要定义菜单名称和链接地址。

### **9.4 设置多级菜单：**

  \- 管理员可以为菜单创建子菜单。

  \- 多级菜单有助于组织复杂的后台功能和保持界面整洁。

### **9.5 菜单权限控制：**

  \- 管理员可以为菜单设置访问权限。

  \- 不同的用户角色可以访问不同级别的菜单，以保证系统的安全性和用户权限的合理分配。

![image](https://github.com/user-attachments/assets/6439c232-81ef-40a2-a42a-ad668fc9546b)


![image](https://github.com/user-attachments/assets/f0affae9-1768-4aef-b208-4642c5c05de0)
