package com.redhat.brq.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by pmacik on 24.9.15.
 */
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
   @XmlAttribute
   private String user;
   @XmlElement
   private String firstName;
   @XmlElement
   private String lastName;
   @XmlElement
   private String city;

   @Override
   public String toString() {
      return "Person{" +
            "user='" + user + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", city='" + city + '\'' +
            '}';
   }
}
