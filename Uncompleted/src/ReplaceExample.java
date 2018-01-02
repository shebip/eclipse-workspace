public class ReplaceExample {
  public static void main(String args[]) {
    String s1 = "dddddabcdwwwww abcdooooooabcdmmmmmm";
    String replaceString = s1.replace("abcd", "a-d");
    System.out.println(replaceString);
  }
}