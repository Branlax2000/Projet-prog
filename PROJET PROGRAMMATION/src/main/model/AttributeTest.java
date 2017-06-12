package main.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.model.Attribute;
import main.model.AttributeType;

/**
 * This class is a test of the Attribute class
 * @author Céline
 *
 */
public class AttributeTest  {

	/**
	 * The constructor
	 */
	public AttributeTest() {
		
	}

	/**
	 * This method tests the equals method of the Attribute class
	 */
	@Test()
	public void testEquals() {
		Attribute aMat = new Attribute("Matriculation", AttributeType.VARCHAR);
		Attribute aBrand = new Attribute("Brand", AttributeType.VARCHAR);
		
		assertTrue(!aMat.equals(null));
		assertEquals(aMat, aMat);
		assertTrue(aMat.equals(new Attribute("Matriculation", AttributeType.VARCHAR)));
		assertFalse(aMat.equals(aBrand));
	}
}
