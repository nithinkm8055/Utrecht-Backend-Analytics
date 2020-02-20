
package com.digital.ing.analytics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    @GetMapping("/customer-analytics")
    public String getAllProductGroups(){
        return "hellow";
    }


}