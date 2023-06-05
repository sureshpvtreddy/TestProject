Feature: MyKabin Admin Functionality testing

Scenario: Login with valid credentials
Given user is on LoginPage
When user enter username "superadmin@yopmail.com"
When user enter password "123456"
Then user click on Login button


#Scenario: login with invalid Credentials (Valid User name & Invalid Password)
#Given user is on LoginPage
#When user enter username "superadmin@yopmail.com"
#When user enter password "1234561"
#Then user click on Login button
#Then Verifying Dashboard page Opened or not



#When Click on Users Management
#Then verify Title of the User Management page
#And Click on Add button
#Then verify title of the Adding page
#When user enters UserName 
#And user enter emailId
#When Enter mobile number
#* enter password
#* enter Address
#* Click on Status
#And Click on status is Active
#Then Click on Save Changes