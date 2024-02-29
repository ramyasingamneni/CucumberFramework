 
Feature: 
 As a Admin user validate customer creation with multiple data

  @CustomerTest
  Scenario Outline: 
    As Admin User Add Customer

    Given Launch Browser
    When Launch Url with "http://webapp.qedgetech.com"
    When Wait for username with "xpath" and "//input[@id='username']"
    When Enter Username with "xpath" and "//input[@id='username']" and "admin"
    When Enter Password with "name" and "password" and "master"
    When Click login button with "id" and "btnsubmit"
    When Wait for customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
    When Click customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
    When Wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]" 
    When Click Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
    When Wait for customer number with "name" and "x_Customer_Number" 
    When Capture customer number with "name" and "x_Customer_Number"
    When Enter cust in "<CustomerName>" with "xpath" and "//input[@id='x_Customer_Name']" 
    When Enter cust in "<address>" with "xpath" and "//*[@id='x_Address']" 
    When Enter cust in "<city>" with "xpath" and "//*[@id='x_City']" 
    When Enter cust in "<country>" with "xpath" and "//*[@id='x_Country']" 
    When Enter cust in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
    When Enter cust in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
    When Enter cust in "<mail>" with "xpath" and "//*[@id='x__Email']" 
    When Enter cust in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
    When Enter cust in "<note>" with "xpath" and "//*[@id='x_Notes']" 
    When Click Add button with "id" and "btnAction"
    When Wait for confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
    When Click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
    When Wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
    When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
    When Validate customer table
    When Click logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
    When Close App browser

    Examples: 
      | CustomerName    | address   | city       | country | cperson | pnumber     | mail           | mnumber      | note    |
      | laptopSuppliers | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |
      | MobileSuppliers | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |
      | HandbagSupplier | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |
      | Dresses         | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |

