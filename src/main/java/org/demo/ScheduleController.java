package org.demo;


import org.demo.componant.ServerComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class ScheduleController {


    @Autowired
    ServerComponent serverComponent;

    @RequestMapping("/json")
    public Map<String, Object> transfer() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", "This is message from node container");
        System.out.println(serverComponent.getServers());
        return result;
    }


}
