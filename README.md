# Selenium WebDriver Test Framework

A Java-based test automation framework built with Selenium WebDriver, following the Page Object Model design pattern. This project provides a basic structure for creating automated web tests with a clean and maintainable architecture.

## 🛠 Technologies & Tools

- Java 17
- Selenium WebDriver 4.12.1
- TestNG 7.7.0
- JUnit 4.12
- Maven
- ChromeDriver

## 📋 Prerequisites

- Java JDK 17 or higher
- Maven
- Chrome browser
- ChromeDriver (matching your Chrome browser version)

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ignacio_selenium_webdriver.git
   cd ignacio_selenium_webdriver
   ```

2. Place the ChromeDriver executable in the `resources` directory
   - Download the appropriate version from: https://sites.google.com/chromium.org/driver/
   - Make sure it matches your Chrome browser version

3. Install dependencies:
   ```bash
   mvn clean install
   ```

## 🏗 Project Structure

```
src
├── main/java
│   └── pages           # Page Object Model classes
└── test/java
    ├── base           # Base test configuration
    └── login          # Test classes
```

## 🧪 Running Tests

Execute all tests using Maven:
```bash
mvn test
```

## 📝 Framework Features

- **Base Test Setup**: The `BaseTests` class provides common test configuration and WebDriver setup
- **Page Object Model**: Implements the POM design pattern for better maintainability
- **Test Examples**: Includes sample test cases demonstrating framework usage
- **Clean Architecture**: Well-organized project structure following best practices

## 🔍 Example Test

```java
@Test
public void testSuccessfulLogin() {
    LoginPage loginPage = homePage.clickFormAuthentication();
    loginPage.setUsername("tomsmith");
    loginPage.setPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
    assertTrue(secureAreaPage.getAlertText()
            .contains("You logged into a secure area!"));
}
```

## 📚 Additional Resources

For more examples and detailed implementation of different test types, visit the companion repository: [thewebdrivetest](https://github.com/your-username/thewebdrivetest)

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.
