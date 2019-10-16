package com.first.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFeignClient {
    @Autowired
    private ProviderClient providerClient;

    @GetMapping(value = "/client")
    public String client(@RequestParam(value = "name",defaultValue = "name") String sss){
        System.out.println(sss);
        return providerClient.client(sss);
    }
}
