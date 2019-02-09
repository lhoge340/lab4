/**
 * Testing class for Equipment object
 * 
 * @author Lyndee
 * @version 2019-02-09
 *
 */
public class EquipmentTest {
	
	/**
	 * Test the Equipment constructor and the getters?
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
	

}
