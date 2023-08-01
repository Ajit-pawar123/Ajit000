package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddCustomerStepDef extends BaseClass {
	private AddCustomerPage addCustomer;

	@Given("User should be on Telecomdomain Page")
	public void user_should_be_on_telecomdomain_page() {
		initialization();
	}

	@Then("and Click on AddCustomer Link and enter text")
	public void and_click_on_add_customer_link_and_enter_text() throws InterruptedException {
		addCustomer = new AddCustomerPage();
		addCustomer.AddCustomerFinctuonality("Ajit");
	}

}
