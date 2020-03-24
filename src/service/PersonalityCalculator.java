package service;

public class PersonalityCalculator{
	int A,B,X;
	int arr[]=new int[20];
	public String findYourBrainType(String options) {
		findAnswers(options);
		A=arr[0]+arr[1]+arr[2]+arr[4]+arr[7]+arr[9]+arr[10]+arr[11]+arr[13]+arr[17]+arr[19];
		B=arr[3] +arr[5]+arr[6] + arr[8] + arr[12] +arr[14] + arr[15] +arr[16]+ arr[18];
		X=66-(A+B);
		if(X>20 && X<55)
			return "Left-brained";
		else if(X>65 && X<100)
			return "Right-brained";
		else
			return "No clear preference";
	}
	
	
	int[] findAnswers(String options) {
		int initial=0;
		for(int index=0;index<options.length()-1;index+=2) {
			arr[initial]=Character.getNumericValue(options.charAt(index));
			initial++;
		}
		return arr;
	}
} 
