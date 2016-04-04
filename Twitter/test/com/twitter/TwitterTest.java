/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author Marko
 *
 */
public class TwitterTest {
	private Twitter tw;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tw = new Twitter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tw=null;
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiSvePoruke()}.
	 */
	@Test
	public void testVratiSvePoruke() {
		tw.unesi("Mika", "Poruka za Miku");
		tw.unesi("Peka", "Poruka za Peku");
		TwitterPoruka twp = new TwitterPoruka();
		twp.setKorisnik("Mika");
		twp.setPoruka("Poruka za Miku");
		TwitterPoruka twp2 = new TwitterPoruka();
		twp2.setKorisnik("Peka");
		twp2.setPoruka("Poruka za Peku");
		assertEquals(twp.getKorisnik(), tw.vratiSvePoruke().get(0).getKorisnik());
		assertEquals(twp2.getKorisnik(), tw.vratiSvePoruke().get(1).getKorisnik());
		assertEquals(twp.getPoruka(), tw.vratiSvePoruke().get(0).getPoruka());
		assertEquals(twp2.getPoruka(), tw.vratiSvePoruke().get(1).getPoruka());
		
	}

	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesi() {
		tw.unesi("Zika", "Sta radis?");
		assertEquals("Zika", tw.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("Sta radis?",tw.vratiSvePoruke().get(0).getPoruka());
	}
	@Test (expected = java.lang.RuntimeException.class)
	 	public void testVratiPorukeNull() {
	 		tw.vratiPoruke(7, null);
	 	}

	 @Test (expected = java.lang.RuntimeException.class)
	 	public void testVratiPorukePrazan() {
	 		tw.vratiPoruke(7, "");
	 	}
	 	
	
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test
	public void testVratiPoruke() {
		tw.unesi("Adele", "Hello , it's me");
		tw.unesi("Zaklina", "Hello Hi Cao");
		tw.unesi("Magdalena", "Zdravo, ja sam");
		TwitterPoruka niz[] =tw.vratiPoruke(2, "Hello");
		TwitterPoruka niz2[]= new TwitterPoruka[2];
		TwitterPoruka p1 = new TwitterPoruka();
		TwitterPoruka p2 = new TwitterPoruka();
		p1.setKorisnik("Adele");
		p1.setPoruka("Hello , it's me");
		p2.setKorisnik("Zaklina");
		p2.setPoruka("Hello Hi Cao");
		niz2[0]=p1;
		niz2[1]=p2;
		assertEquals(niz2[0].getKorisnik(),niz[0].getKorisnik());
		assertEquals(niz2[0].getPoruka(),niz[0].getPoruka());
		assertEquals(niz2[1].getKorisnik(),niz[1].getKorisnik());
		assertEquals(niz2[1].getPoruka(),niz[1].getPoruka());
	}

}
