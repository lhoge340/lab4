/**
 * Testing class for Animal object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2019-02-09
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    /**
     * Test the full Animal constructor and the getters
     */
    public void fullConstructorTest() throws AssertException
    {
    	//Use the full constructor
    	Animal platypus = new Animal("green", "Perry", 17.0, 7.0);
    	
    	//The name should be "Perry", color "green", weight 17.0, and height 7.0.
    	Assert.assertEquals("green", platypus.getColor());
    	Assert.assertEquals("Perry", platypus.getName());
    	Assert.assertEquals(7.0, platypus.getHeight(), 0.01);
    	Assert.assertEquals(17.0, platypus.getWeight(), 0.01);
    }
    
    /**
     * Test the Animal toString()
     */
    public void toStringTest() throws AssertException
    {
    	//Create an object to use the toString() on
    	Animal platypus = new Animal("green", "Perry", 17.0, 7.0);
    	
		//Write the expected and actual strings
    	String expected = "Perry, a green-colored animal. 17.0 pounds, 7.0 inches\n";
    	String actual = platypus.toString();
    	
    	Assert.assertEquals(expected, actual);
    }
    
    /**
     * Test the Animal equals method
     */
    public void equalsTest() throws AssertException
    {
    	/*
		 * Test the if this == other branch
		 */
		Animal platypus = new Animal("green", "Perry", 17.0, 7.0);
		boolean expectedEqual = true;
		boolean actualEqual = platypus.equals(platypus);
		Assert.assertEquals(expectedEqual, actualEqual);		
		
		
		/*
		 * Test the if !(other instanceof Animal)
		 */
		String strg = "knife/1,2.0,15.0,keep sharpened";
		Equipment item = new Equipment(strg);
		boolean expectedNonanimal = false;
		boolean actualNonanimal = platypus.equals(item);
		Assert.assertEquals(expectedNonanimal, actualNonanimal);
		
		
		/*
		 * Test the matching of two objects that are the same
		 */
		Animal animalSame = new Animal("green", "Perry", 17.0, 7.0);
		boolean expectedSame = true;
		boolean actualSame = platypus.equals(animalSame);
		Assert.assertEquals(expectedSame, actualSame);
		
		/*
		 * Test if it'll match two objects that are not the same
		 */
		Animal giraffe = new Animal("yellow", "Jerry", 600.0, 17.0);
		boolean expectedDifferent = false;
		boolean actualDifferent = platypus.equals(giraffe);
		Assert.assertEquals(expectedDifferent, actualDifferent);
    }
    
}

