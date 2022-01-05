package polymorphism;

public class Arithmetic {

    public static void main(String[] args) {


        System.out.println(add(2,3));
        System.out.println(add(2.6f,3));
        System.out.println(add(2,3.4f));
        System.out.println(add(2.6f,3.4f));
    }
    public static int add(int f,int s){
        return f+s;
    }
    public static float add(float f,int s){
        return f+s;
    }
    public static float add(int f,float s){
        return f+s;
    }
    public static float add(float f,float s){
        return f+s;
    }

}
