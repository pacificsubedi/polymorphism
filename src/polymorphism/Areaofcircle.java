package polymorphism;

public class Areaofcircle {

    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(2.2f));
    }
    public static float area(int r){
        float pie =3.14f;
        return r*r*pie;

    }
    public static float area(float r){
        float pie=3.14f;
        return r*r*pie;
    }
}
