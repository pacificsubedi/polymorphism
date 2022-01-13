package abstraction;

public class Circle extends Shape{
    public float radius;
    private float pi = 3.14f;
    public Circle(float radius){

        this.radius = radius;
    }
    @Override
    protected float area() {
        return pi*radius*radius;
    }
}
