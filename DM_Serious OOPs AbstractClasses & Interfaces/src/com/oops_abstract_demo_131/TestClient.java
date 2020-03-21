package com.oops_abstract_demo_131;

public class TestClient {
	   public static int getVal() {
	       return 42;
	   }
	 
	   public static void main(String[] args) {
	       C c = new X();
		   c.foo();
		   c.bar();
		   c.foobar();
	   }
	}