package com.redhat.brq.integration;

import java.lang.String;
import java.lang.System;

public class MyBean {
   public void process(String msg) throws MyException {
      if (msg.contains("james")) {
         throw new MyException();
      } else {
         System.out.println(msg);
      }
   }
}
