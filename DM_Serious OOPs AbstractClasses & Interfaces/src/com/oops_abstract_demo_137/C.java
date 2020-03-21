package com.oops_abstract_demo_137;

/**
 * @author ABC Inc.
 */
public interface C extends A {
   void foobar();
   default void go() {
      System.out.println("C: go");
   }
}