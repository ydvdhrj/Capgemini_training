package ExceptionHandlingQuestions;

//4.	Book flight tickets.
//Throw SeatUnavailableException if requested seats > available seats.
//

public class Flight {
static int availableSeats = 10;
public static void main(String[] args) {
	try {
		bookTicket(19);
	}
	catch(SeatUnavailableException e) {
		System.out.println(e.getMessage());
	}
}
public static void bookTicket(int seats) throws SeatUnavailableException{
	if(seats <= availableSeats) {
		System.out.println("your seats are booked.");
	}
	else {
		throw new SeatUnavailableException("requested number of seats are not available..");
	}
}
}
