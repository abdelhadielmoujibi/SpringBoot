package com.imbrator.firstappspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class ImbratorComponent {
    private int age ;
    @Autowired
    private Labtop labtop;

    public void deffinition(){
        labtop.compiling();

    }
}
