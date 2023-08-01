package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleradioButton extends BaseClass {

	public static void findElements(List<WebElement> ls, String Status) {
		for (WebElement abc : ls) {
			String b = null;
			String a = abc.getAttribute("value");
			if (Status.equalsIgnoreCase("Done")) {
				b = "ACTIVE";
			} else if (Status.equalsIgnoreCase("Pending")) {
				b = "INACTIVE";
			}
			if (a.equalsIgnoreCase(b)) {
				abc.click();
			}
		}
	}

}
