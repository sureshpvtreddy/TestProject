Feature: Verify Dashboard

  #@ignore
  #Scenario: Login with Valid Credentials
  #Given user is already on login page
  #When Validate Page Title "Login"
  #When enter user name "superadmin@yopmail.com"
  #When enter password "123456"
  #Then click on login
  #@ignore
  #Scenario: verify Forgot password link Exist or Not
  #Given user is already on login page
  #Then Forgot password link is Exist or not
  #
  #@ignore
  #Scenario Outline: Login with In-Valid Credentials
  #Given user is already on login page
  #When enter user name "superadmi@yopmail.com"
  #When enter password "123456"
  #When click on login
  #Then Validation Alert Message
  @ignore
  Scenario Outline: Login with In-Valid Credentials
    Given user is already on login page
    When user Enters "<Email>" And "<Password>"
    Then click on login
    Then Verify login page

    Examples: 
      | Email | Password |
      #|       |          |
      #| admin |          |
      #| superadmi@yopmail.com |   123456 |
      #| superadmin@yopmail.com |   123456 |
