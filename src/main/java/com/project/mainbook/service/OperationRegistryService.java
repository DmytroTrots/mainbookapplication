package com.project.mainbook.service;

import com.project.mainbook.enity.OperationsRegistryEntity;
import com.project.mainbook.repository.OperationRegistryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationRegistryService {

    private static final Logger logger = LoggerFactory.getLogger(OperationRegistryService.class);

    private final OperationRegistryRepository operationRegistryRepository;

    public OperationRegistryService(OperationRegistryRepository operationRegistryRepository) {
        this.operationRegistryRepository = operationRegistryRepository;
    }

    public OperationsRegistryEntity save(OperationsRegistryEntity operationsRegistry){
        operationsRegistry = operationRegistryRepository.save(operationsRegistry);
        logger.trace("Operation " + operationsRegistry.getId() + " was added: Credit - " + operationsRegistry.getCredit() + ", Debit - " + operationsRegistry.getDebit()+ ", Amount of Money - " + operationsRegistry.getAmountOfMoney());
        return operationsRegistry;
    }

    public List<OperationsRegistryEntity> findAllWithAnalytics(){
        return operationRegistryRepository.findAllWithAnalytics();
    }

    public String monthScheduledAction(){
        logger.trace("Monthly action was executed");
        return "Some logic implemented here";
    }

//    public List<OperationsRegistryEntity> findRecordsBetweenDate(Date firstDate, Date secondDate){
//        return operationRegistryRepository.findRecordsBetweenDate(firstDate, secondDate);
//    }
}
