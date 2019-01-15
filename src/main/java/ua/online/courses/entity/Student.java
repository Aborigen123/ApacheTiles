package ua.online.courses.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student extends BaseEntity {

	private String name;
	private String country;
	
	@Column(name="favorite_language")
	private String favoriteLanguage;
	
	@Column(name = "operating_system")
	private String[] operatingSystem;
	
	@Enumerated(EnumType.STRING)// якщо ненаписати EnumType.STRING то змінін в енамі будуть фомеруватися
	private StudentDegree degree;


	public Student(String name, String country, String favoriteLanguage, String[] operatingSystem,
			StudentDegree degree) {
		this.name = name;
		this.country = country;
		this.favoriteLanguage = favoriteLanguage;
		this.operatingSystem = operatingSystem;
		this.degree = degree;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public StudentDegree getDegree() {
		return degree;
	}

	public void setDegree(StudentDegree degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", country=" + country + ", favoriteLanguage=" + favoriteLanguage
				+ ", operatingSystem=" + Arrays.toString(operatingSystem) + ", degree=" + degree + ", getId()="
				+ getId() + "]";
	}

	
	
}
