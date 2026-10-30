package com.imbrator.firstappspringboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Labtop  implements Computer{
    public void compiling(){
        System.out.println("you in the compiling of the Labtop");
    }
}
