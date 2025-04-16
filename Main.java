
class VisibilityExample {

    public int publicVariable = 10;
    private int privateVariable = 20;

    public void publicMethod() {
        System.out.println("This is a Public Method ");
    }

    private void privateMethod() {
        System.out.println("This is a Private Method ");
    }
}

class Main {

    public static void main(String[] args) {
        VisibilityExample v = new VisibilityExample();
        System.out.println("Name : Sumanth D , Roll.no : 24325 ");
        System.out.println(v.publicVariable);
        v.publicMethod();

    }
}
