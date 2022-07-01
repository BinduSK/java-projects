package com.ibmc.Lamda;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello World"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
