public class SecondLargest {
  public static void main(String[] args) {
    int arr[]={11,5,8,2,4,3};
    int max=arr[0],max2=0;
    for(int i:arr){
      if(max<i){
        max=i;
      }
    }
    for(int i:arr){
      if(i!= max && i>max2){
        max2=i;
      }
    }
    System.out.println(max2);
  }
  
}
