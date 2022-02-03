package br.com.aevc.user.domain;

import java.time.LocalDate;

public class PersonListingDTO {

	private String name;
	private String document;
	private LocalDate birthDate;

	public PersonListingDTO(String name, String document, LocalDate birthDate) {
		super();
		this.name = name;
		this.document = document;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
