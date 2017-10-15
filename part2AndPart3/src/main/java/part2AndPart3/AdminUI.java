package part2AndPart3;

import java.util.Scanner;

public class AdminUI {
	
	static Library lib = new Library();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nEnter 0 Exit "
					+"\nEnter 1 add book to Library"
					+"\nEnter 2 for see the availble books"
					+"\nEnter 3 to rent a Book"
					+"\nEnter 4 return a Book");

			int answer = in.nextInt();
			
			switch (answer) {
			
			case 0:
				
				running=false;
				break;

			case 1:
				addBook();
				
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			case 3:
				 rent();
				break;
			case 4:
				returnTheBook();
				
			}
			
		}
		System.exit(0);
		

	}
	private static void addBook() {
		
		 String Title;
		 String Author;
		 double price;
		 double rent;
		 int bookQuantity; 

		System.out.println("\nEnter Title: ");
		Title = in.next();

		System.out.println("\nEnter Author: ");
		Author = in.next();

		System.out.println("\nEnter Price: ");
		price = in.nextInt();

		System.out.println("\nEnter Rent Amount: ");
		rent = in.nextDouble();
		System.out.println("\nEnter No of Copies Available: ");
		bookQuantity=in.nextInt();

	//	Books b = new Books(Title, Author, price, rent);
		Books b1= new Books();
		Books b2=new Books();
		b1.setTitle(Title);
		b1.setAuthor(Author);
		b1.setPrice(price);
		b1.setRent(rent);
		b1.setBookQuantity(bookQuantity);
		b2.setTitle(Title);
		b2.setBookQuantity(bookQuantity);
		
		lib.addBooks(b1,b2);
		
	}
	
	private static void rent() {
		
		 String Title;
		 int Days;
		 double value;
		 
		System.out.println("\nEnter Title Name : ");
		Title = in.next();
		System.out.println("\nEnter No of Days required : ");
		
		Days=in.nextInt();
		
		lib.getInitialQuantity(Title);
		value=lib.rentCalculation(Title,Days);
		if(value!=0){
		System.out.println("You Book Details"+"\n Title : "+Title+"\n Day Requested : "+Days+"\nRent Amount : "+value);
		}else
		{
			System.out.println("Sorry All Copies are Rented out!!! Please try again Later.Thanks! ");
			
		}
		
	}
	private static void returnTheBook() {
		
		 String Title;
		 int status;
		 
		System.out.println("\nEnter Title Name : ");
		Title = in.next();
		
		lib.getInitialQuantity(Title);
		status=lib.bookReturn(Title);
		
		if(status!=0){
			
	   System.out.println("You Book returned Succesfully! Please Visit  Again ");
		}else{
			
			System.out.println(" We are Sorry! Could not find the details in our Inventory");
			
		}
					
	}
	

}
