package io.quike.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  @DisplayName("App - Should fail to count on null args.")
  public void shouldFailCountAppNullArgs() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> App.main(null));
    assertEquals("No null args are allowed.", exception.getMessage());
  }

  @Test
  @DisplayName("App - Should count on empty args.")
  public void shouldCountAppEmptyArgs() {
    App.main(new String[0]);
    assertEquals(0, App.getCounter());
  }

  @Test
  @DisplayName("App - Should count on args")
  public void shouldCountAppWithArgs() {
    App.main(new String[] {"Hello", "World"});
    assertEquals(2, App.getCounter());
  }
}
