package ram.practice.core;

import java.util.Arrays;

public class MyArrayList {

	
	Object[] myArray;
	int actSize =0;
	
	public MyArrayList() {
		// TODO Auto-generated constructor stub
		myArray = new Object[10];
	}
	
	
	public Object get(int index){
		if(index < actSize){
			return myArray[index];
		}else{
		throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	
	public void add(Object O){
		if(myArray.length - actSize <= 5){
			myArray = Arrays.copyOf(myArray, myArray.length*2);
		}
		myArray[actSize++] = O;
	}
	
	
	public Object remove(int index){
		Object old = myArray[index];
		if( index > actSize ) {
		       while( index < myArray.length){
		    	   myArray[index] = myArray[index+1];
		    	   myArray[index+1] = null;
		    	   index++;
		       }
		       actSize --;
		       return old;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

}
