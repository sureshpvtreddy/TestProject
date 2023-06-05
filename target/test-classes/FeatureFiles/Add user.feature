Feature: CRUD Operations on User Management Module

  Background: 
    Given when user on login page
    When enter Admin name "superadmin@yopmail.com"
    When enter Admin password "123456"
    Then Admin click on login
    When click on Users management

  Scenario: User End to End Test
    When click on Add
    And enter new user name "Jai"
    And click on Choose file path "C:\\Users\\Openteq\\Desktop\\pexels-photo.jpeg"
    And enter email "ad@yopmail.com"
    And enter mobile number "9045056729"
    And enter User password "Test@123"
    And enter Address " Vital Rao Nagar,Madhapur"
    Then Click on Save Changes
    Then verify sucess messages "Data Updated Successfully"
    And click on Edit button
    And clear all data
    And Update user details
    Then Click on Save Changes
    Then Delete User
    And Click on Yes Delete It
    And Click on Cancel

  Scenario: Add user
    When click on Add
    And enter new user name "Jai"
    And click on Choose file path "C:\\Users\\Openteq\\Desktop\\pexels-photo.jpeg"
    And enter email "ad@yopmail.com"
    And enter mobile number "9045056729"
    And enter User password "Test@123"
    And enter Address " Vital Rao Nagar,Madhapur"
    Then Click on Save Changes
    Then verify sucess messages "Data Updated Successfully"

  Scenario: Edit & Delete User
    And click on Edit button
    And clear all data
    And Update user details
    Then Click on Save Changes
    Then Delete User
    And Click on Yes Delete It

  Scenario: Delete User
    Then Delete User
    And Click on Yes Delete It

  Scenario: Search, Status and Action
    And Click on Search
    And change the Status by clicking on Status button
    Then Delete User
    And Click on Yes Delete It
    And click on Reports
