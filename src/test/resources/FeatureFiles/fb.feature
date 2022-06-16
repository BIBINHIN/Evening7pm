Feature: To validate Login functionality of Facebook application
  
  Scenario: To validate login with invalid username and valid password
  
  Given user has to launch the chrome browser and hit the facebook url
  
  When user has to pass the value in email field
  
  And user has to pass the value in password field
  And user has to click the login button
  And user has to navigate the home page
  Then user has to close the browser
