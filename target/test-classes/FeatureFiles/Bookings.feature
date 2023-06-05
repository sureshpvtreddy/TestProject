Feature: Bookings Management

  Background: 
    Given when user on login page
    When enter Admin name "superadmin@yopmail.com"
    When enter Admin password "123456"
    Then Admin click on login
    Then Click on Booking Management
    Then Verfiy Booking Page

  Scenario: Verify& View the Booking Details
    And Click on Search field
    And Enter user name "jai"
    Then Click on View button
    Then Verify View Bookings Page
    And scroll down the page
    Then click on Back button
    Then Verfiy Booking Page
