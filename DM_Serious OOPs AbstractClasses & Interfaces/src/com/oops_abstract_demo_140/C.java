package com.oops_abstract_demo_140;

/**
 * @author ABC Inc.
 */
public interface C extends A {
   void foobar();
   default void go() {
      System.out.println("C: go");
	  staticMethod();
   }
   static void staticMethod() {
      System.out.println("C: staticMethod");
   }
}