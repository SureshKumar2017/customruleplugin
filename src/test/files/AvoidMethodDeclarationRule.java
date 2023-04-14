/**
 *This file is the sample code against we run our unit test.
 *It is placed src/test/files in order to not be part of the maven compilation.
 **/
class AvoidMethodDeclarationCheck {

  int aField;

  private void aMethod() { // Noncompliant {{Avoid declaring private methods (don't ask why)}}

  }

  private void bMethod() { // Noncompliant {{Avoid declaring private methods (don't ask why)}}

  }
}
