package com.company;

public abstract class RequestHandler {

    RequestHandler successor;

    public abstract String handleRequest(WebRequest webRequest);

    public void setSuccessor(RequestHandler successor) {
        this.successor = successor;
    }
}
