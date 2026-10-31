package com.example.firstApi;


import org.springframework.web.bind.annotation.*;

@RestController
public class firstApi {

    @GetMapping("/")
    String defaultValue(){
        return "There is nothing in the default item" ; 
    }


    @GetMapping("/home")
    HelloResponse getWorld(){
        return new HelloResponse("this is the message") ;
    }

    @GetMapping("/home/{name}")
    String getItem(@PathVariable String name){
        return "this the the path " + name ;
    }

    @PostMapping("/home")
    HelloResponse getpost(@RequestBody String name ){
        return new HelloResponse("hello" + name + "!") ;
    }
}
