import java.util.*;
public class bubblesort{
    public static void sort(int a[]){
        int len=a.length;
        boolean status;
        for(int i=0;i<len;i++){
            status=false;
            for(int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    status=true;
                }
            }
            if(status==false){
                break;
            }
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
       
        bubblesort bb=new bubblesort();
        bb.sort(a);
    }
}
