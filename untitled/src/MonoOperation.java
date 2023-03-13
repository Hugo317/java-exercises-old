@FunctionalInterface

public interface MonoOperation<T> {

    T execute(T operand);

}
