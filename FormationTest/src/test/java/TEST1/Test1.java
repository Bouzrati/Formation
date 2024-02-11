package TEST1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	  System.out.println("done1");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("done2");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("done3");
	}


}
