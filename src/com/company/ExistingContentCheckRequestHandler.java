package com.company;

import java.util.List;

public class ExistingContentCheckRequestHandler extends RequestHandler{

    public ExistingContentCheckRequestHandler() {
    }

    @Override
    public String handleRequest(WebRequest webRequest) {
        if(List.of("/home","/dashboard").contains(webRequest.getPath()) && this.successor!=null){ //the this.successor!=null is to handle the case when it is not the end of the chain
            return  this.successor.handleRequest(webRequest);
        }
        else{
            return ("Status 404 : Page missing");
        }
    }


}
