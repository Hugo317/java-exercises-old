package org.academiadecodigo.bootcamp;

public class Player {
    String name;
    MyEnum weapon;

    Player(String name) {                        /// BASIC CONSTRUCTOR
        this.name = name;
    }
     Player(String name, MyEnum weapon ) {      /// ADVANCED CONSTRUCTOR
         this.name = name;
         this.weapon = weapon;

    }


}
