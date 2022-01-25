package br.com.aevc.login.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String url;
	@Column(nullable = false, columnDefinition = "boolean default true")
	private boolean active;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SubMenu", joinColumns = {
			@JoinColumn(name = "subMenuId", referencedColumnName = "id", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "menuId", referencedColumnName = "id", nullable = false) })
	private List<Menu> subMenus;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ProfileMenu", joinColumns = {
			@JoinColumn(name = "menuId", referencedColumnName = "id", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "profileId", referencedColumnName = "id", nullable = false) })
	private List<Profile> profiles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

}
