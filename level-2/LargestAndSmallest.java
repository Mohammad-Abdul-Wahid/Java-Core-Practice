public class LargestAndSmallest{
  public static void main(String[] args) {
    int arr[]={5,8,2,4,3};
    int max=arr[0];
    int min=arr[0];
    for(int i:arr){
      if(max<i){
        max=i;
      }
      if(min>i){
        min=i;
      }
    }
    System.out.println("MAX:"+max+" MIN:"+min);
  }
}
