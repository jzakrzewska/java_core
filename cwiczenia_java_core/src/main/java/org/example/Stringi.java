package org.example;

public class Stringi {


    String s1 = "welcome s1";
    String s2 = new String("welcome s2");

    public void printS1() {
        System.out.println(s1);
    }

    public void printS2() {
        System.out.println(s2);
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }
}
