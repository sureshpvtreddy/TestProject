Feature: HostBiz Login and Verfiy HostBiz Dashboard

  Background: 
    Given Hostbiz on Login page
    When enter Valid Credentials
      | UserName             | Password |
      | vantillu@yopmail.com |   123456 |
    Then click on Login

  #Scenario: Validate forgot Password
  #Given Hostbiz on Login page
  #When Click on Forgot Passsword
  #Then click on Dismis Forgot Password popup
  #When Click on Forgot Passsword
  #Then Enter mail "vantillu@yopmail.com"
  #Then click on Send
  #When enter Valid Credentials
  #(Here How to pass Generated OTP dynamically)
  #| UserName             | OTP |
  #| vantillu@yopmail.com |   123456 |
  #Then click on Login
  #------------ Not completed this below Scenario because of Waits issue need to put Explicity Wait
  #Scenario Outline: Verfiy Dashboard Data
  #When Verfiy All SubModules
  #When click on Dashboard
  #Scenario Outline: End to End Categories Management
  #When click on Categories
  #When Click on Add
  #When Enter the following Data
  #| CategoryName | Status |
  #| PureVeg      | Active |
  #Then click on Save Changes
  #When click on Search and Pass the Category Value
  #| CategoryName |
  #| PureVeg      |
  #When click on Edit
  #Then Update the Existed Data with below data
  #| CategoryName     | Status   |
  #| SouthIndian Food | InActive |
  #Then click on SAVE Changes
  #--------------(need to give proper If Else condition)
  #When Change the Status Active Or Inactive
  #| CategoryName |
  #| PureVeg      |
  #Then Search data and Delete that Data
  #| CategoryName | Status   |
  #| PureVeg      | Inactive |
  #Then click on Cancel On Delete PopUp
  #Then Search data and Delete that Data
  #| CategoryName | Status   |
  #| PureVeg      | Inactive |
  #Then Click on Yes Delete
  #Scenario Outline: End to End Asset Management
  #When click on AssetManagement
  #When Click on Add Asset button
  #And Add Assest "<CabinType>" And "<Status>"
  #And pass the data in Search field "<Search1>"
  #And Change the Status
  #Then pass the data in Search field Delete "<Search2>"
  #And Click on Delete button
  #Then Click on Yes Delete btn
  #Examples:
  #| CabinType | Status   | Search1 | Search2 |
  #| Compact   | InActive | Compact | Compact |
  #| Team      | InActive | Team    | Team    |
  #| Party     | InActive | Party   | Party   |
  #Scenario Outline:
  #When Click on Menu Management
  #And click on Add MenuBtn
  #And Enter the Following Details and Save
  #| CategoryName | MenuName | Cost | Description   | Status   |
  #| pureVeg      | Roti & Dall     |   99 | NorthIndianSpecial | Active |
  #When Click on Edit Menu Management
  #And Update with the following Details and Save
  #| CategoryName | MenuName | Cost | Description   | Status   |
  #| SouthIndian Food      | Rice     |   150 | AndhraSpecial | Inactive |
  #And Switch Status
  #Scenario Outline: Bookings Management
  #When click On Booking Management
  #And search the data "Compact"
  #And click on View Booking And Click on Back
  #And get Booking Table data
  #And search for the data "chai"
  #And Get specific Data
  Scenario Outline: Profile Update
    When Go to Profile Page and Get Profile Information
    And click on Profile Edit and Pass Below Details and Save
      | FullName     | Address  | Email                    | MobileNumber | ProfilePic                                  |
      | VinduBojanam | Duttalur | vindubojanam@yopmail.com |   8919458978 | C:\\Users\\Openteq\\Desktop\\header-bg1.jpg |
    And Select the Date
    #------Need toSend the Date Dynamically into calender
    #And give the date "<exDay>" And "<exMonth>" And "<exYear>"

    And Update Password
    | New      | Confirm  |
    | Test@123 | Test@123 |
    Then Logout
    Examples: 
      | exDay | exMonth | exYear |
      |    05 |      07 |   2024 |
