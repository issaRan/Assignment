package com.dau.controller;
import com.dau.Interfaces.Service;
import com.dau.service.BasicService;

public class DAUController<S> {
    private Service basicService;

    public DAUController(Service basicService) {
        this.basicService = basicService;
    }

    public void process() {
        this.basicService.process();
    }
    public S getAllDAU(){
        return (S) this.basicService.getAll();
    }
    public S getDAUByDate(String string){
        return (S) this.basicService.getByDate(string);
    }
}
