import java.io.IOException;

import Controller.AddProject;
import Controller.AddUser;
import Controller.Connect;

public class App {
  public static void main(String[] args) throws IOException {
    for (int i = 3654; i > 3554; i--) {
      System.out.println("Номер записи: " + i);
      Connect connect = new Connect();
      connect.getArticle(i);
      if (!connect.getAuthor().equals("null")) {
        try {
          connect.getBody();
          AddUser addUser = new AddUser();
          AddProject addProject = new AddProject();
          addProject.newProject(connect, addUser.newUserId(connect));
        } catch (Exception e) {

        }
      }
    }
  }
}