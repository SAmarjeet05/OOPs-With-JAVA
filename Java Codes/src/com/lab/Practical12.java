package com.lab;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)

@interface TypeAnnoDemo{}

public class Practical12 {

 public static void main(String[] args) {
     @TypeAnnoDemo String string = "I am annotated with a type annotation";
     System.out.println(string);
     abc();
 }
 static @TypeAnnoDemo int abc() {
   
     System.out.println("This function's  return type is annotated");
   
     return 0;
 }
}


/*Output----
I am annotated with a type annotation
This function's  return type is annotated
*/
