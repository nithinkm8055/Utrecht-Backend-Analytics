package com.digital.ing.analytics.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.ing.analytics.controllers.responses.AnalyticsDetails;
import com.digital.ing.analytics.controllers.responses.AnalyticsResponse;
import com.digital.ing.analytics.repositories.AnalyticsRepository;
import com.digital.ing.analytics.repository.entities.Analytics;

@Service
public class AnalyticsService {

    @Autowired
    AnalyticsRepository analyticsRepository;

    public AnalyticsResponse getAllHitCounts(){
        AnalyticsResponse analyticalResponse = new AnalyticsResponse();
        List<AnalyticsDetails> analyticalList = new ArrayList<>();
        
        
        return analyticalResponse;
    }

    private AnalyticsDetails mapEntityToResponse(Analytics analyticEntity) {
        AnalyticsDetails analyticaldetails = new AnalyticsDetails();
        analyticaldetails.setHitCount(analyticEntity.getHitCount());
        analyticaldetails.setPageId(analyticEntity.getPageId());
        return analyticaldetails;
    }
}
