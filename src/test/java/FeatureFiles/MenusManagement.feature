Feature: Menus Management

  Scenario Outline: Update Menus
    Given when user on login page
    When enter Admin name "superadmin@yopmail.com"
    When enter Admin password "123456"
    When click on login
    Then Click on MenuManagement
    And click on search button
    And enter the "<name>"
    And click on edit
    And Click on Category and choose "<CategoryName>"
    And enter Menu Name "<MenuName>"
    And enter Cost "<cost>"
    And enter Description "<Description>"
    And scroll Down
    And change the status
    Then click on SaveChanges

    Examples: 
      | name             | CategoryName     | MenuName        | cost | Description     |
      | Vegetarian Rolls | food v           | DalRice         |  100 | AutomationTest1 |
      | food v           | Lunch            | Chicken Biryani |  170 | Test2           |
      | Lunch            | Vegetarian Rolls | Idli            |   50 | Test3           |
