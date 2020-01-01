<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>Login</title>
</head>
<body>
<h1>主页</h1>
<div>
    欢迎
</div>
<div>
    <a id="checkPermission" href=javascript:checkPermission()>检查权限</a>
</div>
<div>
    <a id="loginOut" href=javascript:logout()>退出系统</a>
</div>
</body>
<script src="/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    function checkPermission(){
        $.ajax({
            url:"checkPermission",
            success:function(data){
                alert(data);
            }
        });
    }

    function logout(){
        $.ajax({
            url:"logout",
            success:function(){
                location.href ="login";
            }
        });
    }
</script>
</html>