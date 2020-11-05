package sample2_16;

import java.lang.reflect.Array;

public class sample2_16 {

	public static void main(String[] args) 
	{
		int[]intArray = (int[])Array.newInstance(int.class, 3);
		
		Array.set(intArray,0,123);
		Array.set(intArray,1,456);
		Array.set(intArray,2,789);
		
		System.out.println("inArray[0]="+Array.getByte(intArray, 0));
		System.out.println("inArray[1]="+Array.getByte(intArray, 1));
		System.out.println("inArray[2]="+Array.getByte(intArray, 2));

	}

}
