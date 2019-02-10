/**
 * Testing class for Zoo class
 * 
 * @author Lyndee
 * @version 2019-02-09
 */
public class ZooTest {
	
	/**
	 * Test getTotalHeight
	 */
	public void getTotalHeightTest() throws AssertException
	{
		//Use default constructor to make a zoo with animals
		Zoo zooOne = new Zoo(3);
		Animal platypus = new Animal("green", "Perry", 17.0, 7.0);
		Animal giraffe = new Animal("yellow", "Jerry", 600.00, 150.00);
		zooOne.addAnimal(platypus);
		zooOne.addAnimal(giraffe);
		
		//Set expected total height for array not filled to capacity
		double expectedUnderfilled = 157.0;
		
		//Compare to see if they match
		Assert.assertEquals(expectedUnderfilled, zooOne.getTotalHeight(), 0.01);
		
		//Add animal to fill array to capacity
		Animal iguana = new Animal("blue", "Izzy", 30.0, 20.30);
		zooOne.addAnimal(iguana);
		
		//Set expected total height for array filled to capacity
		double expectedFilled = 177.3;
		
		//Compare to see if they match
		Assert.assertEquals(expectedFilled, zooOne.getTotalHeight(), 0.01);
		
		//Add animal to overfill array and utilize expandZoo()
		Animal alpaca = new Animal("white", "Arnold", 350.47, 96.84);
		zooOne.addAnimal(alpaca);
		
		//Set expected total height for array that's been overfilled and reconstructed
		double expectedOverfilled = 274.14;
		
		//Compare to see if they match
		Assert.assertEquals(expectedOverfilled, zooOne.getTotalHeight(), 0.01);
	}
	
	/**
	 * Test getCapacity
	 */
	public void getCapacityTest() throws AssertException
	{
		//Use default constructor to make a zoo with animals
		Zoo zooTwo = new Zoo (3);
		Animal platypus = new Animal("green", "Perry", 17.0, 7.0);
		Animal giraffe = new Animal("yellow", "Jerry", 600.00, 150.00);
		zooTwo.addAnimal(platypus);
		zooTwo.addAnimal(giraffe);
		
		//Compare to see if actual capacity matches expected capacity
		Assert.assertEquals(2, zooTwo.getCapacity());
		
		//Add animal to fill array to capacity
		Animal iguana = new Animal("blue", "Izzy", 30.0, 20.30);
		zooTwo.addAnimal(iguana);
		
		//Compare to see if actual capacity matches expected capacity
		Assert.assertEquals(3, zooTwo.getCapacity());
		
		//Add animal to fill array over capacity and utilize expandZoo()
		Animal alpaca = new Animal("white", "Arnold", 350.47, 96.84);
		zooTwo.addAnimal(alpaca);
		
		//Compare to see if actual capacity matches expected capacity
		Assert.assertEquals(4, zooTwo.getCapacity());
		
	}
	
	
	/**
	 * Test toString()
	 */
	public void toStringTest() throws AssertException
	{
		//Create an underfilled zoo to use toString() on
		Zoo zooThree = new Zoo (3);
		Animal platypus = new Animal("green", "Perry", 17.0, 7.0);
		Animal giraffe = new Animal("yellow", "Jerry", 600.00, 150.00);
		zooThree.addAnimal(platypus);
		zooThree.addAnimal(giraffe);
		
		//Write the expected and actual strings
		String expectedUnderfilled = "These animals live in the zoo: \n" + 
				"Perry, a green-colored animal. 17.0 pounds, 7.0 inches\n" + 
				"Jerry, a yellow-colored animal. 600.00 pounds, 150.00 inches";
		String actualUnderfilled = zooThree.toString();
		
		//Compare
		Assert.assertEquals(expectedUnderfilled, actualUnderfilled);
		
		//Add animal to fill array to capacity
		Animal iguana = new Animal("blue", "Izzy", 30.0, 20.30);
		zooThree.addAnimal(iguana);
		
		//Write the expected and actual strings
				String expectedFilled = "These animals live in the zoo: \n" + 
						"Perry, a green-colored animal. 17.0 pounds, 7.0 inches\n" + 
						"Jerry, a yellow-colored animal. 600.00 pounds, 150.00 inches\n" +
						"Izzy, a blue-colored animal. 30.0 pounds, 20.30 inches";
				String actualFilled = zooThree.toString();
				
		//Compare
		Assert.assertEquals(expectedFilled, actualFilled);
		
		//Add animal to fill array over capacity and utilize expandZoo()
				Animal alpaca = new Animal("white", "Arnold", 350.47, 96.84);
				zooThree.addAnimal(alpaca);
				
		//Write the expected and actual strings
		String expectedOverfilled = "These animals live in the zoo: \n" + 
						"Perry, a green-colored animal. 17.0 pounds, 7.0 inches\n" + 
						"Jerry, a yellow-colored animal. 600.00 pounds, 150.00 inches\n" +
						"Izzy, a blue-colored animal. 30.0 pounds, 20.30 inches\n" +
						"Arnold, a white-colored animal. 350.47 pounds, 96.84 inches";
		String actualOverfilled = zooThree.toString();
		
		//Compare
		Assert.assertEquals(expectedOverfilled, actualOverfilled);
		
	}

}
