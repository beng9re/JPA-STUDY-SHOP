package jpaShop.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delivery {
	@Id
	@GeneratedValue
	private Long id;
	@Embedded
	private Addrss addrss;

}
