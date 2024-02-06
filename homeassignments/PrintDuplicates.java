package homeassignments;
import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {2,5,7,5,9,2,3,7};
		Arrays.sort(num);
		System.out.println("Progrm to Print Integer Duplicate Values using single for loop:\n");
		for (int i=0;i<num.length-1;i++)
		{
		if(num[i]==num[i+1])
		{
		
			System.out.println("\t"+num[i+1]);	
			}
			
		}
		
		
		
		
		

	}

}
