package Controller;

import model.Projects;
import model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.Timestamp;
import java.util.Random;
import java.util.stream.Collectors;

public class AddUser {
  public int newUserId(Connect connect) {
    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    try (SessionFactory sessionFactory = new MetadataSources(registry).addAnnotatedClass(Projects.class).addAnnotatedClass(Users.class).buildMetadata().buildSessionFactory()) {
      Session session = sessionFactory.openSession();
      session.beginTransaction();

      String firstName;
      String lastName = "";

      if(connect.getAuthor().contains(" ")){
        firstName = connect.getAuthor().substring(0, connect.getAuthor().indexOf(" "));
        lastName = connect.getAuthor().substring(connect.getAuthor().indexOf(" ")+1);
      }else{
        firstName = connect.getAuthor();
      }
      String password = new Random().ints(8, 33, 122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());

      Users user = new Users(firstName, lastName, connect.getMail(),password, Timestamp.valueOf("2019-08-14 00:00:00"));
      System.out.println(firstName + " : " + lastName + " : " + password + " : " + connect.getMail());
      session.save(user);
      session.getTransaction().commit();
      return user.getId();
    }

  }
}
