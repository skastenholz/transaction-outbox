package com.gruelbox.transactionoutbox;

/** A function... that throws. */
@FunctionalInterface
public interface ThrowingFunction<T, U> {

  U apply(T t) throws Exception;
}