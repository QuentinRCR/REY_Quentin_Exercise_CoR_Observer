package com.company;

public class RenderContentHandler extends RequestHandler{
    @Override
    public void handleRequest(WebRequest webRequest) {
        if(webRequest.getPath().equals("/home")){
            System.out.println("Status 200 : Home content here");
        } else if (webRequest.getPath().equals("/dashboard")) {
            System.out.println("Status 200 : Dashboard content here");
        }
    }
}
