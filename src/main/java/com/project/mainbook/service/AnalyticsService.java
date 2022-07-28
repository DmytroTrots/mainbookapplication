package com.project.mainbook.service;

import com.project.mainbook.enity.AnalyticsEntity;
import com.project.mainbook.enity.OperationsRegistryEntity;
import com.project.mainbook.repository.AnalyticsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AnalyticsService {

    private static final Logger logger = LoggerFactory.getLogger(OperationRegistryService.class);

    private final AnalyticsRepository analyticsRepository;

    public AnalyticsService(AnalyticsRepository analyticsRepository) {
        this.analyticsRepository = analyticsRepository;
    }

    public List<AnalyticsEntity> save(OperationsRegistryEntity operationsRegistryEntity){
        List<AnalyticsEntity> listOfSavedAnalytics = new ArrayList<>();
        Iterator<String> creditIterator = operationsRegistryEntity.getListOfCreditAnalytics().iterator();
        Iterator<String> debitIterator = operationsRegistryEntity.getListOfDebitAnalytics().iterator();

        while(creditIterator.hasNext() && debitIterator.hasNext()){
            AnalyticsEntity analyticsEntity = new AnalyticsEntity();
            String creditTemp = creditIterator.next();
            String debitTemp = debitIterator.next();
            if (debitTemp.equals("")){
                analyticsEntity.setDebitAnalytics(null);
            }else{
                analyticsEntity.setDebitAnalytics(debitTemp);
            }
            if (creditTemp.equals("")){
                analyticsEntity.setCreditAnalytics(null);
            }else{
                analyticsEntity.setCreditAnalytics(creditTemp);
            }
            analyticsEntity.setOperationsRegistry(operationsRegistryEntity);
            listOfSavedAnalytics.add(analyticsRepository.save(analyticsEntity));
        }
        return listOfSavedAnalytics;
    }
}
