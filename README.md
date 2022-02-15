# Persado Interview Assignment

## Briefing:
The scope of this assignment is to write a short test script for a product selection and add to basket at amazon web site(https://www.amazon.com/) Write an automated test for the below scenario with Selenium(Webdriver), preferably in Java or Groovy.

In order to specify configuration settings like browser use a test framework like testNG or Junit Keep in mind that your project need to extend Stevia Framework which will provide you the WebDriver instance and get all the necessary WebDriver action in order to implement your test case. In order to demonstrate existing skills candidate can use test automation patterns like Page Object patterns.

### Test scenario:

#### Preconditions:
1) Go to amazon home page (https://www.amazon.com)
2) Click the ‘Gift cards’ nav bar on the top of the page
3) Click the ‘Print at Home’ option
4) Select the Standard design
5) Select the third card
6) Get the selected card price
7) Add card to Cart


| Step      | Verification |
|:------------|:-------------|
| Go to Cart      | Verify card price on Cart list is the same as the one you get on step 6             |

## Build

In order to build the project, [chromedriver](https://chromedriver.chromium.org/getting-started) is required. Make sure that this is installed on your system.

To build the project and run the tests run 
```
mvn clean package
```

### Known issues
* A popup window appears occasionally on Amazon product page, which might intercept clicks and cause tests to fail. The pop-up appears only while executing the test through chromedriver. Not reproducible manually (Incognito mode, etc.)


