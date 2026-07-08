package com.nit.task02;

import java.util.Set;

public class TrainingInstitute {
	private String instituteName;
	private Set<String> technologies;

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public Set<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Set<String> technologies) {
		this.technologies = technologies;
	}

	@Override
	public String toString() {
		return "TrainingInstitute [instituteName=" + instituteName + ", technologies=" + technologies + "]";
	}
	
	
}
