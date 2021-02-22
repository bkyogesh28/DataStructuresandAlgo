import java.util.*;
public class selectionsort{
    public static void sort(int a[]){
        int len=a.length;
        for(int i=0;i<len-1;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        
        printarr(a,len);
    }
    public static void printarr(int a[],int len){
        for(int i=0;i<len;i++){
            System.out.print(a[i]+",");
        }
    }
    
     public static void main(String[]args){
        
        int a[]={11,9,4,6,0,10};
       
        selectionsort bb=new selectionsort();
        bb.sort(a);
    }
}
