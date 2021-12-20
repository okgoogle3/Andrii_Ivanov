package features.definition;

import com.mashape.unirest.http.exceptions.UnirestException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.API_Dropbox.Uploader;
import org.junit.Assert;

public class UploadingDefinition {
    private final Uploader uploader;

    public UploadingDefinition(){
        uploader = new Uploader();
    }

    @Given("^a file to upload$")
    public void aFileToUpload() {
    }

    @When("^a file is uploaded$")
    public void aFileIsUploaded() throws UnirestException {
        uploader.upload();
    }

    @Then("^uploading is successful$")
    public void uploadingIsSuccessful() {
        int responseStatusCode = uploader.getResponse().getStatus();
        if (responseStatusCode != 200)
        {
            Assert.fail("Unable to upload the file");
        }
    }
}
