# FlipkartAutomationFramework
### This project is a Selenium-based web automation framework designed to automate various functionalities on the Flipkart website. It utilizes the Cucumber BDD framework, Page Object Model (POM) design pattern.

## Features

- Cucumber BDD Framework: For writing test scenarios in a human-readable format.
- Page Object Model (POM): For organizing and maintaining the codebase.
- Logging: Provides detailed logs for debugging purposes.

## Prerequisites
- Java JDK 8 or higher
- Maven
- Selenium WebDriver
- Cucumber
- TestNG
- WebDriverManager
- A valid Flipkart account for testing

**Scenario:** Add invalid quantity to cart
**Given** I am on the product details page for a specific phone
**When** I try to add the product to the cart with quantity -1
**Then** I should see an error message indicating invalid quantity
 
 Note: This scenario cannot be automated on Flipkart as the platform does not allow negative quantities in the quantity field, and such invalid inputs are restricted at the frontend level. This limitation is due to the platform's validation that prevents adding negative quantities.

Scenario: Verify cart items maintain quantity after adding multiples 
Given I am on the product details page for a specifc T-shirt
When I add the T-shirt to the cart with quantity 2
Then I navigate to the cart page
And the cart should display the T-shirt with a quantity of 2 (assuming a collection stores cart items)

 Note: Due to multiple login attempts during the automation process, the Flipkart account used for testing has been temporarily blocked for 24 hours. As a result, further automation scenarios cannot be executed until the account is unblocked. This highlights the importance of implementing a rate limit for login attempts in the automation framework to prevent such issues in the future.

git clone https://github.com/Manisha-Rana12/FlipkartAutomationFramework.git
cd FlipkartAutomationFramework


