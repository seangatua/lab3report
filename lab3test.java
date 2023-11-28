import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class lab3test {
@Test
  public void max1() {
    int input1 = 1;
    int input2 = 2;
    lab3.max(1,2);
    assertEquals(input2, lab3.max(input1, input2));
  }

  @Test
  public void max2() {
    int input1 = 2;
    int input2 = 1;
    lab3.max(input1, input2);
    assertEquals(input1, lab3.max(input1, input2));
  }

}
