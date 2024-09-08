package oops.This;

public class returnthis {
    returnthis ret(){
      return this; //this return the current class object reference in memory
  }
  public static void main(String[] args) {
      System.out.println(new returnthis().ret());
  }
}
