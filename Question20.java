
interface Shape {

    public void getPerimeter();
}

class Rectangle implements Shape {

    int a;
    int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void getPerimeter() {
        System.out.println(2 * (a + b));
    }
}

class Triangle implements Shape {

    int a;
    int b;

    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void getPerimeter() {
        System.out.println((a * b) / 2);
    }
}

class Circle implements Shape {

    int r;

    Circle(int r) {
        this.r = r;
    }

    void getPerimeter() {
        System.out.println(2 * (Math.PI * r));
    }
}

public class Question20 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        Triangle t = new Triangle(4, 6);
        Circle c = new Circle(5);
        System.out.println("Name: Sumanth D  , Roll.no : 24325");
        r.getPerimeter();
        t.getPerimeter();
        c.getPerimeter();
    }
}
