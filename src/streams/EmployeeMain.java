package streams;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
public static void main(String[] args) {
	List<Employee> l = Arrays.asList(new Employee(1,"dheeraj",30000),new Employee(2,"santosh",200000),new Employee(3,"raj",25000));
	l.stream()
		.filter(x->x.getSal()>25000)
		.map(x->x.getName())
		.forEach(System.out::println);
}
}
