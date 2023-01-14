package jspider;

import java.util.Scanner;

public class Main_class {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Ticket_counter_Impl t=new Ticket_counter_Impl(100);
		
		while(true) {
			
			System.out.println("1:Book Ticket\n2:Cancle Ticket\n3:Avilable Ticket\n4:Exit");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter No of Ticket To Be Booked");
				int bookTicket=sc.nextInt();
				t.bookTicket(bookTicket);
				break;
			}
			case 2:
			{
				System.out.println("Enter No Of Ticket To Be Canclled");
				int cancleTicket=sc.nextInt();
				t.cancleTicket(cancleTicket);
				break;
			}
			case 3:
			{
				System.out.println(t.avilableTicket());
				break;
			}
			case 4:
			{
				System.out.println(t.displayErrorMessage());
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Select Valid Option");
			}
			
			}
		}
	}

}
