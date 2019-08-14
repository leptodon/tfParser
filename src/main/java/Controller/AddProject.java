package Controller;

import model.Projects;
import model.Status;
import model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AddProject {
  public void newProject(Connect connect, int uId) {
    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    try (SessionFactory sessionFactory = new MetadataSources(registry).addAnnotatedClass(Projects.class).addAnnotatedClass(Users.class).buildMetadata().buildSessionFactory()) {
      Session session = sessionFactory.openSession();
      session.beginTransaction();

      Projects projects = new Projects();
      projects.setTitle(connect.getTitle());
      projects.setText(connect.getBody());
      projects.setDescription("Описание");
      projects.setCreatedAt(null);
      projects.setDeletedAt(null);
      projects.setUpdatedAt(null);
      projects.setStatus(Status.awaiting);
      projects.setuId(uId);

      session.save(projects);
      session.getTransaction().commit();
    }

  }

}