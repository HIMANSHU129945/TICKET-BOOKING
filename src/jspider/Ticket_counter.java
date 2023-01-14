package jspider;

public interface Ticket_counter {
	void bookTicket(int n);
	void cancleTicket(int n);
	int avilableTicket();
	String displayErrorMessage();

}
