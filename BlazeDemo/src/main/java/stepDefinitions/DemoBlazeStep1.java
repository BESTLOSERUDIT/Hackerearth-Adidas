package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.demoBlaze.qa.ApplicationFunctions.UserDefinedFuntions;
import com.demoBlaze.qa.PageORs.DemoBlazeHomePageORs;
import com.demoBlaze.qa.base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class DemoBlazeStep1 extends TestBase{

	UserDefinedFuntions UDF= new UserDefinedFuntions();
	
	//HOOKS IN CUCUMBER
	
	@Before
	public void before(Scenario scenario) {
		
		System.out.println("Currently Executing the scenario:- "+scenario.getName());
	}
 
	@After
    public void afterScenario(){
      UDF.fnCloseCurrentBrowser();
    }
	
		
	
	@Given("^Customer launches url on the chrome browser$")
	public void customer_launch_the_url_on_th_chrome_browser() {
		
		try {
			initialization();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

	@Given("^Customer navigates to the product category Phone laptop Monitors$")
	public void customer_navigate_to_the_product_category_Phone_laptop_Monitors() {
		
		UDF.clickOnTheLink(DemoBlazeHomePageORs.LaptopLink);
		
	}

	@Then("^Customer navigates to the Laptop and selects sony vaio$")
	public void customer_navigate_to_the_Laptop_and_select_sony_vaio() throws InterruptedException {
		
		//UDF.waitForTheElementToVisible(DemoBlazeHomePageORs.LaptopSonyVaioI5, TestUtil.WebDriverWait);
		UDF.staticwaitForTheElement(4);
		UDF.clickOnTheLink(DemoBlazeHomePageORs.LaptopSonyVaioI5);
		
		
	}

	@Then("^Customer clicks on the Add To Cart Button and Accepts the Pop up$")
	public void customer_click_on_the_Add_To_Cart_Button_and_Accept_the_Pop_up() throws InterruptedException, AWTException {
		
		//UDF.waitForTheElementToVisible(DemoBlazeHomePageORs.AddToCartBtn, TestUtil.WebDriverWait);
		UDF.staticwaitForTheElement(4);
		UDF.clickOnTheLink(DemoBlazeHomePageORs.AddToCartBtn);
		UDF.acceptTheAlertPopUp();
		
	}

	@Then("^Customer navigates to the Laptop and selects Dell$")
	public void customer_navigate_to_the_Laptop_and_select_Dell() {
		
		UDF.clickOnTheLink(DemoBlazeHomePageORs.ProductStore);	
		UDF.clickOnTheLink(DemoBlazeHomePageORs.LaptopLink);
		UDF.clickOnTheLink(DemoBlazeHomePageORs.LaptopDellI78GB);
		UDF.clickOnTheLink(DemoBlazeHomePageORs.AddToCartBtn);
		UDF.acceptTheAlertPopUp();
	}

	@Then("^Customer Navigates to the cart and deletes Dell from the cart$")
	public void customer_Navigate_to_the_cart_and_delete_Dell_i_gb_from_the_cart() {
		
		UDF.clickOnTheLink(DemoBlazeHomePageORs.cartLink);
		UDF.clickOnTheLink(DemoBlazeHomePageORs.Deletebtn);
		
	}

	@Then("^Customer clicks on the Place order$")
	public void customer_click_on_the_Place_order() {
		UDF.clickOnTheLink(DemoBlazeHomePageORs.placeOrder);
		
	}

	@Then("^Fills all the web form fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void fill_all_the_web_form_fields(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws InterruptedException {
		UDF.enterValueInField(DemoBlazeHomePageORs.fieldName, arg1, "");
		UDF.enterValueInField(DemoBlazeHomePageORs.fieldCountry, arg2, "");
		UDF.enterValueInField(DemoBlazeHomePageORs.fieldCity, arg3, "");
		UDF.enterValueInField(DemoBlazeHomePageORs.fieldCard, arg4, "");
		UDF.staticwaitForTheElement(2);
		UDF.enterValueInField(DemoBlazeHomePageORs.fieldMonth, arg5, "");
		UDF.staticwaitForTheElement(2);
		UDF.enterValueInField(DemoBlazeHomePageORs.fieldYear, arg6, "");
		
		UDF.clickOnTheLink(DemoBlazeHomePageORs.purchaseButton);
	}

	@Then("^Customer clicks on the Purchase$")
	public void customer_click_on_the_Purchase() {
		try {
			UDF.staticwaitForTheElement(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("^Customer logs the purchase ID and Amount$")
	public void customer_log_the_purchare_ID_and_Amount() {
	
		String purchareDetails =UDF.getTextOfElement(DemoBlazeHomePageORs.getDetails);
		System.out.println(purchareDetails);
		
	}

	@Then("^User compares the amount Actual Vs Expected$")
	public void user_compare_the_amount_Actual_Vs_Expected() {
		
		String amountDetails= UDF.getTextOfElement(DemoBlazeHomePageORs.getAmount);
		System.out.println(amountDetails);
				
		Assert.assertTrue(amountDetails.contains("Amount: 700 USD"));
		
	}

	@Then("^User clicks on OK button$")
	public void user_click_on_OK_button() {
	
		UDF.clickOnTheLink(DemoBlazeHomePageORs.OKbtn);
	
	}

	
	
	
}
