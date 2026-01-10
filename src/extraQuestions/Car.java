package extraQuestions;
//An abstract class called Car that contains two variables isSedan and seats,along with two implemented methods getIsSedan( ) and getSeats( ),
//and one abstract method getMileage( ) You need to create three child classes -Wagoner,HondaCity,and InnovaCrysta- that extended the Car class and
//provide their own implementation of the getMileage( ) method.
abstract class Car {
private boolean isSedan = true;
private int seats = 5;
boolean getIsSedan() {
	return isSedan;
}
int getSeats() {
	return seats;
}
void setIsSedan(boolean s) {
	isSedan =s;
}
void setSeats(int seats) {
	this.seats = seats;
}
abstract void getMileage();
}
