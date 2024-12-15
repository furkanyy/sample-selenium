
# **Sample Selenium Cucumber E2E Automation Project**

This repository contains an end-to-end (E2E) automation framework using **Selenium**, **Cucumber**, and **JUnit5**. It is designed for testing web applications, with a structured approach for writing feature files, step definitions, and runner classes.

---

## **Project Overview**

The project includes:

1. **Feature Files**: Written in Gherkin syntax to define test scenarios in a human-readable format.
2. **Step Definitions**: Implemented in Java to automate steps described in feature files.
3. **Runner Class**: Configured with CucumberOptions to run tests and generate HTML reports.
4. **Selenium Integration**: For browser-based automation.
5. **Reports**: HTML reports generated after test execution.

---

## **Technologies Used**

- **Programming Language**: Java
- **Testing Framework**: Cucumber with JUnit5
- **Automation Tool**: Selenium
- **Build Tool**: Maven
- **IDE**: IntelliJ IDEA
- **Reports**: Cucumber HTML Report

---

## **Project Structure**

```plaintext
src/
├── main/
│   ├── java/
│   │   └── pages/
│   │       └── DocumentationPage.java       # Page Object for Selenium actions
│   │       └── toolset/
│   │           ├── Actions.java             # Reusable actions
│   │           └── WebDriverTool.java       # WebDriver setup and teardown
│   └── resources/
├── test/
│   ├── java/
│   │   ├── runners/
│   │   │   └── Runner.java                  # Test runner for executing feature files
│   │   ├── steps/
│   │       └── SampleSteps.java             # Step definitions for feature files
│   └── resources/
│       └── features/
│           └── Search.feature               # Feature file with test scenarios
├── pom.xml                                  # Maven dependencies
└── target/                                  # Build and test output
```

---

## **Getting Started**

### **Prerequisites**
- **Java 11** or higher
- **Maven** (build tool)
- **IntelliJ IDEA** or any Java IDE
- **WebDriver** for your browser (e.g., ChromeDriver for Chrome)

### **Setup Instructions**
1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/selenium-cucumber-e2e.git
   cd selenium-cucumber-e2e
   ```

2. **Install Dependencies**
   Ensure Maven dependencies are installed:
   ```bash
   mvn clean install
   ```

3. **Run Tests**
   Use Maven to execute tests:
   ```bash
   mvn test
   ```

   Alternatively, you can run the tests directly from **Runner.java** in IntelliJ IDEA.

---

## **Writing Feature Files**

Example `Search.feature` file:

```gherkin
Feature: Search

  Scenario: Successful search
    Given selenium documentation page is displayed
    When the "selenium manager" word is searched
    Then the result that includes "selenium_manager" is displayed
```

---

## **Reports**

After running tests, an **HTML report** will be generated under:
```plaintext
target/reports.html
```

Open the file in a browser to view the test execution report.

---

## **How to Contribute**

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Make your changes and commit:
   ```bash
   git commit -m "Add new feature"
   ```
4. Push to your forked repository:
   ```bash
   git push origin feature/your-feature
   ```
5. Submit a pull request.

---

## **License**

This project is licensed under the [MIT License](LICENSE).

---

## **Contact**

For any issues or suggestions, feel free to reach out or open an issue on GitHub.
