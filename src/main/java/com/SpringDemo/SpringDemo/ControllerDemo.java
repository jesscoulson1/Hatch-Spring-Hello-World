package com.SpringDemo.SpringDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {




@RequestMapping("/")
public String hello() {
return "hello I am from Spring";
}
}

