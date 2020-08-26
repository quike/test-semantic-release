package io.quike.app;

import java.util.Arrays;
import java.util.Objects;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class App {

  private static int counter;

  public static void main(String[] args) {
    if (Objects.isNull(args)) throw new IllegalArgumentException("No null args are allowed.");
    counter = 0;
    log.info("args={}", Arrays.toString(args));
    counter = args.length;
  }

  /** @return counter */
  public static int getCounter() {
    return counter;
  }
}
