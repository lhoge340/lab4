/**
 * Testing class for Equipment object
 * 
 * @author Lyndee
 * @version 2019-02-09
 *
 */
public class EquipmentTest {
	
	/**
	 * Test the Equipment constructor and the getters
	 */
	public void constructorTest() throws AssertException
	{
		//Create a string to use with the constructor
		String strg = "knife/1,2.0,15.0,keep sharpened";
		
		//Initialize an equipment object using the constructor
		Equipment item = new Equipment(strg);
		
		//The name should be "knife", count 1, totalWeight 2.0, totalPrice 15.0, description "keep sharpened"
		Assert.assertEquals("knife", item.getName());
		Assert.assertEquals(1, item.getCount());
		Assert.assertEquals(2.0, item.getTotalWeight());
		Assert.assertEquals(15.0, item.getTotalPrice());
		Assert.assertEquals("keep sharpened", item.getDescription());
		
	}
	
	/**
	 * Test the Equipment toString()
	 */
	public void toStringTest() throws AssertException
	{
		//Create an object to use the toString() on
		String strg = "knife/1,2.0,15.0,keep sharpened";
		Equipment item = new Equipment(strg);
		
		//Write the expected and actual strings
		String expected = "Name: knife, Number: 1, Weight: 2.00 lbs, Price: $15.00 - keep sharpened";
		String actual = item.toString();
		
		//Compare
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test the Equipment equals method
	 */
	public void equalsTest() throws AssertException
	{
		/*
		 * Test the if this == other branch
		 */
		
		String strg = "knife/1,2.0,15.0,keep sharpened";
		Equipment item = new Equipment(strg);
		boolean expectedEqual = true;
		boolean actualEqual = item.equals(item);
		Assert.assertEquals(expectedEqual, actualEqual);		
		
		
		/*
		 * Test the if !(other instanceof Equipment)
		 */
		Animal giraffe = new Animal("yellow", "Jerry", 600.0, 150.0);
		boolean expectedNonobject = false;
		boolean actualNonobject = item.equals(giraffe);
		Assert.assertEquals(expectedNonobject, actualNonobject);
		
		
		/*
		 * Test the matching of two objects that are the same
		 */
		Equipment itemSame = new Equipment(strg);
		boolean expectedSame = true;
		boolean actualSame = item.equals(itemSame);
		Assert.assertEquals(expectedSame, actualSame);
		
		/*
		 * Test if it'll match two objects that are not the same
		 */
		String strgDifferent = "knife/4,2.0,15.0,keep sharpened";
		Equipment itemDifferent = new Equipment(strgDifferent);
		boolean expectedDifferent = false;
		boolean actualDifferent = item.equals(itemDifferent);
		Assert.assertEquals(expectedDifferent, actualDifferent);
	}
	

}
