package jspider;

public class Ticket_counter_Impl implements Ticket_counter {
	
	private int totalTicket;
	
	public Ticket_counter_Impl(int totalTicket) {
		this.totalTicket=totalTicket;
	}
	
	@Override
	public void bookTicket(int book_ticket) {
		System.out.println("No.of Ticket To Be Booked "+book_ticket);
		totalTicket=totalTicket-book_ticket;
		System.out.println(book_ticket+" Ticket Booked");
		
	}
	
	public void cancleTicket(int cancle_ticket) {
		System.out.println("No. Of Ticket To Be Canclled "+cancle_ticket);
		System.out.println(cancle_ticket+" Ticket Canclled");
		totalTicket=totalTicket+cancle_ticket;
	}

	@Override
	public int avilableTicket() {
		return totalTicket;
	}
	
	@Override
	public String displayErrorMessage() {
		return "Thank You!";
	}
}
