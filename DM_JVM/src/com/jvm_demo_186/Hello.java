package com.jvm_demo_186;

public class Hello {
    int i = 3;
    public static void main(String[] args) {
        Object hello = new Hello();
        hello.toString();
    }

    public String toString() {    
	    System.out.println("Hello"); 
		return "hello";
    }
}