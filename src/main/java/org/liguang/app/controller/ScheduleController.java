package org.liguang.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class ScheduleController {

    @RequestMapping("/json")
    public Map<String, Object> transfer() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("data", "This is message from node container");
        return result;
    }


}
