package org.API_Dropbox;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Deleter extends RequestSender{
    public void delete() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        response = Unirest.post("https://api.dropboxapi.com/2/files/delete_v2")
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body("{\r\n    \"path\":\"/Test.txt\"\r\n}")
                .asString();
    }
}
