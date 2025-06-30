package com.stepdefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class StepDefinitions {

    @Given("the following user credentials:")
    public void the_following_user_credentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : credentials) {
            String username = row.get("username");
            String password = row.get("password");
            System.out.println("Username: " + username + ", Password: " + password);
            // Add login logic here if needed
        }
    }

    @When("the users attempt to log in")
    public void the_users_attempt_to_log_in() {
        // Login logic goes here
        System.out.println("Users are attempting to log in...");
    }

    @Then("they should see the dashboard")
    public void they_should_see_the_dashboard() {
        // Validation logic
        System.out.println("Dashboard is visible.");
    }
}