/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 09/29/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Adonis Lizama
*/
import java.util.Scanner;

// Patient info class
public class Patient {
	String firstName, middleName, lastName, streetAddress, city, state, zipcode, phoneNumber, emergencyContactName, emergencyContactPhone;
	
	public Patient(){
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipcode = "";
		phoneNumber = "";
		emergencyContactName = "";
		emergencyContactPhone = "";
	}
	
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		
	}
	
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipcode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhone = emergencyContactPhone;
		
		
	}
	
	
	// --- GETTERS ---//
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getMiddleName(){
		return middleName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getStreetAddress(){
		return firstName;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public String getZipcode(){
		return zipcode;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getEmergencyContactName(){
		return emergencyContactName;
	}
	
	public String getEmergencyContactPhone(){
		return emergencyContactPhone;
	}
	
	
	// --- SETTERS ---- //
	
	public void setFirstName(String firstName){
	    this.firstName = firstName;
	}

	public void setMiddleName(String middleName){
	    this.middleName = middleName;
	}

	public void setLastName(String lastName){
	    this.lastName = lastName;
	}

	public void setStreetAddress(String streetAddress){
	    this.streetAddress = streetAddress;
	}

	public void setCity(String city){
	    this.city = city;
	}

	public void setState(String state){
	    this.state = state;
	}

	public void setZipcode(String zipcode){
	    this.zipcode = zipcode;
	}

	public void setPhoneNumber(String phoneNumber){
	    this.phoneNumber = phoneNumber;
	}

	public void setEmergencyContactName(String emergencyContactName){
	    this.emergencyContactName = emergencyContactName;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone){
	    this.emergencyContactPhone = emergencyContactPhone;
	}

	
	
	// Final stuff & Outputting
	
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipcode;
	}
	
	public String buildEmergencyContact() {
		return emergencyContactName + ": " + emergencyContactPhone;
	}
	
	public String toString() {
		return "\nPatient info: " +
				"\n\tPatient Name: " + buildFullName() + "\n" + 
				"\tAddress: " + buildAddress() + "\n" + 
				"\tPhone: " +  phoneNumber + "\n" + 
				"\tEmergency Contact: " + buildEmergencyContact() + "\n\n";
	}	
}








