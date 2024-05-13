# Automation Testing Project

This project is a Java-based automation testing framework using Cucumber, Selenium, and AI integration with Sapient AI.

## Overview

This automation testing framework allows for behavior-driven development (BDD) using Cucumber, web automation using Selenium, and integration with Sapient AI for generating test scenarios and unit tests.

## Features

- **BDD Support**: Write test scenarios in Gherkin syntax using Cucumber.
- **Web Automation**: Automate web interactions with Selenium.
- **AI Integration**: Use Sapient AI to generate test scenarios and unit tests.
- **Flexibility**: Easily extend and customize test scenarios and steps according to project requirements.

## Getting Started

1. Clone this repository.
2. Install Java Development Kit (JDK) and Maven.
3. Download Chrome WebDriver and place it in the `src/resources/` directory.
4. Set up your Sapient AI account and obtain an API key.
5. Configure `AIUtils.java` with your Sapient AI API key.
6. Write feature files in `src/resources/features/` directory using Gherkin syntax.
7. Implement step definitions in `src/test/java/steps/`.
8. Customize web page objects in `src/main/java/pages/`.
9. Run tests using Maven or your preferred IDE.

## Usage

To run the tests, execute the `RunCucumberTest.java` class located in `src/test/java/automation/`.

## Dependencies

- Java Development Kit (JDK)
- Maven
- Chrome WebDriver
- Sapient AI API key
