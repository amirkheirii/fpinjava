package com.fpinjava.io.exercise13_07;


public interface IO {

  void run();

  default IO add(IO io) {
    throw new IllegalStateException("To be implemented");
  }

  IO empty = () -> {};

}
