#!/bin/bash
mvn clean test
sleep 3
cp target/site/jacoco/jacoco.csv CoverageReports
