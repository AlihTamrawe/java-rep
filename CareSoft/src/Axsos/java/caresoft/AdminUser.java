package Axsos.java.caresoft;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin{
	  private Integer employeeID;
	    private String role;
	    private ArrayList<String> securityIncidents;
	    
	    // TO DO: Implement a constructor that takes an ID and a role
	    AdminUser(){
	    	this.employeeID=this.id;
	    	this.role="NONE";
	    	this.securityIncidents = new ArrayList<String>();

	    	
	    }
	    AdminUser(Integer id,String role){
	    	
	    	super(id);
	    	this.employeeID=super.id;
	    	this.role=role;
	    	this.securityIncidents = new ArrayList<String>();
	    	
	    }
	    // TO DO: Implement HIPAACompliantUser!
	    // TO DO: Implement HIPAACompliantAdmin!
	    
	    public void newIncident(String notes) {
	        String report = String.format(
	            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
	            new Date(15), this.id, notes
	        );
	        System.out.print(report);

	        this.securityIncidents.add(report);
	    }
	    public void authIncident() {
	        String report = String.format(
	            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", new Date(new Random().nextInt(10)+1), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
	        );
	        System.out.print(report);
	        this.securityIncidents.add(report);
	    }
		@Override
		public ArrayList<String> reportsecurityIncidents() {
			
			return this.securityIncidents;
		}
		@Override
		public boolean assignPin(int pin) {
			if(this.pin==pin)
			{
				this.authIncident();
				return true;
			}
			else
				return false;
		}
		@Override
		public boolean accessAuthorized(Integer confirmedAuthID) {
			if(this.pin == confirmedAuthID) {
				this.authIncident();

				return true;
			}
			else {
				this.newIncident(confirmedAuthID.toString());
				return false;
			}
		}
		
		
		public Integer getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(Integer employeeID) {
			this.employeeID = employeeID;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public ArrayList<String> getSecurityIncidents() {
			
			return this.securityIncidents;
		}
		
		public void setSecurityIncidents(String securityIncidents) {
			this.securityIncidents.add(securityIncidents);
		}

}
