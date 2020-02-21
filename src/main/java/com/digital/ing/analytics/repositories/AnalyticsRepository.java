package com.digital.ing.analytics.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digital.ing.analytics.repository.entities.Analytics;

@Repository
public interface AnalyticsRepository extends CrudRepository<Analytics, Long> {

	Analytics findByPageId(String name);
}
