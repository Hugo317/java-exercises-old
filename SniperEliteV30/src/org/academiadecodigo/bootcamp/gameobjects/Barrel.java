package org.academiadecodigo.bootcamp.gameobjects;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Barrel extends GameObject implements Shotable{
    boolean isDestroyed = false;
    String soutWhenAimed = "THIS IS AN EXPLOSIVE BARREL";
    public void hit(int damage){
        isDestroyed = true;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }
}
