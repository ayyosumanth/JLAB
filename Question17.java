abstract class Animal{
    abstract  void sound();
}
class Lion extends Animal{
    void sound() {
        System.out.println("Lion Roars .. ");
    }
}
class Tiger extends Animal{
    void sound() {
        System.out.println("Tiger Roars .. ");
    }
}
public class Question17{
    public static void main(String[] args) {
        System.out.println("Sumanth Deshpande ");
        System.out.println("Roll NO - 24325");
        Lion l1 = new Lion();
        l1.sound();
        Tiger t1 = new Tiger();
        t1.sound();
    }
}