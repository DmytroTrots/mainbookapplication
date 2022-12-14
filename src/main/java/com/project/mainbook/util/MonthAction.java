package com.project.mainbook.util;

import com.project.mainbook.service.OperationRegistryService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MonthAction {

    private final OperationRegistryService operationRegistryService;

    public MonthAction(OperationRegistryService operationRegistryService) {
        this.operationRegistryService = operationRegistryService;
    }

    @Scheduled(cron = "0 59 21 * 1-12 *", zone = "UTC")
    public void run() {
        operationRegistryService.monthScheduledAction();
    }
}
