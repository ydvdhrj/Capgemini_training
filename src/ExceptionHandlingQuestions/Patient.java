package ExceptionHandlingQuestions;

//7. A doctor accesses patient records.
//Errors occur when:
//•	Patient ID does not exist
//•	Database connection fails


public class Patient {
static boolean database;
int patientID;
public void records(int patientID) throws DatabaseConnectionFailsException, PatientIDException{
	if(patientID != this.patientID){
		throw new PatientIDException("invalid patient id exception...");
	}
	if(!database) {
		throw new DatabaseConnectionFailsException("database connection fails exception..");
	}
	System.out.println("patient record is available.");
			
}

public static void main(String[] args) {
	Patient p  = new Patient();
	database = false;
	p.patientID = 123456;
	try {
		p.records(123456);
	}
	catch(DatabaseConnectionFailsException e) {
		System.out.println(e.getMessage());
	}
	catch(PatientIDException e) {
		System.out.println(e.getMessage());
	}
}
}
