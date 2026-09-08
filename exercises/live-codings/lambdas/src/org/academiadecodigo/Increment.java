package org.academiadecodigo;

public class Increment implements MonoOperation<Integer>{
    @Override
    public Integer execute(Integer operand) {
       return ++operand;
    }
}
