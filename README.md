# README
# web-automation-framework

Author: Mateusz Łada

### Overview
This is the template of the test automation framework written in Java used for testing Web UI. The framework is a template to download and start testing any web application by reusing the code and the structure. It does not present all features of used tools but provides examples about possible usage. It also does not comprehensively test Application Under Test as this should be addressed by dedicated test strategy.

### Technology stack
- Java - Programming language
- Apache Maven - Build and package management
- Selenide https://selenide.org/ - Web automation based on Selenium webdriver
- JUnit 5 https://junit.org/junit5/ - Test execution and reporting

### Application Under Test (Web UI)
Online demo web shop: https://www.saucedemo.com/

### Framework usage
1. Install required software: Java, Git, Maven
2. Download repository `git clone https://github.com/mateuszlada/web-automation-framework.git`
3. Build maven project `mvn clean install`
4. Run tests `mvn test`