import java.util.*;
public class twoSum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int[] res=Sum(arr,n,target);
		System.out.print("["+res[0]+","+res[1]+"]");
	}
	public static int[] Sum(int[] arr,int n,int target){
	    Map<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<n;i++){
	        int sum=target-arr[i];
	        if(map.containsKey(sum)){
	            return new int[]{map.get(sum),i};
	        }
	        map.put(arr[i],i);
	    }
	    return new int[]{};
	}
}
