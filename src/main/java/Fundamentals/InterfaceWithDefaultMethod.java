package Fundamentals;

public interface InterfaceWithDefaultMethod {

void existingMethod();
default void newDefaultMethod(){
    System.out.println("new default method");
}
}
