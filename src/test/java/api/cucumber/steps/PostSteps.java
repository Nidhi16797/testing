package api.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

import java.util.List;

public class PostSteps {
    @Given("User should be logged in and should be present on his wall")
    public void UserShouldBeLoggedInAndShouldBePresentOnHisFall() throws Throwable{
//        System.out.println("UserShouldBeLoggedInAndShouldBePresentOnHisFall");
    }

    @When("I type the message in the text box")
    public void iTypeTheMessageInTheBox(){
        System.out.println("iTypeTheMessageInTheBox");
    }

    @When("^I type the message as \"([^\"]*)\" in the text box$")
    public void iTypeTheMessageAsSomethingInTheBox(String text) throws Throwable{
        System.out.println("text: "+text);
    }

    @And("Click on the post button")
    public void clickOnThePostButton() throws Throwable{
        System.out.println("clickOnThePostButton");
    }

//    @Then("^the message should get posted$")
//    public void theMessageShouldGetPosted() throws Throwable{
//        System.out.println("theMessageShouldGetPosted");
//    }

    @Then("the message should get posted")
    public void the_Message_Should_GetPosted() {
        System.out.println("the_Message_Should_GetPosted");
    }





    @Given("User should be logged in and should be present at its own wall")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
//        System.out.println("userShouldBeLoggedInAndShouldBePresentAtItsOwnWall");
    }

    @When("User supply the youtube link in the text box")
    public void userSupplyTheYoutubeLinkInTheTextBox() {
        System.out.println("userSupplyTheYoutubeLinkInTheTextBox");
    }

    @When("^User supply the youtube link as \"([^\"]*)\" in the text box")
    public void userSupplyTheYoutubeLinkAsSomethingInTheTextBox(String url) {
        System.out.println("URL: "+url);
    }

    @And("Click on Post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("the video should get posted on the user wall")
    public void theVideoShouldGetPostedOnTheUserWall() {
        System.out.println("theVideoShouldGetPostedOnTheUserWall");
    }

    @And("the video should have proper thumnail")
    public void theVideoShouldHaveProperThumnail() {
        System.out.println("theVideoShouldHaveProperThumnail");
    }


    @Given("User is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() {
    }

    @When("User logs in with following username and password")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable) throws Throwable {
//        List<List<String>> list_of_rows=dataTable;
    }

    @Then("User should be able to login with correct username and password")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() {
    }

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
    }

    @When("User Navigate to Login page")
    public void userNavigateToLoginPage() {
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {
    }
}
