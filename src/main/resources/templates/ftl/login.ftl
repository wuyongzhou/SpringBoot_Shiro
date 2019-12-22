<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" http-equiv="Pragma" content="no-cache"/>
    <title>Login</title>
</head>
<body>
<h1>登陆页面</h1>
<div>
    <form id="loginFrom" action="login" method="post">
        <div>
            用户名：<input type="text" id="username" name="username" value=""/>
        </div>
        <div>
            用户名：<input type="password" id="password" name="password" value=""/>
        </div>
        <div>
            <input  onclick="login()" type="button" value="登陆"/>
        </div>
    </form>
</div>
<script src="/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    function login(){
        $("#loginFrom").submit();
    }
</script>
</body>
</html>