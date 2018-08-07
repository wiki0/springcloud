package top.siki.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.siki.order.config.GirlConfig;

/**
 * @author: wiki
 * @date: 2018/8/6
 * @description:
 */
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/girl/print")
    public String print(){
        return "name: " + girlConfig.getName() + "，age: " + girlConfig.getAge();
    }
}
