# DGMarkt E-commerce Website Automated Testing Project

This project aims to automate the testing process of the [DGMarkt e-commerce website](https://dgmarkt.com) using Java, Selenium, Cucumber, and JUnit frameworks.

## Dependencies
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html): Make sure you have JDK installed on your system. You can download it from the official website.
- [Maven](https://maven.apache.org/download.cgi): Maven is used as a build automation tool for managing dependencies and building the project.
- [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/): Selenium WebDriver is a tool used for automating web application testing.
- [Cucumber](https://cucumber.io/): Cucumber is a tool used for writing and executing automated acceptance tests in a BDD style.
- [JUnit5](https://junit.org/junit5/): JUnit is a unit testing framework for the Java programming language.
- [Allure Reporter](https://allurereport.org/): Allure is a flexible lightweight multi-language test report tool that not only shows a very concise representation of what have been tested in a neat web report form but allows everyone participating in the development process to extract maximum of useful information from everyday execution of tests.

## Setup Instructions

1. Clone the Repository:   
   `git clone git clone https://user_name@bitbucket.org/ets-sdet/dgmarkt10r.git`
2. Install Dependencies
```bash
  cd dgmarkt-automation
  mvn clean install
```
  
## Project Structure
- ****src/test/java/com.dgmarkt10r/pages:**** Contains Java classes for test automation.
- ****src/test/java/com.dgmarkt10r/steps:**** Contains step definition files for Cucumber tests.
- ****src/test/java/com.dgmarkt10r/utils:**** Contains utility classes for test setup and teardown. 
- ****src/test/resources/com.dgmarkt10r:**** Contains feature files written in Gherkin syntax for Cucumber.
- ****src/test/resources:**** Contains configuration files for WebDriver setup.


## Running Tests
You can run the tests using Maven command line:
```bash
 mvn clean test generate-test-resources allure::report process-test-resources allure::serve
 ```
This command will execute all test scenarios and also generate a report.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please feel free to open an issue or create a pull request.


## Authors

- #### ***Boris Pedorenko***
- #### ***Andrei Zola***
- #### ***Andrei Idt***
- #### ***Maxim Kiselev***


## License

This project is licensed under the [euroTech Study GmbH](https://eurotechstudy.com/).