package com.demoBlaze.qa.PageORs;

import org.openqa.selenium.By;

public interface DemoBlazeHomePageORs {
	
	
	public By LaptopLink= By.xpath("//a[text()='Laptops']");
	public By LaptopSonyVaioI5= By.xpath("//a[text()='Sony vaio i5']");
	public By AddToCartBtn= By.xpath("//a[text()='Add to cart']");
	public By ProductStore= By.xpath("//a[@id='nava']");
	public By LaptopDellI78GB= By.xpath("//a[text()='Dell i7 8gb']");
	public By cartLink= By.xpath("//a[text()='Cart']");
	public By Deletebtn= By.xpath("//td[text()='Dell i7 8gb']//following::a");
	public By placeOrder= By.xpath("//button[text()='Place Order']");
	public By fieldName= By.xpath("//input[@id='name']");
	public By fieldCountry= By.xpath("//input[@id='country']");
	public By fieldCity= By.xpath("//input[@id='city']");
	public By fieldCard= By.xpath("//input[@id='card']");
	public By fieldMonth= By.xpath("//input[@id='month']");
	public By fieldYear= By.xpath("//input[@id='year']");
	public By purchaseButton= By.xpath("//button[text()='Purchase']");
	public By OKbtn= By.xpath("//button[text()='OK']");
	public By getAmount= By.xpath("//p[@class='lead text-muted ']//br[1]");
	public By getDetails= By.xpath("//p[@class='lead text-muted ']");

}
