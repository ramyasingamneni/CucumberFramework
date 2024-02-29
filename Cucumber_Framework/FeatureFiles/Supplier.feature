Feature: 
 As a Admin user validate supplier creation with multiple data

  @SupplierTest
  Scenario Outline: 
    As Admin User Add Supplier

    Given Launch Browser
    When Launch Url with "http://webapp.qedgetech.com"
    When Wait for username with "xpath" and "//input[@id='username']"
    When Enter Username with "xpath" and "//input[@id='username']" and "admin"
    When Enter Password with "name" and "password" and "master"
    When Click login button with "id" and "btnsubmit"
    When Wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
    When Click supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
    When Wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]" 
    When Click Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
    When Wait for supplier number with "name" and "x_Supplier_Number" 
    When Capture supplier number with "name" and "x_Supplier_Number"
    When Enter in "<SupplierName>" with "id" and "x_Supplier_Name" 
    When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
    When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
    When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
    When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
    When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
    When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
    When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
    When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']" 
    When Click Add button with "id" and "btnAction"
    When Wait for confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
    When Click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
    When Wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
    When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
    When Validate supplier table
    When Click logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
    When Close App browser

    Examples: 
      | SupplierName    | address   | city       | country | cperson | pnumber     | mail           | mnumber      | note    |
      | laptopSuppliers | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |
      | MobileSuppliers | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |
      | HandbagSupplier | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |
      | Dresses         | Hyderabad | Hyderabad1 | India   | Ramya   |  9876542314 | test@gmail.com |   2123654751 | testing |
      
      
      
      
     