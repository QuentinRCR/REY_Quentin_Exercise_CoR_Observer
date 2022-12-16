package com.company;

import java.util.List;

public class ExistingContentCheckRequestHandler extends RequestHandler{

    public ExistingContentCheckRequestHandler() {
    }

    @Override
    public void handleRequest(WebRequest webRequest) {
        if(List.of("/home","/dashboard").contains(webRequest.getPath())){
            if(this.successor!=null){ //if it is not the end of the chain
                this.successor.handleRequest(webRequest);
            }
        }
        else{
            System.out.println("Status 404 : Page missing");
        }
    }


}
