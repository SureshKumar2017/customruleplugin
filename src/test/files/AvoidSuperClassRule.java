/*
 * Creation : 20 avr. 2015
 */
package org.sonar.samples.java;

import org.slf4j.Logger;
import org.springframework.web.client.RestTemplate;

/**
 * A class with extends another class outside the JVM but in classpath
 */
public class MyClass extends Logger { // Noncompliant {{The usage of super class org.slf4j.Logger is forbidden}}

 private RestTemplate test;
  protected MyClass(String name) {
    super(name);
  }

  /**
   * No issue when there is no super class
   */
  private static class NestedClassWithoutSuperClass { } // Compliant

}

class MyOtherClass extends MyClass { } // Compliant
