import java.util.*;
public class Longestsubtr{
    public static int findlen(String str){
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++){
            boolean[] visit=new boolean[256];
            for(int j=i;j<n;j++){
                if(visit[str.charAt(j)]==true){
                    break;
                }else{
                    res=Math.max(res,j-i+1);
                    visit[str.charAt(j)]=true;
                }
            }
            visit[str.charAt(i)]=false;
        }
        return res;
    }


     public static void main(String []args){
    //   Scanner sc=new Scanner(System.in);
       String str="GeeksforGeeks";
       Longestsubtr subt=new Longestsubtr();
       int len=subt.findlen(str);
       System.out.print(len);
     }
}
