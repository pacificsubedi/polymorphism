package abstraction;

public  class Rectangle  extends Shape{
    public float length;
    public float breadth;
    public Rectangle(float length,float breadth){
        this.breadth =breadth;
        this.length = length;
    }
    @Override
    protected float area() {
        return length*breadth ;
    }
}
