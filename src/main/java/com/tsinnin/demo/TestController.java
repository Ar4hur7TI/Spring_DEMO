package com.tsinnin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: Peiyi Ding
 * 作者： 丁沛奕
 * Created by peiyi on 2024-07-27.
 */

@RestController
public class TestController {

    @GetMapping("/hello")
    public List<String> hello() {
        return List.of("Hello", "World!");
    }
}
