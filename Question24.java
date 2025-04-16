abstract class Bird{
    abstract void fly();
    abstract void  makeSound();
}
class Eagle extends  Bird{
    void fly(){
        System.out.println("Eagle Flies Swiftly ");
    }
    void makeSound(){
        System.out.println("Eagle makes some sound ");
    }
}
class Hawk extends  Bird{
    void fly(){
        System.out.println("HAwk flies Harshly");
    }
    void makeSound(){
        System.out.println("Hawk also makes some sound");
    }
}
public class Question24{
    public static void main(String[] args) {
        System.out.println("Name: Sumanth D  , Roll.no : 24325");
        Eagle e1 = new e1();
        e1.fly();
        e1.makeSound();
        Hawk h1 = new Hawk();
        h1.fly();
        h1.makeSound();
    }

}