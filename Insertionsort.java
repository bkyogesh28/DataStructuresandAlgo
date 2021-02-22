import java.util.*;
public class bubblesort{
    
   public static void sort(int a[]){
     
      int l=a.length;
      for(int i=1;i<l-1;i++){
          int key=a[i];
          int j=i-1;
          while(j>=0 && a[j]>key){
              a[j+1]=a[j];
              j=j-1;
          }
          a[j+1]=key;
      }
     
        printarr(a,l);
   }
    public static void printarr(int a[],int len){
        for(int i=0;i<len;i++){
            System.out.print(a[i]+",");
        }
    }
    
     public static void main(String[]args){
        
        int a[]={100,500,1300,110,450,900};
       
        bubblesort bb=new bubblesort();
        bb.sort(a);
    }
}
