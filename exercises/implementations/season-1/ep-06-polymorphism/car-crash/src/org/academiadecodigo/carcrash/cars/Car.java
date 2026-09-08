package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.CollisionDetector;
import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Position;

/**
 * Generic Car behaviour
 */
public abstract class Car {


    private Position pos;
    private int speed;
    private CarType carType;
    private float directionChangeLevel = 0.8f;

    private Direction currentDirection;
    private boolean crashed = false;
    private CollisionDetector collisionDetector;






    public Car(Position pos, CarType carType, int speed) {

        this.pos = pos;
        this.carType = carType;
        this.speed = speed;

        currentDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];

    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void crash() {

        this.crashed = true;
    }

    public void setDirectionChangeLevel(int directionChangeLevel) {
        this.directionChangeLevel = directionChangeLevel;
    }


    public abstract void move();


    public Direction chooseDirection(){

        // by default, lets always move in the same direction....
        Direction newDirection = currentDirection;

        // 0 -> 0.99999
        if(Math.random() > directionChangeLevel) {
            newDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];

            // currentDirection = UP, newDirection = DOWN
            if(newDirection.isOpposite(currentDirection)) {
                return chooseDirection();
            }
        }


        return newDirection;

    }


    public void accelerate(Direction direction){

        if(isCrashed()){
            return;
        }

        Direction newDirection = direction;

        if(pos.isEdge(direction)){
            newDirection = direction.oppositeDirection();
        }

        currentDirection = newDirection;

        for (int speed = 0; speed < this.speed; speed++) {
            getPos().moveInDirection(newDirection);

            // if we just crashed with another car, stop moving!
            collisionDetector.check(this);
            if(crashed){
                break;
            }
        }
    }


    @Override
    public String toString() {
        return isCrashed() ? "C" : Character.toString(carType.getSymbol());
    }


    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }
}
