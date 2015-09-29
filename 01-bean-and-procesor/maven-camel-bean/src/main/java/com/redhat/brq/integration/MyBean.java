package com.redhat.brq.integration;

/**
 * Created by pmacik on 24.9.15.
 */
public class MyBean {
   public void process(String msg) {
      System.out.println("Zprava: " + msg);
   }

   public String process2(String msg) {
      return "Hotovo: " + msg;
   }
}
