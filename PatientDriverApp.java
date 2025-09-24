import java.util.Scanner;
//application, with main
class PatientDriverApp {
	
	public static void displayPatient(Patient patient) {
		System.out.print(patient);
		
	}
	
	public static void displayProcedure(Procedure procedure) {
		System.out.print(procedure);
		
	}
	
	
	public static float calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getProcedureCharges() + p2.getProcedureCharges() + p3.getProcedureCharges();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Patient Information
		Patient patient = new Patient();

		System.out.println("Enter patient's first name: ");
		String firstName = input.nextLine();
		patient.setFirstName(firstName);

		System.out.println("Enter patient's middle name: ");
		String middleName = input.nextLine();
		patient.setMiddleName(middleName);

		System.out.println("Enter patient's last name: ");
		String lastName = input.nextLine();
		patient.setLastName(lastName);

		System.out.println("Enter patient's street address: ");
		String address = input.nextLine();
		patient.setStreetAddress(address);

		System.out.println("Enter patient's city: ");
		String city = input.nextLine();
		patient.setCity(city);

		System.out.println("Enter patient's state: ");
		String state = input.nextLine();
		patient.setState(state);
	
			System.out.println("Enter patient's zipcode: ");
		String zipcode = input.nextLine();
		patient.setZipcode(zipcode);
		
		System.out.println("Enter patient's phone number: ");
		String phoneNumber = input.nextLine();
		patient.setPhoneNumber(phoneNumber);

		System.out.println("Enter patient's emergency contact's name: ");
		String contactName = input.nextLine();
		patient.setEmergencyContactName(contactName);

		System.out.println("Enter patient's emergency contact's phone number: ");
		String contactPhone = input.nextLine();
		patient.setEmergencyContactPhone(contactPhone);
		
		
		
		
		// First Procedure
		System.out.println("\n= FIRST PROCEDURE ===\n");
		
		System.out.println("Enter Procedure Name: ");
		String p1Name = input.nextLine();
		
		System.out.println("Enter Date (MM/DD/YYYY): ");
		String p1Date = input.nextLine();
		
		System.out.println("Enter doctor's name (ex. Dr. Smith): ");
		String doctor1 = input.nextLine();
		
		System.out.println("Enter charges (ex. $1234.00): ");
		float charges1 = input.nextFloat();
		input.nextLine();
		
		// Second Procedure
		System.out.println("\n= SECOND PROCEDURE ===\n");
		
		System.out.println("Enter Procedure Name: ");
		String p2Name = input.nextLine();
		
		System.out.println("Enter Date (MM/DD/YYYY): ");
		String p2Date = input.nextLine();
		
		System.out.println("Enter doctor's name (ex. Dr. Smith): ");
		String doctor2 = input.nextLine();
		
		System.out.println("Enter charges (ex. $1234.00): ");
		float charges2 = input.nextFloat();
		input.nextLine();
		
		// Third Procedure
		System.out.println("\n= THIRD PROCEDURE ===\n");
		
		System.out.println("Enter Procedure Name: ");
		String p3Name = input.nextLine();
		
		System.out.println("Enter Date (MM/DD/YYYY): ");
		String p3Date = input.nextLine();
		
		System.out.println("Enter doctor's name (ex. Dr. Smith): ");
		String doctor3 = input.nextLine();
		
		System.out.println("Enter charges (ex. $1234.00): ");
		float charges3 = input.nextFloat();
		input.close();
		
		Procedure p1 = new Procedure(p1Name, p1Date, doctor1, charges1);
		Procedure p2 = new Procedure(p2Name, p2Date, doctor2, charges2);
		Procedure p3 = new Procedure(p3Name, p3Date, doctor3, charges3);
		
		// displaying every thing
		displayPatient(patient);
		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);
        
		
		float totalCharges = calculateTotalCharges(p1, p2, p3);
		System.out.println("\nTotal Charges: $" + totalCharges);
		
		System.out.println("\nStudent Name: Adonis Lizama"
				+ "\nMC#: M21192287" + "\nDue Date: 09/29/2025");
	}
	
	
	
	
	
	
	
	
}