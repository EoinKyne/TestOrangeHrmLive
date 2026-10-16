Using selenium to test OrangeHrmLive login page

dependencies:
add to pom.xml
selenium-java
testng
junit

Base
BaseTest (shared behavior)

Pages:
LoginPage (login page elements and actions)

Tests
ForgotPasswordTest (test cases for forgot password functionality)
LoginTest (test cases for login functionality)
OrangeHrmLinkTest (test cases for OrangeHRM link functionality)
SocialLinksTest (test cases for social media links functionality)

Utils
WindowsUtils (utility class for handling browser windows and tabs)
