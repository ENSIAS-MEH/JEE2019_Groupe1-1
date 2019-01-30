package com.iliass.models;

public class MyClass {
	int attribut ;
	 public void method1() {    
	        attribut =1 ;
	    }

	    public void method2() {
	        attribut =2 ;
	    }

	    public void method3() {
	       attribut = 3 ;
	    }

		public int getAttribut() {
			return attribut;
		}

		public void setAttribut(int attribut) {
			this.attribut = attribut;
		}

		@Override
		public String toString() {
			return "MyClass [attribut=" + attribut + "]";
		}
	    
	    
}
