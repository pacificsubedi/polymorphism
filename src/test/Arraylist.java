package test;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> studentlist = new ArrayList<>();
        studentlist.add("Prashant");
        studentlist.add("Prabesh");
        studentlist.add("Praful");
        for (int i =0; i<studentlist.size();i++){
            System.out.println(studentlist.get(i));
        }

        }

    }

