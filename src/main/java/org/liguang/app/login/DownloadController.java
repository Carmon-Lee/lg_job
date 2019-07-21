package org.liguang.app.login;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownloadController {

    @RequestMapping("/download")
    @RequiresPermissions("write")
    public String download() {

//        Subject user = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken("jill.coder", "password");
//        user.login(token);
        return "download";
    }
}
