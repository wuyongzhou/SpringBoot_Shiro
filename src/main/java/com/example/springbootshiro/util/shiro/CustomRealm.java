package com.example.springbootshiro.util.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

@Component
public class CustomRealm extends AuthorizingRealm {
    /**
     * 授权方法
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证方法
     * 这里都是模拟从数据库获取，假代码
     * 从token中获取账号查询数据库获取User记录，若为null，则账号错误
     * 构造SimpleAuthenticationInfo对象时，需要传入身份（可以是账号或者自定义对象）以及凭证（数据库密码）
     * 并返回SimpleAuthenticationInfo对象，由shiroFilter进行认证校验
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        //String username= (String) token.getPrincipal();
        //String password= (String) token.getCredentials();
        String username=usernamePasswordToken.getUsername();
        String password=new String(usernamePasswordToken.getPassword());
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        if("admin".equals(username)){
            return null;
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(username,"222222","CustomRealm");
        return simpleAuthenticationInfo;
    }
}
