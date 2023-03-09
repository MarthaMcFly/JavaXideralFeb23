package com.curso.v1;

//Java Program to Demonstrate Different Return Types
//if Return Type in Overridden method is Sub-type

//Class 1
class A {
}

//Class 2
class B extends A {
}

//Class 3
//Helper class (Base class)
class Base {

	// Method of this class of class1 return type
	A fun()
	{
		// Display message only
		System.out.println("Base fun()");

		return new A();
	}
}

//Class 4
//Helper class extending above class
class Derived extends Base {

	// Method of this class of class1 return type
	@Override
	B fun()
	{
		// Display message only
		System.out.println("Derived fun()");

		return new B();
	}
}

//Class 5
//Main class
public class GFG {

	// Main driver method
	public static void main(String args[])
	{

		// Creating object of class3 type
		Base base = new Base();

		// Calling method fun() over this object
		// inside main() method
		A a = base.fun();  //Base fun()

		// Creating object of class4 type
		Base derived = new Derived();

		// Again calling method fun() over this object
		// inside main() method
		A aa = derived.fun(); //"Derived fun()"
		
		if (aa instanceof A) {
			System.out.println("Soy un A");
		}
		
		if (aa instanceof B) {
			System.out.println("Soy un B");
		}
		
		System.out.println(aa.getClass().getSimpleName());
	}
}
