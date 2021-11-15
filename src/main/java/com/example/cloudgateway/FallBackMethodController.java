package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/productServiceFallBack")
    public String productServiceFallBackMethod(){
        return "Product Service is taking longer than expected." +
                " Please try again later.";
    }
    @GetMapping("/companyServiceFallBack")
    public String companyServiceFallBackMethod(){
        return "Company Service is taking longer than expected." +
                " Please try again later.";
    }
}
