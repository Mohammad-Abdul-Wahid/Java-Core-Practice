public class ReverseAnArray{
  public static void main(String[] args) {
    int arr[]={5,4,3,2,1};
    int rev[] = new int[5];
    int j=0;
    for(int i=arr.length-1;i>=0;i--){
      rev[j]=arr[i];
      j++;
    }
    for(int i:rev){
      System.out.println(i);
    }

  }
}