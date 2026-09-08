package org.academiadecodigo;

public class Machine<T> {

    public T perform(T op, MonoOperation<T> operation){
        return operation.execute(op);
    }

    public T perform(T op1, T op2, BiOperation<T> operation){
        return operation.execute(op1, op2);
    }


}
