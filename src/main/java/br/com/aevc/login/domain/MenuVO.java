package br.com.aevc.login.domain;

public class MenuVO {

	private final String name;
	private final String url;

	public MenuVO(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

}
