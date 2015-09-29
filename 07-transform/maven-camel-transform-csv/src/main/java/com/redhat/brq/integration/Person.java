package com.redhat.brq.integration;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

/**
 * Created by pmacik on 23.9.15.
 */
@CsvRecord(separator = ";", crlf = "UNIX")
public class Person {
   @DataField(pos = 1)
   private String name;
   @DataField(pos = 2)
   private String city;

   @Override
   public String toString() {
      return "Person{" +
            "name='" + name + '\'' +
            ", city='" + city + '\'' +
            '}';
   }
}
