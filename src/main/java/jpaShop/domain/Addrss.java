package jpaShop.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Addrss {

	@Column
	private final String city;
	@Column
	private final String streat;
	@Column
	private final String zipcode;

	public Addrss(String city, String streat, String zipcode) {
		this.city = city;
		this.streat = streat;
		this.zipcode = zipcode;
	}

	public Addrss() {
		city = "";
		streat = "";
		zipcode = "";
	}

	public String fullAddress() {
		return getCity() + " " + getStreat() + " " + getZipcode();
	}

	public String getCity() {
		return city;
	}

	public String getStreat() {
		return streat;
	}

	public String getZipcode() {
		return zipcode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Addrss addrss = (Addrss)o;
		return Objects.equals(getCity(), addrss.getCity()) && Objects.equals(getStreat(),
			addrss.getStreat()) && Objects.equals(getZipcode(), addrss.getZipcode());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCity(), getStreat(), getZipcode());
	}
}
