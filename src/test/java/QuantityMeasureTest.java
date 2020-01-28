import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.FEET, 0.0);
        LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnException() {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.FEET, 1);
        LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.FEET, 1);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenZeroAndZeroInch_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.INCH, 1);
        LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.INCH, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInInch_shouldReturnException() {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.INCH, 0);
        LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.FEET, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.INCH, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.INCH, 0);
        LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.FEET, 0);
        Assert.assertEquals(first, second);
    }
}
