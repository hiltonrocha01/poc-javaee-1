package br.com.aevc.login.domain;

import java.util.List;

//VO -> VALUE OBJECT - > O VO É UM PADRÃO DE PROJETO QUE DEFINE UM POJO COM SEMANTICA E GERALMENTE É FINAL

//DTO -> DATA TRANSFER OBJECT -> O DTO É UM PADRÃO DE PROJETO QUE DEFINE UM POJO SEM SEMANTICA E GERALMENTE NÃO É FINAL

public class LoggedUserVO {

	private final String name;
	private final String profileName;
	private final List<MenuVO> menus;

	public LoggedUserVO(String name, String profileName, List<MenuVO> menus) {
		super();
		this.name = name;
		this.profileName = profileName;
		this.menus = menus;
	}

	public String getName() {
		return name;
	}


	public String getProfileName() {
		return profileName;
	}

	public List<MenuVO> getMenus() {
		return menus;
	}

}
