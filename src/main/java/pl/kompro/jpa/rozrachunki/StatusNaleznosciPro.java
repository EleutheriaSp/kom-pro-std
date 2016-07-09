package pl.kompro.jpa.rozrachunki;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value="N")
public class StatusNaleznosciPro extends StatusRozrachunkuPro{
	private static final long serialVersionUID = -832222177428129133L;

	private String kod;
	private String nazwa;

	public String odbKod(){
		return kod;
	}
	
	public String odbNazwe(){
		return nazwa;
	}


}
