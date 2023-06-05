Feature: CRUD operation on Category Management

  Background: 
    Given when user on login page
    When enter Admin name "superadmin@yopmail.com"
    When enter Admin password "123456"
    Then Admin click on login
    Then click on Category management

  Scenario: Update Category
    When click on Search button
    And Enter Category Name "Indian Style"
    And click on Edit Category
    And clear and updated Category name "Casual Dining"
    And click on Status Dropdown and Choose Status
    And click on Save Changes
   	And Search Latest updated Category
    #And Enter Categroy Name "Indian Style"
    And Verify Status is Active or InActive
    And click on status
  	 And Click on Delete
