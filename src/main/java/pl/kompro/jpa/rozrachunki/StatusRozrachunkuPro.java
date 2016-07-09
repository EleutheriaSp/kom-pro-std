package pl.kompro.jpa.rozrachunki;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name= "ROZRACHUNKI_STATUSY", schema= "PRO")
@Inheritance( strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name= "CECHA", discriminatorType= DiscriminatorType.CHAR, length= 1)
public class StatusRozrachunkuPro implements Serializable{
	private static final long serialVersionUID = 1036672635006940510L;

	@Id
	private long id;
}
