package abstraction;

public  class Triangle extends Shape{
    public float breadth;
    public float height;
    public Triangle(float breadth,float height){
        this.breadth = breadth;
        this.height = height;

    }

    @Override
    protected float area() {
        return  0.5f*breadth*height;
    }
}
