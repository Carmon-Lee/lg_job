package org.liguang.app.login;


//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

//    @RequestMapping("/download")
//    @RequiresPermissions("file:download")
//    public String download() {
//
//        Subject user = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken("liguang", "password");
//        user.login(token);
//        return "download";
//    }
}
