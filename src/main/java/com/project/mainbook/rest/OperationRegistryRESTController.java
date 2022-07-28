package com.project.mainbook.rest;

import com.project.mainbook.enity.OperationsRegistryEntity;
import com.project.mainbook.service.AnalyticsService;
import com.project.mainbook.service.OperationRegistryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/records")
public class OperationRegistryRESTController {

    private final OperationRegistryService operationRegistryService;

    private final AnalyticsService analyticsService;

    public OperationRegistryRESTController(OperationRegistryService operationRegistryService, AnalyticsService analyticsService) {
        this.operationRegistryService = operationRegistryService;
        this.analyticsService = analyticsService;
    }

    @GetMapping(value = "")
    public List<OperationsRegistryEntity> findAll(){
        return operationRegistryService.findAllWithAnalytics();
    }

    @PostMapping("/create-record")
    public String saveRecord(@RequestBody OperationsRegistryEntity operationsRegistry) {
        operationRegistryService.save(operationsRegistry);
        analyticsService.save(operationsRegistry);
        return "redirect:/create-record";
    }

}
