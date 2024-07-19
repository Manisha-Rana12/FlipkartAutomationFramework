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
## Integration Process
1. Project Setup:
   - Created a new Maven project.
   - Added necessary dependencies in the pom.xml file
2. Framework Structure:
   - Implemented the Page Object Model (POM) for better code management.
   - Created separate packages for test cases, page objects, utilities, and configurations.
3. Cucumber Integration:
   - Set up Cucumber feature files and step definitions.
   - Configured the Cucumber runner class for executing tests.
## Test Cases
   - Test Case 1: Login Functionality
    <br>
   
   **Description:** To verify login functionality with valid credential

   **Steps:**
   - Open the application.
   - Enter valid credentials.
   - Click on the login button.
   - Verify that the user is redirected to the dashboard.

     **Status:** PASS
     
   - Test Case 2: Verify Product Search and Price Sorting Functionality
     <br><br>
    **Description:** To verify search functionality by entering product details and sorting the price from Low to High and 
                      verify the first product price is minimum.

     **Steps:**
     - open the application
     - search for a product
     - Select the option to sort by price from low to high
     - Verify that the first product's price is the minimum among all displayed prices

     **Status:** PASS
     
     - Test Case 3: Add Products to Wishlist from Search Results Pages
       <br><br>
   **Description:**  To verifies that the user can iterate through the first 5 product pages on the search results for 
                       "Men's Watches" and add each product to the wishlist.

       **Steps:**
     - Enter "Men's Watches" in the search bar
     - Click on the search button or press Enter
     - Add the product to wishlist
     - Navigate to the next 5 pages and add one product to wishlist

     **Status:** PASS
     
  ## Project structure:
  - page object
  - stepDefinition
  - testRunner
  - feature file
  <br>

 - ![Screenshot 2024-07-18 204111](https://github.com/user-attachments/assets/459e021f-c110-4119-a19f-b81388dc0796)

  
  - ![Screenshot 2024-07-18 204147](https://github.com/user-attachments/assets/ee53436e-1dc1-4085-96d8-395691e8e97c)
  <br>
 
**Scenario:** Add invalid quantity to cart
**Given** I am on the product details page for a specific phone
**When** I try to add the product to the cart with quantity -1
**Then** I should see an error message indicating invalid quantity
 
 **Note:** This scenario cannot be automated on Flipkart as the platform does not allow negative quantities in the quantity field, and such invalid inputs are restricted at the frontend level. This limitation is due to the platform's validation that prevents adding negative quantities.

**Scenario:** Verify cart items maintain quantity after adding multiples 
**Given** I am on the product details page for a specifc T-shirt
**When** I add the T-shirt to the cart with quantity 2
**Then** I navigate to the cart page
**And** the cart should display the T-shirt with a quantity of 2 (assuming a collection stores cart items)

 **Note:** Due to multiple login attempts during the automation process, the Flipkart account used for testing has been temporarily blocked for 24 hours. As a result, further automation scenarios cannot be executed until the account is unblocked. This highlights the importance of implementing a rate limit for login attempts in the automation framework to prevent such issues in the future.

### Setup instruction <br>
- **git clone:** https://github.com/Manisha-Rana12/FlipkartAutomationFramework.git
cd FlipkartAutomationFramework




