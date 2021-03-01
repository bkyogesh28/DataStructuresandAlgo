
import java.util.*;
public class Main{
    public static void main(String[]args){
      int[] a={-2, -3, 4, -1, -2, 1, 5, -3};
      int l=a.length;
      int msf,meh;
      msf=meh=0;
      for(int i=0;i<l;i++){
          meh=meh+a[i];
          if(meh<0){
              meh=0;
          }else if(msf<meh){
              msf=meh;
          }
      }
      System.out.print(msf);
    }
}
