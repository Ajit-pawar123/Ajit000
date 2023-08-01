package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class AddCustomerPage extends BaseClass {

	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement AddcustomerLink;

	@FindBy(name = "fname")
	private WebElement fname;

	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}

	public void AddCustomerFinctuonality(String Fname) throws InterruptedException {
		Thread.sleep(3000);
		UtilityLayer.UtilsClass.click(AddcustomerLink);
		UtilityLayer.UtilsClass.sendkeys(fname, Fname);
	}

}
