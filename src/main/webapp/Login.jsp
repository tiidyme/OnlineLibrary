
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.0/jquery.js"></script>

    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.js"></script>
    <!--    <script src="Login_js.js"></script>-->

</head>
<body>
<form method="GET">

    <div style="width: 70%;margin:auto;" style="text-align: center">
        <div class="input-group">
            <span class="input-group-addon">用户名</span>
            <input name="username" type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
        </div>
        <div class="input-group">
            <span class="input-group-addon">密码</span>
            <input name="password" type="text" class="form-control" aria-label="Amount (to the nearest dollar)">
        </div>
        <div class="input-group">
            <span class="input-group-addon" >邮箱</span>
            <input name="e_mail" type="text" class="form-control" placeholder="Recipient's username" aria-describedby="basic-addon1">
        </div>
        <input id="submit" type="submit" value="submit">
    </div>
</form>
</body>
</html>