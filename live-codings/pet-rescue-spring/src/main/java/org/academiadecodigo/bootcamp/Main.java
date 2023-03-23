package org.academiadecodigo.bootcamp;


import org.academiadecodigo.bootcamp.rescue.PetOwner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // petowner -> cat -> toy
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring/spring-config.xml");

        PetOwner petowner = context.getBean("friend", PetOwner.class);
        petowner.strokePet();



    }
}
