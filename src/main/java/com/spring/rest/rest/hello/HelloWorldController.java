package com.spring.rest.rest.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String getHelloWorldPage(){
        return "hello world";
    }


    @GetMapping(path = "/hello-world-bean")
    public HelloWordBean getHelloWorldBeanPage(){
        return new HelloWordBean("test");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWordBean getHelloWorldPathVariablePage(@PathVariable String name){
        return new HelloWordBean(String.format("test, %s", name ));
    }
}

