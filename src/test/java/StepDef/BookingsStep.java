package StepDef;

import DriverFactory.MyKabinDriverFactory;
import PageObject.BookingPage;
import io.cucumber.java.en.Then;

public class BookingsStep {
	
	private BookingPage bookingPage = new BookingPage(MyKabinDriverFactory.getDriver());

	@Then("Click on Booking Management")
	public void click_on_booking_management() {
	  bookingPage.clickOnBookingMng();  
	}

	@Then("Verfiy Booking Page")
	public void verfiy_booking_page() {
	   bookingPage.verifyBookingPage(); 
	}

	@Then("Click on Search field")
	public void click_on_search_field() {
	    bookingPage.clickOnsearch();
	}
@Then("Enter user name {string}") 
	public void Enter_user_name(String UserName) {
	bookingPage.enterName(UserName);
	
}
	@Then("Click on View button")
	public void click_on_view_button() {
	  bookingPage.clickOnView();
	}
	
	@Then("Verify View Bookings Page")
	public void verify_view_bookings_page() {
	   bookingPage.verifyViewPage();
	}

	@Then("scroll down the page")
	public void scroll_down_the_page() {
	    bookingPage.scrollDown();
	}

	@Then("click on Back button")
	public void click_on_back_button() {
	   bookingPage.clickOnBack();
	}
}
