package org.API_Dropbox;

import com.mashape.unirest.http.HttpResponse;

public abstract class RequestSender
{
    protected static final String token = "Bearer xmQJLFl4RdQAAAAAAAAAAakeSz-toFah3scRlYvnwr67hNBvzQPzCvDJiPxggNau";
    protected HttpResponse<String> response;

    public HttpResponse<String> getResponse(){
        return response;
    }
}