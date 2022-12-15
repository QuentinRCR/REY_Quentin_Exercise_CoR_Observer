package com.company;

import java.util.ArrayList;
import java.util.List;

public class WebServer implements WebRequestObservable{
    private RequestHandler firstSuccesor;

    private List<WebRequestObserver> observers = new ArrayList<>();

    public String getRequest(WebRequest request) {
        this.firstSuccesor.handleRequest(request);
        this.notifyObservers(request);
        return "";
    }

    @Override
    public void attach(WebRequestObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(WebRequestObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(WebRequest webRequest) {
        for(WebRequestObserver observer : this.observers){
            observer.update(webRequest);
        }
    }

    public void setFirstSuccesor(RequestHandler firstSuccesor) {
        this.firstSuccesor = firstSuccesor;
    }
}
