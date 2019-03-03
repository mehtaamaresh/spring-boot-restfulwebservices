package com.amy.company.restfulwebservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration conf;

    @GetMapping("/limit")
    public Configuration retrieveLimitsFromConfigurations(){
        //hard coded way
        //return new LimitConfiguration(1000, 1);

        //dynamic way
        return new Configuration(conf.getMinimum(), conf.getMaximum());
    }

}
