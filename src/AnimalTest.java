/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
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
    	Animal animalOne = new Animal("green", "Perry", 17.0, 7.0);
    	
    	//The name should be "Perry", color "green", weight 17.0, and height 7.0.
    	Assert.assertEquals("green", animalOne.getColor());
    	Assert.assertEquals("Perry", animalOne.getName());
    	Assert.assertEquals(20.4, animalOne.getHeight(), 0.01);
    	Assert.assertEquals(17.0, animalOne.getWeight(), 0.01);
    }
    
    // TODO: test full constructor, getters, and toString
}

