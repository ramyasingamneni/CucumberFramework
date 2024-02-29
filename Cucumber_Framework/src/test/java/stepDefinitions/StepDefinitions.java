package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinitions
{
WebDriver driver;

@Given("Launch Browser")
public void launch_browser() 
{
   driver= FunctionLibrary.startBrowser();
}
@When("Launch Url with {string}")
public void launch_url_with(String url)
{
    FunctionLibrary.openUrl(url);
}
@When("Wait for username with {string} and {string}")
public void wait_for_username_with_and(String Locator_Type, String Locator_Value)
{
   FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Enter Username with {string} and {string} and {string}")
public void enter_username_with_and_and(String Locator_Type, String Locator_Value, String Test_Data)
{
    FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
}
@When("Enter Password with {string} and {string} and {string}")
public void enter_password_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) 
{
	 FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
}
@When("Click login button with {string} and {string}")
public void click_login_button_with_and(String Locator_Type, String Locator_Value)
{
    FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Wait for supplier link with {string} and {string}")
public void wait_for_supplier_link_with_and(String Locator_Type, String Locator_Value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Click supplier link with {string} and {string}")
public void click_supplier_link_with_and(String Locator_Type, String Locator_Value)
{
    FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Wait for Add icon with {string} and {string}")
public void wait_for_add_icon_with_and(String Locator_Type, String Locator_Value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Click Add icon with {string} and {string}")
public void click_add_icon_with_and(String Locator_Type, String Locator_Value)
{
   FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Wait for supplier number with {string} and {string}")
public void wait_for_supplier_number_with_and(String Locator_Type, String Locator_Value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Capture supplier number with {string} and {string}")
public void capture_supplier_number_with_and(String Locator_Type, String Locator_Value) throws Throwable 
{
    FunctionLibrary.captureSup(Locator_Type, Locator_Value);
}
@When("Enter in {string} with {string} and {string}")
public void enter_in_with_and(String Test_Data, String Locator_Type , String Locator_Value) throws Throwable 
{
    FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
}
@When("Click Add button with {string} and {string}")
public void click_add_button_with_and(String Locator_Type, String Locator_Value)
{
    FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Wait for confirm ok button with {string} and {string}")
public void wait_for_confirm_ok_button_with_and(String Locator_Type, String Locator_Value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Click confirm ok button with {string} and {string}")
public void click_confirm_ok_button_with_and(String Locator_Type, String Locator_Value) 
{
    FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Wait for Alert ok button with {string} and {string}")
public void wait_for_alert_ok_button_with_and(String Locator_Type, String Locator_Value)
{
   FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Click Alert ok button with {string} and {string}")
public void click_alert_ok_button_with_and(String Locator_Type, String Locator_Value)
{
    FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Validate supplier table")
public void validate_supplier_table() throws Throwable 
{
    FunctionLibrary.supplierTable();
}
@When("Click logout link with {string} and {string}")
public void click_logout_link_with_and(String Locator_Type, String Locator_Value)
{
    FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Close App browser")
public void close_app_browser() 
{
   FunctionLibrary.closeBrowser();
}

@When("Wait for customer link with {string} and {string}")
public void wait_for_customer_link_with_and(String Locator_Type, String Locator_Value)
{
    FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Click customer link with {string} and {string}")
public void click_customer_link_with_and(String Locator_Type, String Locator_Value)
{
    FunctionLibrary.clickAction(Locator_Type, Locator_Value);
}
@When("Wait for customer number with {string} and {string}")
public void wait_for_customer_number_with_and(String Locator_Type, String Locator_Value) 
{
   FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}
@When("Capture customer number with {string} and {string}")
public void capture_customer_number_with_and(String Locator_Type, String Locator_Value) throws Throwable
{
    FunctionLibrary.captureCus(Locator_Type, Locator_Value);
}
@When("Enter cust in {string} with {string} and {string}")
public void enter_cust_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) 
{
    FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
}
@When("Validate customer table")
public void validate_customer_table() throws Throwable 
{
    FunctionLibrary.customerTable();
}
}
