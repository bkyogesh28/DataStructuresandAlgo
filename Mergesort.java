import java.util.*;
public class mergesort{
    public static void merge(int a[],int l,int m,int r){
        int a1=m-l+1;
        int a2=r-m;
        int c1[]=new int[a1];
        int c2[]=new int[a2];
        for(int i=0;i<a1;i++){
            c1[i]=a[l+i];
        }
        for(int j=0;j<a2;j++){
            c2[j]=a[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while(i<a1 && j<a2){
            if(c1[i]<=c2[j]){
               a[k]=c1[i]; 
               i++;
            
               
            }else{
                a[k]=c2[j];
                j++;
        }
        k++;
    }
    while(i<a1){
        a[k]=c1[i];
        i++;
        k++;
        
    }
    while(i<a2){
        a[k]=c2[j];
        j++;
        k++;
    }
   
}    
   public static void sort(int a[],int l,int r){
       int m=l+(r-l)/2;
        if(l<r){
               sort(a,l,m);
               sort(a,m+1,r);
               merge(a,l,m,r);
        }
     
   }
    public static void printarr(int a[]){
        int len=a.length;
        for(int i=0;i<len;i++){
            System.out.print(a[i]+",");
        }
    }
    
     public static void main(String[]args){
        
        int a[]={100,500,1300,110,400,900};
       int l=a.length;
       int r=l-1;
        mergesort bb=new mergesort();
        bb.sort(a,0,r);
        printarr(a);
    }
}
