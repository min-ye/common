package com.lia.common.exception;

public class UnknownPropertyException extends Exception {
   private static final long serialVersionUID = 1L;

   public UnknownPropertyException(String fieldName) {
      super(String.format("Unknown Property [%s].", fieldName));
   }
}
