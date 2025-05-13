package codewars.StringEndsWith;

public class Main {
   //check("samurai", "ai", true);
   //check("sumo", "omo", false);
   //check("ninja", "ja", true);
   //check("sensei", "i", true);
   //check("samurai", "ra", false);
   //check("abc", "abcd", false);

    public static void main(String[] args) {
        String first = "samurai";
        String check1 = "ai";
        String check2 = "ra";

        //String formatString = first.lastIndexOf(first.length() - check1.length(), check1.length());

        if (first.contains(check1)) {
            System.out.println("check1 true");
        } if (first.contains(check2)) {
            System.out.println("check2 true");
        }
    }
}
