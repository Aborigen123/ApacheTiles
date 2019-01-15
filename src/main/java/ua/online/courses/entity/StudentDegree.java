package ua.online.courses.entity;

public enum StudentDegree {
BACHELOR("BACHELOR"), MASTER("MASTER"), ASPIRANT("ASPIRANT");
	
	private String degree; //робимо стрічковий еквівалент щоб могли діставати як String

	private StudentDegree(String degree) {
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}



}
