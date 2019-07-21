package org.liguang.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Set;

public class MyJdbcRealm extends JdbcRealm {


    public MyJdbcRealm() {
        super.setAuthenticationQuery("select password from shiro_user where user_name = ?");
        super.setUserRolesQuery("select C.role_name\n" +
                " from shiro_user A\n" +
                "         inner join shiro_user_roles B on A.user_id = B.user_id\n" +
                "         inner join shiro_role C on C.role_id = B.role_id" +
                " where A.user_name = ?");

        super.setPermissionsQuery("select C.permission_name\n" +
                " from shiro_role A\n" +
                "         inner join shiro_role_permissions B on A.role_id = B.role_id\n" +
                "         inner join shiro_permission C on C.permission_id = B.permission_id" +
                " where A.role_name = ?");
    }



}
