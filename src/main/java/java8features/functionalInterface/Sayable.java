package java8features.functionalInterface;

/*Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
It is a new feature in Java, which helps to achieve functional programming approach.*/

@java.lang.FunctionalInterface
public interface Sayable {
    void say(String msg);   // abstract method
    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
