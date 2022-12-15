package com.company;

public abstract class RequestHandler {

    RequestHandler successor;

    public abstract void handleRequest(WebRequest webRequest);

    public void setSuccessor(RequestHandler successor) {
        this.successor = successor;
    }
}
