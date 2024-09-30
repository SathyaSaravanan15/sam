Feature: JpetStore WebPage Verification

  Scenario: LoginPage of Jpetstore
    Given User must be in HomePage
    When User scroll the Homepage to SignIn
    And User click on Signin Option

  Scenario: SignInPage of JpetStore
    Given User Scroll the signin page
    When User to enter username and password
    When User click on Login
    When User get information about dog
    And User Select Bulldogs and inthat select female dog

  Scenario: ShoppingCartPage of JpetStore
    When User Scroll the ShoppingCartPage
    And User must click on Updatecart
    And User must click checkout
 
Scenario: PaymentPage of JpetStore
When User can Validate the Payment page 
And Click on continuebutton

Scenario: OrderPage of jpetStore
 When User Confirm their order
 
 Scenario: MyOrderPage of JpetStore
 When User can validate myOrderPage
 And User collect orderlist in list
 And User Search the order of Fish
 Then User SignOut their Page 
 