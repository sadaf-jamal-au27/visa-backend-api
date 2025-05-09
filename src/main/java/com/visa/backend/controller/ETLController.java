package com.visa.backend.controller;

import com.visa.backend.service.ETLService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/etl")
public class ETLController {

    private final ETLService etlService;

    public ETLController(ETLService etlService) {
        this.etlService = etlService;
    }

    @PostMapping("/trigger")
    public String triggerETL() {
        // Call Pub/Sub or REST to trigger ETL
        return etlService.triggerETL();
    }

    @GetMapping("/status")
    public String getStatus() {
        return etlService.getETLStatus();
    }
}
