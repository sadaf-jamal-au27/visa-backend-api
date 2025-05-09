# visa-backend-api
# Visa Backend API

Spring Boot REST API to trigger Visa ETL pipeline on GCP using Pub/Sub or Cloud Run.

## Features
- `/api/etl/trigger`
- `/api/etl/status`

## Docker
```bash
mvn clean package
docker build -t visa-backend-api .
