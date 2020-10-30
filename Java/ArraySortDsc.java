import java.util.Scanner;

public class ArraySortDsc
{
    public static void main(String[] args) 
    {
    	int arayLength, temp;
    	
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array of elements you want in the array: ");
        arayLength = scan.nextInt();
    
        int aray[] = new int[arayLength];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arayLength; i++) 
        {
            aray[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < arayLength; i++) 
        {
            for (int j = i + 1; j < arayLength; j++) { 
                
	        if (aray[i] < aray[j]) 
                  {
                     temp = aray[i];
                     aray[i] = aray[j];
                     aray[j] = temp;
                 }
            }
        }
        System.out.print("Array Elements in Descending Order: ");
        for (int i = 0; i < arayLength-1 ; i++) 
        {
            System.out.print(aray[i] + ", ");
        }
        System.out.print(aray[arayLength - 1]);
    }
}