Feature: Admin Assests Management

  #Scenario: Update the Asset Status and Delete that updated Asset
  #Given Admin on Login Page
  #When Admin enter below credentials
  #| email                  | pwd |
  #| superadmin@yopmail.com |     |
  #Then click on Logn
  #When Search the asset "<GodavariRestaurent>"
  #Then update the Asset Status
  #When Search the asset "<GodavariRestaurent>"
  #When Cabin type "2"
  #Then Delete the Updated asset
  Scenario: Validate Login page with Valid and InValid credentials
    Given Admin on Login Page
    When Admin enter below credentials
      | email                  | pwd     |
      | superadmin@yopmail.com | 1234567 |
    Then click on Logn
    And Verify admin login successfully
