package com.redhat.brq.integration;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

/**
 * Created by pmacik on 24.9.15.
 */
public class MyTest extends CamelTestSupport {
   @Override
   protected RouteBuilder createRouteBuilder() throws Exception {
      return new MyRouteBuilder();
   }

   @Override
   public void setUp() throws Exception {
      deleteDirectory("src/data");
      deleteDirectory("target/messages/uk");
      super.setUp();
   }

   @Test
   public void testRoute() throws Exception {
      template.sendBodyAndHeader("file:src/data", "<person><city>London</city></person>", Exchange.FILE_NAME, "message1.xml");
      Thread.sleep(5000); // waiting for route to be executed
      File out = new File("target/messages/uk/message1.xml");
      assertTrue(out.exists());
   }
}
