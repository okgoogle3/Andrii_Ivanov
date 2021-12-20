package features.definition;

import com.mashape.unirest.http.exceptions.UnirestException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.API_Dropbox.MetadataReceiver;
import org.junit.Assert;

public class MetadataReceivingDefinition {
    private final MetadataReceiver metadataReceiver;

    public MetadataReceivingDefinition(){
        metadataReceiver = new MetadataReceiver();
    }

    @Given("^a file to receive the metadata of$")
    public void aFileToReceiveTheMetadataOf() {
    }

    @When("^a metadata is received$")
    public void aMetadataIsReceived() throws UnirestException {
        metadataReceiver.metadataReceive();
    }

    @Then("^a metadata receiving is successful$")
    public void aMetadataReceivingIsSuccessful() {
        int responseStatusCode = metadataReceiver.getResponse().getStatus();
        if (responseStatusCode != 200)
        {
            Assert.fail("Unable to receive the metadata");
        }
    }
}