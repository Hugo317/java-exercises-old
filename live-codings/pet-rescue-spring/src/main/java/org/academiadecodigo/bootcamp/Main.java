package org.academiadecodigo.bootcamp;


import org.academiadecodigo.bootcamp.rescue.PetOwner;
import org.academiadecodigo.bootcamp.rescue.Rescue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // petowner -> cat -> toy
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring/spring-config.xml");

        System.out.println("\n###### APPLICATION CONTEXT HAS LOADED!!!!! ######\n");
        PetOwner petowner = context.getBean("friend", PetOwner.class);
        petowner.strokePet();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        RescueDB db = context.getBean("petdb", RescueDB.class);

    }
}
