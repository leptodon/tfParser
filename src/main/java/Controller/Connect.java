package Controller;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import service.Util;

import java.io.IOException;

public class Connect {
  private static Connection.Response response;
  private static Util util;
  private static Document doc;

  public void getArticle(int number) throws IOException {
    util = new Util();
    response = util.Connect();
    try {
      doc = Jsoup.connect("http://teamfinding.com/ru/project/show/" + number).cookies(response.cookies()).get();
    } catch (Exception e) {
    }
  }

  public String getAuthor() {
    try {
      Element firstName = doc.select("div.span3.well").select("a[href]").first();
      return firstName.text();
    } catch (Exception e) {
      return "null";
    }
//    System.out.println(firstName.text());
  }

  public String getMail() {
    Elements nickName = doc.select("div.span3.well").select("a[href]");
    String mail = nickName.attr("href").replaceAll("/ru/public/", "") + "@somemail.ru";
//    System.out.println(nickName.attr("href").replaceAll("/ru/public/", ""));
    return mail;
  }

  public String getTitle() {
    Element title = doc.select("div.pull-left").first();
//    System.out.println(title.text());
    return title.text();
  }

  public String getBody() {
    Element body = doc.select("div.public-project-describe.well-simple.pull-left.clear").first();
    StringBuilder sb = new StringBuilder();
    for (Element element : body.select("p")) {
      if (element.text().equals(" ")) {
        sb.append("\n");
        System.out.println();
      } else {
        sb.append(element.text());
      }
    }
  return sb.toString();
  }

  public String getSpecializations(){
    Element specialization = doc.select("div.public-project-specialization").first();
//    System.out.println(specialization.text());
    return specialization.text();
  }

}
