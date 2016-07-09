package pl.kompro.dao.rozrachunki;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import pl.kompro.jpa.rozrachunki.StatusNaleznosciPro;

public abstract class RozrachunkiStd{

	public abstract List<StatusNaleznosciPro> odbStatusyNaleznosci();
	
	static public RozrachunkiStd utwRozrachunki( final EntityManager em){
		return new RozrachunkiStd(){
			private List<StatusNaleznosciPro> statusy;

			@Override public List<StatusNaleznosciPro> odbStatusyNaleznosci() {
				if( statusy== null){
					CriteriaBuilder cb= em.getCriteriaBuilder();
					CriteriaQuery<StatusNaleznosciPro> zapytanie= cb.createQuery( StatusNaleznosciPro.class);
					zapytanie.from( StatusNaleznosciPro.class);
					
					statusy= em.createQuery( zapytanie).getResultList();
				}
				return statusy;
			}
		};
	}
	
}
