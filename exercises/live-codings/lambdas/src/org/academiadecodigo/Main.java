package org.academiadecodigo;

public class Main {

    public static void main(String[] args) {

        Machine<Integer> numberMachine = new Machine<>();

        // OOP way
        Increment increment = new Increment();
        numberMachine.perform(5, increment);

        // anonymous class way
        numberMachine.perform(5, new MonoOperation<Integer>() {
            @Override
            public Integer execute(Integer operand) {
               return ++operand;
            }
        });

        // lambda, but saving in a variable first
        MonoOperation<Integer> increment2 = (operand) -> ++operand;
        numberMachine.perform(5, increment2);

        // passing a lambda directly!
        numberMachine.perform(5, (operand) -> ++operand);

    }
}
