package com.digital.ing.analytics.services;

import com.digital.ing.analytics.repositories.ProductGroupRepository;
import com.digital.ing.analytics.controllers.responses.Product;
import com.digital.ing.analytics.controllers.responses.ProductGroup;
import com.digital.ing.analytics.controllers.responses.AnalyticsDetails;
import com.digital.ing.analytics.controllers.responses.AnalyticsResponse;
import com.digital.ing.analytics.repositories.AnalyticsRepository;
import com.digital.ing.analytics.repositories.entites.ProductEntity;
import com.digital.ing.analytics.repositories.entites.ProductGroupEntity;
import com.digital.ing.analytics.repository.entities.Analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnalyticsService {

    @Autowired
    AnalyticsRepository analyticsRepository;

    public AnalyticsResponse getAllHitCounts(){
        AnalyticsResponse analyticalResponse = new AnalyticsResponse();
        //List<AnalyticsDetails> analyticalList = new ArrayList<>();

        return analyticalResponse;
    }

    private AnalyticsDetails mapEntityToResponse(Analytics analyticEntity) {
        AnalyticsDetails analyticaldetails = new AnalyticsDetails();
        analyticaldetails.setHitCount(analyticEntity.getHitCount());
        analyticaldetails.setPageId(analyticEntity.getPageId());
        return analyticaldetails;
    }
}
