package krunalparmar_sec402_ex01;

import java.util.Scanner;

public class SingerTest {

	public static void main(String[] args) 
	{
//		Singer singer1 = new Singer();
//		
//		// the default values of the instance variables of object singer1
//		System.out.println("Default values of the instance variables of object singer1:");
//		System.out.printf("Singer's Id: %d", singer1.getSingerId());
//		System.out.printf("\nSinger's Name: %d", singer1.getSingerName());
//		System.out.printf("\nSinger's Address: %d", singer1.getSingerAddress());
//		System.out.printf("\nSinger's Date Of Birth: %d", singer1.getSingerDateOfBirth());
//		System.out.printf("\nSinger's Number Of Published Albums : %d%n%n", singer1.getSingerNumberOfAlbumsPublished());
//		
//		// several overloaded constructors that would allow to construct Singer object 
//		// 1 argument, 2arguments, 3 arguments, 4 arguments, and 5 arguments
//		
//		System.out.println("Overloaded constructor with 1 argument");
//		Singer singer2 = new Singer(1);
//		System.out.printf("Singer's Id: %d%n%n", singer2.getSingerId());
//		
//		System.out.println("Overloaded constructor with 2 arguments");
//		Singer singer3 = new Singer(2, "Justin Bieber");
//		System.out.printf("Singer's Id: %d%n", singer3.getSingerId());
//		System.out.printf("Singer's Name: %s%n%n", singer3.getSingerName());
//		
//		System.out.println("Overloaded constructor with 3 arguments");
//		Singer singer4 = new Singer(3, "Sonu Nigam", "India");
//		System.out.printf("Singer's Id: %d%n", singer4.getSingerId());
//		System.out.printf("Singer's Name: %s%n", singer4.getSingerName());
//		System.out.printf("Singer's Address: %s%n%n", singer4.getSingerAddress());
//		
//		System.out.println("Overloaded constructor with 4 arguments");
//		Singer singer5 = new Singer(4, "Taylor Swift", "USA", "13 Decmber 1989");
//		System.out.printf("Singer's Id: %d%n", singer5.getSingerId());
//		System.out.printf("Singer's Name: %s%n", singer5.getSingerName());
//		System.out.printf("Singer's Address: %s%n", singer5.getSingerAddress());
//		System.out.printf("Singer's Date Of Birth: %s%n%n", singer5.getSingerDateOfBirth());
//		
//		System.out.println("Overloaded constructor with 5 arguments");
//		Singer singer6 = new Singer(5, "Drake", "Canada", "24 October 1986", 50);
//		System.out.printf("Singer's Id: %d%n", singer6.getSingerId());
//		System.out.printf("Singer's Name: %s%n", singer6.getSingerName());
//		System.out.printf("Singer's Address: %s%n", singer6.getSingerAddress());
//		System.out.printf("Singer's Date Of Birth: %s%n", singer6.getSingerDateOfBirth());
//		System.out.printf("Singer's Number Of Published Albums: %d%n%n", singer6.getSingerNumberOfAlbumsPublished());
		
		
		// Scanner object to obtain input from the command window
	    Scanner input = new Scanner(System.in);
	    
	    Singer singer7 = new Singer();
	    
	    // setters that would set the values of each instance variables individually
	    // also displaying those values
	    System.out.println("Please enter each value individually of instance variables for singer: ");
	    System.out.println("Please enter the Singer's Id:");
	    int theId = input.nextInt();
	    singer7.setSingerId(theId); 
	    System.out.printf("Singer's Id is :%d%n%n", singer7.getSingerId());
	    
	    System.out.println("Please enter the Singer's Name:");
	    String theName = input.nextLine();
	    singer7.setSingerName(theName);
	    System.out.printf("Singer's Name is : %s%n%n", singer7.getSingerName());
	    
	    System.out.println("Please enter the Singer's Address:");
	    String theAddress = input.nextLine();
	    singer7.setSingerAddress(theAddress);
	    System.out.printf("Singer's Address is : %s%n%n", singer7.getSingerAddress()); 
	    
	    System.out.println("Please enter the Singer's Date Of Birth:");
	    String theDOB = input.nextLine();
	    singer7.setSingerDateOfBirth(theDOB);
	    System.out.printf("Singer's Date Of Birth in is :%s%n%n", singer7.getSingerDateOfBirth());
	    
	    System.out.println("Please enter the Singer's Number Of Published Albums:"); 
	    int theNumberOfPublishedAlbums = input.nextInt(); 
	    singer7.setSingerNumberOfAlbumsPublished(theNumberOfPublishedAlbums); 
	    System.out.printf("Singer's Id is :%s%n%n", singer7.getSingerNumberOfAlbumsPublished()); 
	    
	    
	    // set all the values of the instance variables at once by one setter
	    System.out.println("Please enter all values  of instance variables for singer: ");
	    System.out.println("Please enter the Singer's Id:"); 
	    int id = input.nextInt(); 
	    System.out.println("Please enter the Singer's Name:");
	    String name = input.next();
	    System.out.println("Please enter the Singer's Address:");
	    String add = input.next();
	    System.out.println("Please enter the Singer's Date Of Birth:");
	    String dob = input.next();
	    System.out.println("Please enter the Singer's Number Of Published Albums:");
	    int no = input.nextInt();
	    singer7.setSinger(id, name, add, dob, no); 
	    System.out.printf("Singer's Id:%d%nSinger's Name:%s%nSinger's Address:%s%nSinger's Date Of Birth:%s%n"
	    		+ "Singer's Number Of Published Albums:%s%n", 
	    		singer7.getSingerId(), 
	    		singer7.getSingerName(), 
	    		singer7.getSingerAddress(), 
	    		singer7.getSingerId(), 
	    		singer7.getSingerDateOfBirth(),
	    		singer7.getSingerNumberOfAlbumsPublished()); 
	}

}
