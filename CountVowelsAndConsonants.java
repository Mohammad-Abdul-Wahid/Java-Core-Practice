public class CountVowelsAndConsonants {
  public static void main(String[] args) {
    // Count vowels and consonants in a string.
    String str = "wahid";
    int c1 = 0, v = 0;
    String vowels = "aeiou";
    for (int i = 0; i < str.length(); i++) {
      if (vowels.indexOf(str.charAt(i)) != -1) {
        v++;
      } else {
        c1++;
      }
    }
    System.out.println("Consonants: " + c1 + " , Vowels: " + v);
  }

}
