import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class UnitTests {

  RoachPopulation population = new RoachPopulation(15);

  @Test
  public void SwapperEven(){
	int x[] = {4, -5, 10, 7,-3, 6, 2, 1, 9, -8};
	Swapper y = new Swapper();

	int z[] = y.check(x);

	assertArrayEquals(new int[]{-5,4,7,10,6,-3,1,2,-8,9}, z);
  }

  @Test
  public void SwapperOdd(){
	int x[] = {4, -5, 10, 7,-3, 6, 2, 1, 9, -8, 2};
	Swapper y = new Swapper();

	int z[] = y.check(x);

	assertArrayEquals(new int[]{-5,4,7,10,6,-3,1,2,-8,9,2}, z);
  }

  @Test 
  public void SwapperOne(){
	int x[] = {4};
	Swapper y = new Swapper();

	int z[] = y.check(x);

	assertArrayEquals(x, z);

  }

  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("UnitTests");

  }
}