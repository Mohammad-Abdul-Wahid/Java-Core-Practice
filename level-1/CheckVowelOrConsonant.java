public class CheckVowelOrConsonant {
  public static void main(String[] args) {
    // Check if a character is vowel or consonant.
    String vowels = "aeiou";
    char c = 'b';
    if (vowels.indexOf(c) != -1) {
      System.out.println("It is a vowel");
    } else {
      System.out.println("It is not a vowel");
    }
  }

}
