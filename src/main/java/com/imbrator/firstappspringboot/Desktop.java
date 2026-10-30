package com.imbrator.firstappspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer{
    @Override
    public void compiling(){
        System.out.println("you are in the desktop");
    }

}
