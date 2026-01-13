package exceptionHandling;

public class CheckAge {
public static void main(String[] args) {
	try {
		
		checkAge(15);
	}
	catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
	}
}

// to check person is eligible to vote or not
public static void checkAge(int age) throws InvalidAgeException{
	if(age>18) {
		System.out.println("Eligible to vote..");
	}
	else {
		throw new InvalidAgeException("Min age to vote is 18");
//		System.out.println("bachaa kahi kaa..");
	}
}
}
