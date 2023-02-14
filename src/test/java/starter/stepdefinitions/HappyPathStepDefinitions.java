package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.actions.cookiescreen.AcceptButtonClickAction;
import starter.actions.login.EnterEmailAndClickAction;
import starter.actions.login.EnterPasswordAndClickAction;
import starter.actions.login.SingInWithEmailClickAction;
import starter.actions.reserveprocess.ReserveTheseOptionsClickAction;
import starter.actions.searchform.*;
import starter.actions.searchresults.HotelClickAction;
import starter.actions.searchresults.SelectRoomButtonClickAction;
import starter.contentvalidations.searchscreen.SearchGeniusCarouselElementValidation;
import starter.contentvalidations.searchscreen.SearchTravelMoreSpendLessElementValidation;
import starter.contentvalidations.welcomepopup.StartSearchingElementValidation;
import starter.contentvalidations.welcomepopup.WelcomeElementValidation;
import starter.contentvalidations.welcomepopup.WelcomeGeniusElementValidation;
import starter.contentvalidations.welcomepopup.WelcomeMessageValidation;
import starter.contentvalidations.loginscreen.*;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class HappyPathStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

// Optional step in some emulator this message appears
    @Given("the cookies message appear randomly in some devices")
    public void theCookiesMessageAppearRandomlyInSomeDivices() {
        theActorCalled("User").attemptsTo(
                new AcceptButtonClickAction()
                );
    }

    @Given("a new user is opening the application by first time")
    public void userIsOpeningTheApplicationByFirstTime() {

        theActorCalled("User");

        String expectedHeaderText = "Sign in or create an account";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedHeaderText", HeaderValidation.value(), equalTo(expectedHeaderText)));

        String expectedHeaderDescriptionText = "Choose any of the options below to sign in or start creating an account.";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedHeaderDescriptionText", HeaderDescriptionValidation.value(), equalTo(expectedHeaderDescriptionText)));

        String expectedSignInWithEmailText = "Sign in with email";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedSignInWithEmailText", SingInWithEmailValidation.value(), equalTo(expectedSignInWithEmailText)));

        String expectedSignInWithGoogleText = "Sign in with Google";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedSignInWithGoogleText", SingInWithGoogleValidation.value(), equalTo(expectedSignInWithGoogleText)));

        String expectedSignInWithFacebookText = "Sign in with Facebook";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedSignInWithFacebookText", SingInWithFacebookValidation.value(), equalTo(expectedSignInWithFacebookText)));

        String expectedCreatedAccountText = "Create your account";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedCreatedAccountText", CreateAccountValidation.value(), equalTo(expectedCreatedAccountText)));

        String expectedPageTermAndConditionsText = "By signing in or creating an account, you agree with our Terms & Conditions and Privacy Statement";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedPageTermAndConditionsText", TermsAndConditionsValidation.value(), equalTo(expectedPageTermAndConditionsText)));

    }

    @When("a new user want to login first time in the app using the email option")
    public void userWantToLoginFirstTimeInTheAppUsingTheEmailOption() {
        theActorCalled("User")
                .attemptsTo(
                        new SingInWithEmailClickAction()
                );
    }


    @When("a valid email and password are entered")
    public void valid_email_and_password_are_entered() {
        theActorInTheSpotlight()
                .attemptsTo(
                        new EnterEmailAndClickAction()
                );

        theActorInTheSpotlight()
                .attemptsTo(
                        new EnterPasswordAndClickAction()
                );


    }


    @Then("a user successfully access to the application")
    public void userSuccessfullyAccessToTheApplication() {

        String expectedWelcomeText = "Welcome to Booking.com!";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedWelcomeText", WelcomeElementValidation.value(), equalTo(expectedWelcomeText)));

        String messageText = "You can now enjoy your Genius Level 1 discounts worldwide, easily access your bookings, and more.";
        theActorInTheSpotlight().should(seeThat("Validation Text messageText", WelcomeMessageValidation.value(), equalTo(messageText)));

        String expectedGeniusText = "Learn more about Genius";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedGeniusText", WelcomeGeniusElementValidation.value(), equalTo(expectedGeniusText)));

        String expectedStartSearchingText = "Start searching";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedStartSearchingText", StartSearchingElementValidation.value(), equalTo(expectedStartSearchingText)));

    }

    @When("the user press the Start Searching Button")
    public void pressTheStartSearchingButton() {
        theActorInTheSpotlight()
                .attemptsTo(
                        new StartSearchingClickAction()
                );
        String expectedTravelMessageText = "Travel more, spend less";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedTravelMessageText", SearchTravelMoreSpendLessElementValidation.value(), equalTo(expectedTravelMessageText)));

        String expectedGeniusMessageText = "Enjoy discounts at participating properties worldwide";
        theActorInTheSpotlight().should(seeThat("Validation Text expectedGeniusMessageText", SearchGeniusCarouselElementValidation.value(), equalTo(expectedGeniusMessageText)));

    }

    @Then("the user enter the destination city")
    public void enterTheDestinationCity() {
        theActorInTheSpotlight()
                .attemptsTo(
                        new DestinationClickAction()
                );


    }

    @And("select the second destination choice")
    public void selectTheSecondDestinationChoice() {
        new WaitAction();
        theActorInTheSpotlight()
                .attemptsTo(
                        new FirstDestinationChoiceClickAction()
                );

    }

    @Then("the user enter to the from and to dates")
    public void enterTheFromAndToDates() {
        theActorInTheSpotlight()
                .attemptsTo(
                        new FromClickAction()
                );
        new WaitAction();
        theActorInTheSpotlight()
                .attemptsTo(
                        new ToClickAction()
                );
        theActorInTheSpotlight()
                .attemptsTo(
                        new SelectDatesClickAction()
                );

    }

    @And("the user enter to the option select room and guess")
    public void enterToTheOptionSelectRoomAndGuess() {

        theActorInTheSpotlight()
                .attemptsTo(
                        new RoomAndGuessClickActions()
                );
    }

    @When("the user press the search button")
    public void PressTheSearchButton() {

        theActorInTheSpotlight()
                .attemptsTo(
                        new SearchClickAction()
                );

//        theActorInTheSpotlight()
//                .attemptsTo(
//                        new SortClickAction()
//                );
//
//        String expectedHotelName = "JW Marriott El Convento Cusco";
//        theActorInTheSpotlight().should(seeThat("Validation Text expectedHotelName", HotelNameElementValidation.value(), equalTo(expectedHotelName)));

    }

    @Then("the user select the option two JW Marriot Hotel")
    public void selectTheOptionTwoJWMarriotHotel() {
        theActorInTheSpotlight()
                .attemptsTo(
                        new HotelClickAction()
                );
       
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
        
//        String expectedHotelDescriptionName = "JW Marriott El Convento Cusco\n\u200B\u200B \u200B\u200B";
//        theActorInTheSpotlight().should(seeThat("Validation Text expectedHotelDescriptionName", HotelDescriptionElementValidation.value(), equalTo(expectedHotelDescriptionName)));
//
//        String amountReserve = "US$5,058";
//        theActorInTheSpotlight().should(seeThat("Amount of the Reserve into selected hotel", SelectedHotelAmountElement.value(), equalTo(amountReserve)));
        
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//     
    }

    @Then("the user press the button See your Option")
    public void pressTheButtonSeeYourOption() {
        theActorInTheSpotlight()
                .attemptsTo(
                        new SelectRoomButtonClickAction()
                );

//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
        
//        String amountReserve = "US$5,058";
//        theActorInTheSpotlight().should(seeThat("Amount of the Reserve into selected hotel", FinalAmountElementValidation.value(), equalTo(amountReserve)));
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try
//        The result retrieve the element in different position , that is why this element validation are comment, you can remove the commet and try        
    }

    @And("the user press the button Reserve these options")
    public void pressTheButtonReserveTheseOptions() {
        theActorInTheSpotlight()
                .attemptsTo(
                        new ReserveTheseOptionsClickAction()
                );
       
    }


}