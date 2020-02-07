package service;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class Util {
  private final String LOGIN = "Your_login";
  private final String PASSWORD = "Your_password";
  public Connection.Response Connect() throws IOException {
    Connection.Response response = Jsoup
            .connect("http://teamfinding.com/")
            .execute();

    response = Jsoup
            .connect("http://teamfinding.com/")
            .method(Connection.Method.POST)
            .header("Accept", "application/json, text/javascript, */*; q=0.01")
            .header("Content-Type", "application/x-www-form-urlencoded")
            .header("Keep-Alive", "Yes")
            .data("login", LOGIN)
            .data("password", PASSWORD)
            .cookies(response.cookies())
            .execute();
    return response;
  }
}
