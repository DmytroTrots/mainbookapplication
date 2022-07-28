package com.project.mainbook.repository;

import com.project.mainbook.enity.AnalyticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticsRepository extends JpaRepository<AnalyticsEntity, Integer> {
}
