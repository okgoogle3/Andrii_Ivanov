package org.API_Dropbox;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class MetadataReceiver extends RequestSender{
    public void metadataReceive() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        response = Unirest.post("https://api.dropboxapi.com/2/files/get_metadata")
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body("{\r\n    \"path\":\"/Test.txt\"\r\n}")
                .asString();
    }
}
