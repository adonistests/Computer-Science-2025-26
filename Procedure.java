// Class procedure for information regarding the procedrue
class Procedure {
	// Variables
	String procedureName, procedureDate, practitionerName;
	float procedureCharges;
	
	public Procedure() {
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		procedureCharges = 0.0f;
	
	}
	
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	public Procedure(String procedureName, String procedureDate, String practitionerName, float procedureCharges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.procedureCharges = procedureCharges;
		
	}
	
	// --_ GETTERS ---//
	
	public String getProcedureName() {
		return procedureName;
	}
	
	public String getProcedureDate() {
		return procedureDate;
	}
	
	public String getPractitionerName() {
		return practitionerName;
	}
	
	public float getProcedureCharges() {
		return procedureCharges;
	}

	// SETTERS //
	
	
	public void setProcedureName() {
		this.procedureName = procedureName;
	}
	
	public void setProcedureDate() {
		this.procedureDate = procedureDate;
	}
	
	public void setPracitionerName() {
		this.practitionerName = practitionerName;
	}
	
	public void setProcedureCharges() {
		this.procedureCharges = procedureCharges;
	}
	
	public String toString() {
		return "\n\tProcedure Name: " + procedureName + "\n" + 
		"\tDate: " + procedureDate + "\n" + 
		"\tPractitioner: " + practitionerName + "\n" +
		"\tCharges: $" + procedureCharges + "\n";
	}
	
}