abstract  class Shape3D{
    abstract void CalculateVolume();
    abstract void CalculateSurfaceArea();
}
class sphere extends Shape3D{
    int r;
    sphere(int r){
        this.r = r;
    }
    void CalculateVolume() {
        System.out.println("Volume of Sphere is : " + (4*(Math.PI*r*r*r))/3);
    }
    void CalculateSurfaceArea() {
        System.out.println("Surface Area of Sphere is : " + (4*(Math.PI*r*r)));
    }
    
}
class Cube extends Shape3D{
    int a;
    Cube(int a){
        this.a = a;
    }
    void CalculateVolume() {
        System.out.println("Volume of Cube is : " + a*a*a);
    }
    void CalculateSurfaceArea() {
        System.out.println("Surface Area of Cube is : " + 6*(a*a) );
    }
}
public class  Question18
{   
    public static void main(String[] args) 
    {
        System.out.println("Sumanth Deshpande ");
        System.out.println("Roll NO - 24325");  
        Cube c1 = new Cube(6);
        sphere s1 = new sphere(5);
        c1.CalculateVolume();
        c1.CalculateSurfaceArea();
        s1.CalculateSurfaceArea();
        s1.CalculateVolume();
    }
}