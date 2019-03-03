package com.amy.company.restfulwebservices.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    //@RequestMapping(method= RequestMethod.GET, path= "/hello-world")
    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello World...";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean...");
    }

    @GetMapping(path = "/hello-world/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s",name));
    }

    @GetMapping(path="/hello-world-internationalized")
    public String helloWorldInternationalized(){
        //return "Hello World...";
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }

    /*@GetMapping(path="/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", defaultValue = "def") Locale locale){
        //return "Hello World...";
        return messageSource.getMessage("good.morning.message", null, locale);
    }*/

}
