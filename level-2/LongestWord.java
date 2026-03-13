public class LongestWord {
  public static void main(String[] args) {
    String str="My name is Wahid a Superhero";
    String arr[]=str.split(" ");
    int max=0;
    String maxSizeWord="";
    for(String i:arr){
      if(i.length()>max){
        maxSizeWord=i;
      }
    }
    System.out.println(maxSizeWord);
  }
  
}
