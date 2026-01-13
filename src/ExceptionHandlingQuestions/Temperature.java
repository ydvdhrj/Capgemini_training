package ExceptionHandlingQuestions;

//2.	Simulate a temperature sensor.
//If temperature < -50 or > 100, throw custom exception TemperatureOutOfRangeException.

public class Temperature {
public static void main(String[] args) {
	
	try{
		checkTemperature(120);
	}
	catch(TemperatureOutOfRangeException t) {
		System.out.println(t.getMessage());
	}
}
public static void checkTemperature(int temp) throws TemperatureOutOfRangeException{
	if(temp>=-50 && temp<=100) {
		System.out.println("temperature is safe to operate..");
	}
	else {
		throw new TemperatureOutOfRangeException("temperature is out of range exception..");
	}
}
}
