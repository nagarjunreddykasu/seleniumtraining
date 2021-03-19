package wrapperclasses;

import java.util.ArrayList;

public class WrapperClassesDemo {
	
	
	public static void main(String[] args) {
		//primitive date type
		int a=100;
		
		Integer i=Integer.valueOf(a); //coverting int to Integer explicitly
		
		
		Integer j=a;  //Auto boxing Integer.valueOf(a)
		
		System.out.println(a+"\t"+i+"\t"+j);
		
		
		//Unboxing: The 
		
		//ArrayList<Integer> al=new ArrayList<>();
		
		
	}

}


/*

Primitive Datatypes -> Wrapper classes

byte				-> Byte
short				-> Short
char  				-> Character
int					-> Integer
long				-> Long
float				-> Float
double				-> Double
boolean				-> Boolean


Auto Boxing:
The automatic conversion of primitive data type into its corresponding wrapper class object is called Auto Boxing.
ex: byte to Byte
int to Integer

Unboxing:
The automatic conversion of Wrapper class object into its corresponding primitive data type is called UnBoxing.
ex: Byte to byte
Integer to int




ArrayList<Integer>







*/