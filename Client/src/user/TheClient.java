package user;

import useful.service.ServiceAPI;

import java.lang.reflect.Field;
import java.util.ServiceLoader;
import useful.service.ServiceAPI;

public class TheClient {
  public static void main(String[] args) throws Throwable {
    System.out.println(useful.Messages.welcome);
    Class<?> cl = Class.forName("useful.Messages");
    Field secretMessage = cl.getDeclaredField("secret");
    secretMessage.setAccessible(true);
    secretMessage.set(null, "Hi, my name is Zorgabell");
    System.out.println("Message is " + useful.Messages.getSecret());
    System.out.println("----------------------");
    ServiceLoader<useful.service.ServiceAPI> loader = ServiceLoader.load(ServiceAPI.class);
    for (ServiceAPI service : loader) {
      System.out.println("Found a service " + service.getClass().getName());
      System.out.println("Gives message " + service.getAServiceMessage());
    }
    System.out.println("End of services");
  }
}
