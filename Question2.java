
class MyClass {

    static int count = 0;
    static double PI = 3.14159;

    MyClass() {
        count = count + 1;
    }
}

public class Question2 {

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        MyClass obj4 = new MyClass();
        System.out.println("Name : Sumanth Deshpande");
        System.out.println("Roll.No : AV.SC.U4CSE24325");
        System.out.println("Number of OBjects created is : " + MyClass.count);
        System.out.println("Value of PI : " + MyClass.PI);
        System.out.println("Number of OBjects created is : " + MyClass.count);
        System.out.println("Value of PI : " + MyClass.PI);
    }
}
