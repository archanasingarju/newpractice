package stepDefinations;

import java.io.FileInputStream;



import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Pages.AuthenticationPage;
import Pages.CustomerPage;
import Pages.Homepage;
import Pages.MyAccountPage;
import Pages.Signpage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Data;
import cucumber.deps.com.thoughtworks.xstream.io.xml.DomReader;
import excel.ExcelReader;
import testbase.TestBase;

public class StepDefinations extends TestBase {
	public AuthenticationPage authObj;
	public MyAccountPage myAccObj;
	public Homepage homePageObj;
	public Signpage sign;
	public CustomerPage cusobj;
	public Properties prop;
	public FileInputStream fis;
	public static ExcelReader excelReader;

	@Given("^Open browser Navigate to \"([^\"]*)\"$")
    public void open_browser_navigate_to_something(String strArg1) throws Throwable {
		driver = TestBase.setup();
		
		authObj = new AuthenticationPage(driver);
		
		myAccObj = new MyAccountPage(driver);
		
		homePageObj = new Homepage(driver);
		
		sign =new Signpage(driver);
		
		cusobj =new CustomerPage(driver);
  
    }
    @When("^Click on the SignIn link$")
    public void click_on_the_signin_link() throws Throwable {
    	 homePageObj.getSignInLink().click();  
    }

    @When("^Enter Username and Password \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter_username_and_password_something_something(String strArg1, String strArg2) throws Throwable {
    	authObj.setLoginEmail(strArg1);
        authObj.setLoginPassword(strArg2);
        authObj.getLoginSubmitButton().click();
      
    }

    @Then("^Veirfy MyAccount Page displayed or not$")
    public void veirfy_myaccount_page_displayed_or_not() throws Throwable {
    	String heading = myAccObj.getMyAccPageHeading().getText();

        Assert.assertEquals(heading, "MY ACCOUNT");
   
    }
@When("^Click on the ContactUs$")
    public void click_on_the_contactus() throws Throwable {
    	sign.getConus().click();
}
@When("^Enter Search box \"([^\"]*)\"$")
    public void enter_search_box_something(String strArg1) throws Throwable {
    	sign.getSearchTextBox().sendKeys(strArg1);
    }

    @Then("^verify CUSTOMER SERVICE page display or not$")
    public void verify_customer_service_page_display_or_not() throws Throwable {
      
    	String name = "Contact us";
    	String text=	homePageObj.getContactUs().getText();

    	Assert.assertEquals(name, text);
    	
    }
    
    @When("^Login with below credentials$")
    public void login_with_below_credentials(DataTable data) throws Throwable {
    	List<List<String>> res = data.raw();
    	System.out.println(res.get(0).get(0));
    	System.out.println(res.get(0).get(1));
    	authObj.setLoginEmail(res.get(0).get(0));
    	authObj.setLoginPassword(res.get(0).get(1));
    	authObj.getLoginSubmitButton().click();
   
 }
    @When("^user login in to application with username (.+) and password (.+)$")
    public void user_login_in_to_application_with_username_and_password(String username, String password) throws Throwable {
    authObj.setLoginEmail(username);
	authObj.setLoginPassword(password);
	authObj.getLoginSubmitButton().click();
}
   @When("^user Login to the page$")
    public void user_login_to_the_page() throws Throwable {
    ExcelReader excelReader =null;
    excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\excel\\InputDataForTestCases.xlsx");
    int rowcount = excelReader.getRowCount("login_app");
	for(int i=2;i<=rowcount;i++) {	
	System.out.println("Get Cell Data Sheet, ColumnName RowNum=> "+ excelReader.getCellData("login_app", "UserName", i));
	System.out.println("Get Cell Data Sheet, ColumnName RowNum=> "+ excelReader.getCellData("login_app", "PassWord", i));
	String username = excelReader.getCellData("login_app", "UserName", i);
	String pass = excelReader.getCellData("login_app", "PassWord", i);
	authObj.setLoginEmail(username);
	authObj.setLoginPassword(pass);
	authObj.getLoginSubmitButton().click();
	String name =myAccObj.getMyAccPageHeading().getText();
	String text="MY ACCOUNT";
	//Assert.assertEquals("MY ACCOUNT", name);
	if(text.equals(name))
	{
		
		Assert.assertEquals(name, text);
	
	}
	else
	{
		driver.navigate().back();
		homePageObj.getSignInLink().clear();
	  
	
	}
	authObj.getSignOutLink().click();
	}
}
  
 @When("^user fills the form using Sheet name (.+) and rowno (.+)$")
   public void user_fills_the_form_using_sheet_name_and_rowno(String sheetname, int rowno) throws Throwable {
	   	ExcelReader excelReader =null;
	    excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\excel\\InputDataForTestCases2.xlsx");
	    
	    int rowno1 = excelReader.getRowCount("contact");
	    for(int i=2;i<=rowno1;i++) {
	    String subh = excelReader.getCellData("contact","SubjectHeading", i);
		String addr = excelReader.getCellData("contact", "Emailaddress", i);
		String order = excelReader.getCellData("contact", "Orderreference", i);
		String mess = excelReader.getCellData("contact", "Message", i);
		cusobj.setContact(subh);
		cusobj.setEmail(addr);
		cusobj.setOrder(order);
		cusobj.setTexta(mess);
		cusobj.getSubmitbutton().click();
   	// sign.getConus().click();

	 String name=cusobj.getMessage().getText();
	 String text="Your message has been successfully sent to our team.";
     Assert.assertEquals(name,text);
	     if(text.equals(name))
		{
	    	 Assert.assertEquals(name, text);
		}
		else
		{
		break;
}
    	 sign.getConus().click();
}
   }
   @When("^click on submit button$")
   public void click_on_submit_button() throws Throwable {
       cusobj.getSubmitbutton().click();
   }

   @Then("^it show a successfull message \"([^\"]*)\"$")
   public void it_show_a_successfull_message_something(String strArg1) throws Throwable {
       String name=cusobj.getMessage().getText();
       String text="Your message has been successfully sent to our team.";
       Assert.assertEquals(name,text);
   }

}
