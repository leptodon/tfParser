package service;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class Util {
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
            .data("login", "it.leha@gmail.com")
            .data("password", "881002")
            .cookies(response.cookies())
            .execute();
    return response;
  }
}
