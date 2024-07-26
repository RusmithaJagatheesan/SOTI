import java.util.*;
public class LetterCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<String> res=StringCase(s);
        System.out.print(res);
    }
    public static List<String> StringCase(String s){
        List<String> res=new ArrayList<>();
        res.add("");
        for(char c:s.toCharArray()){
            List<String> result=new ArrayList<>();
            if(Character.isLetter(c)){
                char l=Character.toLowerCase(c);
                char u=Character.toUpperCase(c);
                for(String str:res){
                    result.add(str+l);
                    result.add(str+u);
                }
            }
            else{
                for(String str:res){
                    result.add(str+c);
                }
            }
            res=result;
        }
        return res;
    }
}
