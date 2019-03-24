package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


import java.util.List;
//@RunWith(Cucumber.class)
public class SearchCarsSteps {
	@Given("^I am on Home Page$")
    public void i_am_on_home_page() throws Throwable {
    }

    @When("^I move to menu$")
    public void i_move_to_menu() throws Throwable {
    }

    @Then("^title should be \"([^\"]*)\"$")
    public void title_should_be_something(String strArg1) throws Throwable {
    }

    @And("^click on \"([^\"]*)\" link$")
    public void click_on_something_link(String strArg1) throws Throwable {
    }

    @And("^select car brand as \"([^\"]*)\"$")
    public void select_car_brand_as_something(String strArg1) throws Throwable {
    }

    @And("^select car model as \"([^\"]*)\"$")
    public void select_car_model_as_something(String strArg1) throws Throwable {
    }

    @And("^select location as \"([^\"]*)\"$")
    public void select_location_as_something(String strArg1) throws Throwable {
    }

    @And("^select price as \"([^\"]*)\"$")
    public void select_price_as_something(List<String> list1) throws Throwable {
    }

    @And("^click on Find_My_Next_Car button$")
    public void click_on_findmynextcar_button() throws Throwable {
    }

}
