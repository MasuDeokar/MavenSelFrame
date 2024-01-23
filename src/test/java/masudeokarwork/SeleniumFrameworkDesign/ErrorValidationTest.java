package masudeokarwork.SeleniumFrameworkDesign;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import masudeokar.TestComponents.BaseTest;
import pageObject.masudeokarwork.SeleniumFrameworkDesign.CartPage;
import pageObject.masudeokarwork.SeleniumFrameworkDesign.ProductCatalog;

public class ErrorValidationTest extends BaseTest {

	@Test(groups = {"ErrorHandling"})
	public void LoginErrorValidation() throws InterruptedException, IOException {

		
		landingPage.loginApplication("mayureshdeokar123@gmail.com", "Shamanth@123");
		Assert.assertEquals("Incorrect email  password.", landingPage.getErrorMessage());
	}

		@Test
		public void productErrorValidation ()throws InterruptedException, IOException {
		
		String productName = "ZARA COAT 3";
		ProductCatalog productCatalog = landingPage.loginApplication("mayureshdeokar@gmail.com", "Shamanth@123");
		@SuppressWarnings("unused")
		List<WebElement> products = productCatalog.getProductList();
		productCatalog.addProductToCart(productName);
		CartPage cartPage = productCatalog.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
		}
		

}

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,600)");
//Thread.sleep(2000);
//CheckOutPage checkOutPage = cartPage.goToCheckout();
//checkOutPage.selectCountry("india");
//ConfiramationPage confiramationPage = checkOutPage.submitOrder();
//String confirmMessage = confiramationPage.getConfirmationMessage();
//AssertJUnit.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));