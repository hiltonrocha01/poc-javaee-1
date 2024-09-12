package br.com.aevc.user.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.aevc.login.domain.entity.Profile;

@Entity
@Table(name = "User_")
//USER É UMA PALAVRA RESERVADA PARA O SQL
//SELECT FROM WHERE 
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	//VARCHAR
	//NÃO NULA
	private String login;
	@Column(nullable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "profileId", referencedColumnName = "id")
	private Profile profile;
	// N -> 1
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "personId", referencedColumnName = "id")
	private Person person;
	
	public User() {
	}

	public User(Long id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
