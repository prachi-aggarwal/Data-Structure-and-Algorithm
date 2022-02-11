import java.util.*;

public class Main {
public static int binarySearch(int[] arr,int left,int right,int target){
  if(left>right)
    return -1;
int mid=left+(right-left)/2;
if(arr[mid]==target)
  return mid;
if(arr[mid]<target)
  binarySearch(int[]arr,mid+1,right,target);
else(arr[mid]>target)
  binarySearch(int[]arr,left,mid-1,target);
return -1;

}
public static int unboundedBinarySearch(int[] arr,int left,int right,int target){
  if(left>right)
    return -1;
  if(target<=arr[right]&&target>=arr[left])
    binarySearch(arr,left,right,target);
  else{
    unboundedBinarySearch(arr,right+1,right*2,target);
  }



}
