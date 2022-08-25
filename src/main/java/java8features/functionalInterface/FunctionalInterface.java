package java8features.functionalInterface;

public class FunctionalInterface implements Sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterface fie = new FunctionalInterface();
        fie.say("Hello there");
    }
}
