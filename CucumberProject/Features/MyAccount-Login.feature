Feature: MyAccount-Login Feature
   Description: This feature will be test as a Login feature
   
   #Simple login without parameters
     Scenario: Log-in with valid username and pasword.
     Given Open the Browser
     When Enter the URL "http://practice.automationtesting.in/"
     And Click on my Account Menu
     And Registered Username and Password
     And Click on Login Button
     Then User must successfully login to the web
     
      

