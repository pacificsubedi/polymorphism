package polymorphism;

public class Shape {

    public  float area(float r){
        return 3.14f*r*r;

    }
    public float area(int l,int b){
        return l*b;
    }
}
