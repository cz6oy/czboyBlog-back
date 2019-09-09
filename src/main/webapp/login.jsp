<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>czboy-后台管理系统</title>
    <script src="https://cdn.bootcss.com/jquery/3.4.0/jquery.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <style>
        .layout{
            width:100%;
            height:100vh;
        }
        .layout .layout-top,
        .layout .layout-bot{
            width: 100%;
            height: 50vh;
        }
        .layout-bot{
            background-color: #FFF;
        }
        .layout-top{
            background-color: #1E90FF;
        }
        .login-box{
            width: 400px;
            height: 250px;
            margin-top: -125px;
            margin-left: -200px;
            position: absolute;
            top: 50%;
            left: 50%;
        }
        .login-box .title{
            height: 50px;
            font-size: 25px;
            color: #FFF;
            text-align: center;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
            "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji",
            "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
        }
        .login-box .form-box{
            height: 200px;
            background-color: #FFFFFF;
            box-shadow: 6px 6px 10px #999;
        }
        .form{
            display: block;
        }
        input[type=text],
        input[type=password]{
            width: 250px;
            display: block;
            margin: 10px auto;
            padding: 5px 0px;
            padding-left: 15px;
            color: #DDD;
            height: 30px;
        }
        .btn{
            margin-top: 20px;
            margin-left: 75px;
            width: 250px;
            display: block;
            cursor: pointer;
            height: 30px;
            line-height: 30px;
            text-align: center;
            background-color: #1E90FF;
            color: #FFF;
        }
    </style>
</head>
<body>
<div class="layout">
    <div class="layout-top"></div>
    <div class="layout-bot"></div>
    <div class="login-box">
        <div class="title">个人博客管理平台系统</div>
        <div class="form-box">
            <form action="${pageContext.request.contextPath}/sys/login" method="post"><br/>
                <input type="text" placeholder="请输入账户名" name="username">
                <input type="password" placeholder="请输入密码" name="password">
                <input class="btn" type="submit" value="登录">
            </form>
        </div>
    </div>
</div>
</body>
</html>