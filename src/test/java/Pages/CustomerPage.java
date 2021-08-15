package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {
	WebDriver driver= null;
	public CustomerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="id_contact")
	private WebElement contact;

	@FindBy(xpath="//input[@id='email']" )
	private WebElement email;

	@FindBy(xpath="//input[@id='id_order']")
	private WebElement order;

	@FindBy(xpath = "//button[@id='submitMessage']")
	private WebElement submitbutton;

	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement texta ;

	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement message;
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order.sendKeys(order);
	}

	public WebElement getTexta() {
		return texta;
	}

	public void setTexta(String texta) {
		this.texta.sendKeys(texta);
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getMessage() {
		return message;
	}

	public void setContact(String contact) {
		this.contact.sendKeys(contact);
	}
	public void fullcontactpage(String contact,String email,String order,String texta) {
		this.setContact(contact);
		this.setEmail(email);
		this.setOrder(order);
		this.setTexta(texta);
	}
	
}

