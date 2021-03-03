public class sort12{
    public static void main(String[]args){
        int[] a={7, 10, 4, 3, 20, 15};
        int key=1;
        int len=a.length;
        kthsmall(a,len,key);
        
    }
    public static void kthsmall(int a[],int n,int k){
        boolean swap=false;
        for(int i=0;i<n;i++){
            swap=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    swap=true;
                }
            }
        }
        System.out.print(a[k-1]);
    }
}
