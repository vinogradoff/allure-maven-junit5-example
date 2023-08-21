import org.junit.jupiter.api.*;

import java.lang.reflect.*;

class PrivateMethodTest {


  @Test
  void sum2() {
    Assertions.assertTrue(new Foo().sum2(5, 67) == 72);
  }


  @Test
  void sum() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Foo foo = new Foo();
    Method method = Foo.class.getDeclaredMethod("sum", Integer.class, Integer.class);
    method.setAccessible(true);
    Assertions.assertTrue(method.invoke(foo, 5, 67).equals(72));

  }
}