package pl.kompro.testy;

import javax.persistence.EntityManager;

import pl.kompro.dao.rozrachunki.RozrachunkiStd;
import pl.kompro.jpa.rozrachunki.StatusNaleznosciPro;
import pl.kompro.uslugi.Utrwalacz;

public class TestStatusuNaleznosciStd {

	public static void main( String[] args){
		(new TestStatusuNaleznosciStd()).start();
	}
	
	private void start(){
		EntityManager em = Utrwalacz.manager();
		RozrachunkiStd roz= RozrachunkiStd.utwRozrachunki( em);
		for( StatusNaleznosciPro status: roz.odbStatusyNaleznosci()){
			System.err.println( "Status: ("+ status.odbKod()+ ") "+status.odbNazwe());
		}
	}
}
