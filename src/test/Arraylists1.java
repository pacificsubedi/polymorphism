package test;

import java.util.ArrayList;

public class Arraylists1 {
    public static void main(String[] args) {


        ArrayList<Student> lstStudent = new ArrayList<>();
        Student s1 = new Student("superman",20,"Birlin");
        Student s2 = new Student("batman",25,"Newyork");
        Student s3 = new Student("aquaman",30,"Atlantic");


        lstStudent.add(s1);
        lstStudent.add(s2);
        lstStudent.add(s3);


        for(Student s : lstStudent){
            System.out.println(s1.getName()+ ' ' + s1.getAddress());

            int sum = 0;
            for (Student student :lstStudent){
                sum += s.getAge();
        }
            System.out.println("Sum of ages:"+sum);

        }

    }

}
