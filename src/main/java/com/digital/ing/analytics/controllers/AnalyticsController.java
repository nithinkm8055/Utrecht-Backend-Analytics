
package com.digital.ing.analytics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.ing.analytics.controllers.responses.AnalyticsResponse;
import com.digital.ing.analytics.services.AnalyticsService;

@RestController
public class AnalyticsController {

	@Autowired
	AnalyticsService analyticsService;

	@GetMapping("/customer-analytics")
	public AnalyticsResponse getAllHitCounts() {
		return analyticsService.getAllHitCounts();
	}

	@PostMapping("/customer-analytics/{pageId}")
	public String addHitCounts(@PathVariable("pageId") String pageId) {
		analyticsService.updatePageHitCount(pageId);
		return "Page hit is updated";
	}

}
