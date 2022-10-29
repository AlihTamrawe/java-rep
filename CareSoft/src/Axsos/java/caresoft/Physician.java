package Axsos.java.caresoft;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser {
	 private ArrayList<String> patientNotes;
		
	    // TO DO: Constructor that takes an ID
	 public Physician(){
		 super();
		 
	 }
	 public Physician(Integer id) {
		 super(id);
		 
		 
	 }
	 
	    // TO DO: Implement HIPAACompliantUser!
		
	    public void getPatientNotes() {
	    	for (String x : patientNotes) {
	    		System.out.print(x);
	    	}
	    		
	}
	public void setPatientNotes(String patientNotes) {
		this.patientNotes.add(patientNotes);
	}
		public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }

		@Override
		public boolean assignPin(int pin) {
			if(this.pin==pin)
				return true;
			else
				return false;
		}

		@Override
		public boolean accessAuthorized(Integer confirmedAuthID) {
			if(this.pin==confirmedAuthID)
				return true;
			else
				return false;
		}
		

}
