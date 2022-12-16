package com.company;

public class PolicyCheckRequestHandler extends RequestHandler{
    @Override
    public String handleRequest(WebRequest webRequest) {
        if(webRequest.getPath().equals("/dashboard") && !webRequest.getLoggedUser().isAdmin()){
            return ("Status 403 : user is not authorized to access this content");
        }
        else if(this.successor!=null){ //if it is not the end of the chain
                return this.successor.handleRequest(webRequest);
        }
        else { //means it is the end of the chain
            return "";
        }
    }
}
