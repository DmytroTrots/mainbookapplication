package com.project.mainbook.service;

import com.project.mainbook.enity.OperationsRegistryEntity;
import com.project.mainbook.repository.OperationRegistryRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OperationRegistryService {

    private final OperationRegistryRepository operationRegistryRepository;

    public OperationRegistryService(OperationRegistryRepository operationRegistryRepository) {
        this.operationRegistryRepository = operationRegistryRepository;
    }

    public OperationsRegistryEntity save(OperationsRegistryEntity operationsRegistry){
        return operationRegistryRepository.save(operationsRegistry);
    }

    public List<OperationsRegistryEntity> findAll(){
        return operationRegistryRepository.findAll();
    }

    public List<OperationsRegistryEntity> findRecordsBetweenDate(Date firstDate, Date secondDate){
        return operationRegistryRepository.findRecordsBetweenDate(firstDate, secondDate);
    }
}