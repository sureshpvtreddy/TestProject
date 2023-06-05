Feature: HostBiz End to End Scenarios

   #Scenario: Admin Login
    #Given user is in LoginPage
    #When user enter Login Details
      #| Email                  | Password |
     #| superadmin@yopmail.com |   123456 |
    #Then click on Login
    #Then click on HostBiz Management
     #When click on AddBtn
    #When click on Scroll down
     #And enter the below details
      #| Hostbiz Name | User Name | choose file                               | Email                | Mobile     | Password | Hotel Address | City   | Status |
      #| Vantillu     | Suresh    | C:\\Users\\Openteq\\Desktop\\download.jpg | vanitllu@yopmail.com | 9876541219 |   123456 | Nellore       | Kavali | Active |
    #Then click on Save butoon
  Scenario Outline: Hostbiz Login
    Given Hostbiz on login Page
    When Enter "<HostEmail>" And "<Password>"
    When click on LoginBtn
    Then verify HostBiz Dashboard page
    Then click on Logout
Then Verify Logout Sucessful
    Examples: 
      | HostEmail            | Password |
      | vantillu@yopmail.com |   123456 |
