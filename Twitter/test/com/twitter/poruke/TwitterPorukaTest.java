/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Marko
 *
 */
public class TwitterPorukaTest {
	private TwitterPoruka tp;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tp= new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tp=null;
	}


	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		String korisnik = "Kaca";
		tp.setKorisnik(korisnik);
		assertEquals(korisnik, tp.getKorisnik());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull(){
		tp.setKorisnik(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazan(){
		tp.setKorisnik("");
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		String poruka = "Neka kratka poruka";
		tp.setPoruka(poruka);
		assertEquals(poruka, tp.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull(){
		tp.setPoruka(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPreko140Znakova(){
		tp.setPoruka("I took a pill in Ibiza "
				+ "To show Avicii I was cool"
				+ "And when I finally got sober, felt 10 years older"
				+ "But f**k it, it was something to do"
				+ "I'm living out in LA"
				+ "I drive a sports car just to prove"
				+ "I'm a real big baller cause I made a million dollars"
				+ "And I spend it on girls and shoes "
				+ "But you don't wanna be high like me"
				+ "Never really knowing why like me"
				+ "You don't ever wanna step off that roller coaster"
				+ "And be all alone"
				+ "You don't wanna ride the bus like this"
				+ "Never knowing who to trust like this"
				+ "You don't wanna be stuck up on that stage singing"
				+ "Stuck up on that stage singing"
				+ "All I know are sad songs, sad songs"
				+ "Darling, all I know are sad songs, sad songs");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		String korisnik = "Mare";
		String poruka = "Kako je...?";
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		assertEquals("KORISNIK:"+korisnik+" PORUKA:"+poruka, tp.toString());
	}

}
