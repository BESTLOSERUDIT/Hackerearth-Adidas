#Author: Udit Pratap Singh
Feature: Purchasing the items on the DemoBlaze website

Background: 
Given Customer launches url on the chrome browser

@SmokeTest
Scenario Outline: Customer should able to successfully purchase the laptops on the DemoBlaze website 

Given Customer navigates to the product category Phone laptop Monitors
Then Customer navigates to the Laptop and selects sony vaio
Then Customer clicks on the Add To Cart Button and Accepts the Pop up
And  Customer navigates to the Laptop and selects Dell 
Then Customer clicks on the Add To Cart Button and Accepts the Pop up
Then Customer Navigates to the cart and deletes Dell from the cart
Then Customer clicks on the Place order
And Fills all the web form fields "<Name>","<Country>","<City>","<Card>","<Month>","<Year>"
Then Customer clicks on the Purchase
And Customer logs the purchase ID and Amount
Then User compares the amount Actual Vs Expected
Then User clicks on OK button 

Examples:
|Name   |Country  |City   |Card          |Month   |Year  |
|Udit   |INDIA    |DELHI  |1234567891012 |MAY     |2020  |