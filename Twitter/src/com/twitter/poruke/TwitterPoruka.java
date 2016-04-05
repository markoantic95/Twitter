package com.twitter.poruke;
/**
 * Klasa TwitterPoruka
 * @author Marko
 * <ul>Ova klasa ima atribute:
 * 	<li>korisnik
 * 	<li>poruka
 * </ul>
 */

public class TwitterPoruka {
	
	/**
	 * Ime korisnika
	 */
	private String korisnik;
	/**
	 * Tekst poruke
	 */
	private String poruka;
	/**
	 * Vraca ime korisnika 
	 * @return korisnik
	 */
	public String getKorisnik() {
		return korisnik;
	}
	/**
	 * Metoda postavlja vrednost za ime korisnika
	 * @param korisnik - ime korisnika
	 * @throws java.lang.RuntimeException ako je kao parametar prosledjen null ili prazan String
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || korisnik == "")
		throw new RuntimeException(
			"Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	/**
	 * Vraca tekst poruke
	 * @return poruka
	 */
	public String getPoruka() {
		return poruka;
	}
	/**
	 * Metoda postavlja sadrzaj poruke
	 * @param poruka
	 * @throws java.lang.RuntimeException ako je kao parametar prosledjen null ili je duzina String-a veca od 140
	 */
	public void setPoruka(String poruka) {
		if (poruka==null || poruka.length()>140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	
	/**
	 * @return ime korisnika i tekst poruke
	 */
	public String toString(){
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 
}
