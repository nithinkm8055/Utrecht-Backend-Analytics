
package com.digital.ing.analytics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.ing.analytics.controllers.responses.AnalyticsResponse;

@RestController
public class AnalyticsController {

    @GetMapping("/customer-analytics")
    public AnalyticsResponse getAllHitCounts(){
		return null;
    }


}
