package com.digital.ing.analytics.controllers.responses;

import java.util.List;

public class AnalyticsResponse {
    /**
     * List of all analytics
     */
    private List<AnalyticsDetails> analyticDetails;

	public List<AnalyticsDetails> getAnalyticDetails() {
		return analyticDetails;
	}

	public void setAnalyticDetails(List<AnalyticsDetails> analyticDetails) {
		this.analyticDetails = analyticDetails;
	}

   
    
}
