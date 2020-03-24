package service;

public class PersonalityCalculator{
	int A,B,X;
	int arr[]=new int[20];
	public String findYourBrainType(String options) {
		findAnswers(options);
		A=arr[0]+arr[1]+arr[2]+arr[4]+arr[7]+arr[9]+arr[10]+arr[11]+arr[13]+arr[17]+arr[19];
		B=arr[3] +arr[5]+arr[6] + arr[8] + arr[12] +arr[14] + arr[15] +arr[16]+ arr[18];
		X=66-A+B;
		if((X>=20 && X<=55))
			return "leftbrained";
		if(X>=56 && X<=64)
	    	  return "noclearpreference";
		if((X>=65 && X<=100))
			return "rightbrained";
		return "";
	}
	//1,2,3,2,1,4,2,2,2,2,2,4,3,2,3,4,2,3,2,4  //a=26 //b=24  
	//0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9
	int[] findAnswers(String options) {
		int initial=0;
		for(int index=0;index<options.length();index+=2) {
			arr[initial]=Character.getNumericValue(options.charAt(index));
			initial++;
		}
		return arr;
	}
} 
