package com.visa.backend.service;

import org.springframework.stereotype.Service;

@Service
public class ETLService {

    public String triggerETL() {
        // Here you can call Pub/Sub or invoke Cloud Run ETL endpoint
        // Example: publish message to GCP Pub/Sub
        return "ETL Triggered Successfully!";
    }

    public String getETLStatus() {
        // This could read from DB or memory or log
        return "ETL Last Run: Success";
    }
}
