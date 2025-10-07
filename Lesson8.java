public class Lesson8 {
 public static void main(String[]args) {
   String word = "LAPTOP";
   String result = " ";
   for ( int i = 0; i<word.length(); i++) {
     char ch = word. charAt (i);
     if (ch >= 'A' && ch <= 'Z') {
       ch = (char) (ch + ('a' - 'A'));
     }
     result += ch;
   }
   System.out.println("LAPTOP");
 }
}