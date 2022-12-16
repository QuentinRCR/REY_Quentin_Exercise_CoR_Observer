package com.company;

public class RenderContentHandler extends RequestHandler{
    @Override
    public String handleRequest(WebRequest webRequest) {
        if(webRequest.getPath().equals("/home")){
            return ("Status 200 : Home content here");
        } else if (webRequest.getPath().equals("/dashboard")) {
            return ("Status 200 : Dashboard content here");
        }
        else if(this.successor!=null){ //if it is not the end of the chain
            return this.successor.handleRequest(webRequest);
        }
        else { //means it is the end of the chain
            return null;
        }
    }
}
