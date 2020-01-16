## 第一个springBoot项目  

计划做成一个问题讨论平台    

### 下面是学习笔记以及相关资源   

#### 1. 首先用idea创建一个新的springBoot项目，选用jdk1.8，maven管理，初次只选用springWeb就可以了，以后按需加载    

#### 2. 进入这个网址 https://spring.io/guides/gs/serving-web-content/     
- 2.1 在pom.xml里面插入以下配置代码
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```
- 2.2在templates里面创建一个index.html文件，插入以下代码    
```html
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <p th:text="'Hello, ' + ${name} + '!'" />
</body>
</html>
```
- 2.3在CommunityApplication类同级目录创建controller文件夹，并在controller文件夹下创建indexController类，插入以下代码    
```java
package com.asa.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by codedrinker on 2020/1/16
 */
@Controller
public class indexController {
    @GetMapping("/")
    public String index() { return "index"; }
}
```