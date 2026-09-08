package org.academiadecodigo.bootcamp.gameobjects;

public interface Shotable {
    public void hit(int damage);
    boolean isDestroyed = false;
    String soutWhenAimed = "change me";
    public boolean isDestroyed();

    public void setDestroyed(boolean destroyed);
}
