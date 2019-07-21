package org.liguang.app.login;


import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownloadController {

    @RequestMapping("/download")
    @RequiresRoles("admin")
    public String download() {

        return "download";
    }
}
