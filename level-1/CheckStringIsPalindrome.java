public class CheckStringIsPalindrome {
  public static void main(String[] args) {
    // Check if a string is palindrome.
    String str="aba";
    String ans="";
    for(int i=str.length()-1;i>=0;i--){
    ans+=str.charAt(i);
    }
    if(str.compareTo(ans)==0){
    System.out.println("Palindrome");
    }else{
    System.out.println("not palidrome");
    }
  }
  
}
