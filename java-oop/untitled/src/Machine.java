public class Machine<T> {
    public T performOperation(T t1, MonoOperation<T> operation){
        return operation.execute(t1);
    }
    public T performOperation(T t1, T t2, BiOperation<T> operation){
        return operation.execute(t1, t2);
    }
}
