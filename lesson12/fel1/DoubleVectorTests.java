import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DoubleVectorTests {
    @Test
    public void equalsIsReflexive() {
        DoubleVector v1 = new DoubleVector(1,2);
        assertTrue(v1.equals(v1));
    }

    @Test
    public void equalsIsSymmetric() {
        DoubleVector v1 = new DoubleVector(1,2);
        DoubleVector v2 = new DoubleVector(1,2);
        
        if (v1.equals(v2)) {
            assertTrue(v2.equals(v1));
        }

        if (v2.equals(v1)) {
            assertTrue(v1.equals(v2));
        }
    }

    @Test
    public void equalsIsTransitive() {
        DoubleVector v1 = new DoubleVector(1,2);
        DoubleVector v2 = new DoubleVector(1,2);
        DoubleVector v3 = new DoubleVector(1,2);
        
        if (v1.equals(v2) && v2.equals(v3)) {
            assertTrue(v1.equals(v3));
        }
    }

    @Test
    public void equalsWithNullParam() {
        DoubleVector v1 = new DoubleVector(1,2);

        assertFalse(v1.equals(null));
    }

    @Test
    public void equalObjHashCodeIsSame() {
        DoubleVector v1 = new DoubleVector(1,2);
        DoubleVector v2 = new DoubleVector(1,2);
        assertTrue(v1.equals(v2));
        assertTrue(v1.hashCode() == v2.hashCode());
    }
}