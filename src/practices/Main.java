package practices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Latiful", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("I'm Latiful bari");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}