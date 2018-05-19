import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
    @Test
    public void equilateralTest() {
        Assert.assertEquals(Triangle.function("3", "3", "3"), "3 - Equilateral равносторонний");
        Assert.assertEquals(Triangle.function("6", "6", "6"), "3 - Equilateral равносторонний");
        Assert.assertEquals(Triangle.function("2", "2", "2"), "3 - Equilateral равносторонний");
    }

    @Test
    public void isoscelesTest() {
        Assert.assertEquals(Triangle.function("5", "5", "3"), "2 - Isosceles равнобедренный");
        Assert.assertEquals(Triangle.function("3", "5", "3"), "2 - Isosceles равнобедренный");
    }

    @Test
    public void erorTest() {
        Assert.assertEquals(Triangle.function("5", "0", "3"), "4 - Error");
        Assert.assertEquals(Triangle.function("5", "shyjcg", "3"), "4 - Error");
        Assert.assertEquals(Triangle.function("-5", "4", "3"), "4 - Error");
        Assert.assertEquals(Triangle.function("5", "0", "0"), "4 - Error");
        Assert.assertEquals(Triangle.function("5", "0", "dfh"), "4 - Error");
        Assert.assertEquals(Triangle.function("5.0", "0", "dfh"), "4 - Error");
        Assert.assertEquals(Triangle.function("null", "4", "7"), "4 - Error");


    }
}
