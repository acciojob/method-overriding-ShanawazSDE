package com.driver;

import java.io.*;
import java.lang.*;
import java.util.*;

class A
{

  public String meth ()
  {
    return "Invoking method from class A";
  }
  
}
class B extends A{
    
    public String meth ()
  {
    return "Method is overridden in Extendend class B";
  }
    
   
}


public class Main
{
  public static void main (String[]args)
  {
    System.out.println (new B().meth ());
  }
}
