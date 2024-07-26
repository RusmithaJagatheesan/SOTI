import java.util.*;
public class permutationInteger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] parts=s.split(",");
        int[] arr=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        List<List<Integer>> res=permutation(arr);
        System.out.print(res);
    }
    public static List<List<Integer>> permutation(int[] arr){
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num:arr){
            List<List<Integer>> result=new ArrayList<>();
            for(List<Integer> perm:res){
                for(int i=0;i<=perm.size();i++){
                    List<Integer> p=new ArrayList<>(perm);
                    p.add(i,num);
                    result.add(p);
                }
            }
            res=result;
        }
        return res;
    }
}
