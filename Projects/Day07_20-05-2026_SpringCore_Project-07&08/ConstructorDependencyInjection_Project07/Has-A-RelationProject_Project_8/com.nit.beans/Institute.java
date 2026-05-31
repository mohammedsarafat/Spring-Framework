package com.nit.beans;

import java.util.List;

public class Institute {

    private int instituteId;
    private String instituteName;

    private List<Student> students;

    // Setter Methods

    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", students=" + students
				+ "]";
	}

   

	
	  public void display() {
	  
	  System.out.println( "Institute Id : " + instituteId);
	  
	  System.out.println( "Institute Name : " + instituteName);
	  
	  System.out.println( "============================");
	  
	  for(Student s : students){
	  

	  s.display();
	  
	  } }
	 
    
    
}
