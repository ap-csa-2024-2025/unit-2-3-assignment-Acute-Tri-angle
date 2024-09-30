public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
    System.out.println(delEnd("behemoth", 4));
    System.out.println(compareLower("x-ray", "A-ray"));
    System.out.println(lengthFirst("Mommy can you supply me with some tea?"));
  }

  // write solutions to problems below
  public static String firstLastN(String x, int n){
    String y = new String();
    y = x.substring(0, n) + x.substring(x.length() - n, x.length());
    return y;
  }
  public static String delEnd(String x, int n){
    String y = new String();
    y = x.substring(0, x.length() - n);
    return y;
  }
  public static int compareLower(String x, String y){
    String a = x.toLowerCase();
    String b = y.toLowerCase();
    return a.compareTo(b);
  }
  public static int lengthFirst(String x){
    return x.indexOf(" ");
  }
}
