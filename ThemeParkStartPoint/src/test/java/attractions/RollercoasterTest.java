package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor =  new Visitor(11,200,11);
        visitor2 =  new Visitor(18,200,11);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedOnFalse(){
        assertEquals(false,rollerCoaster.isAllowedToVisitor(visitor));

    }
    @Test
    public void isAllowedOnTrue(){
        assertEquals(true,rollerCoaster.isAllowedToVisitor(visitor2));
    }

    @Test
    public void chargesCorrectPrice(){
        assertEquals();
        assertEquals();
    }




}
