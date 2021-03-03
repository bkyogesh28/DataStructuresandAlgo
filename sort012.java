public class sort12{
    public static void main(String[]args){
        int[] a={0,1,1,0,1,1,2,1,2,2,0};
        int len=a.length;
        sort12(a,len);
        
    }
    public static void sort12(int a[],int n){
        int l=0;
        int mid=0;
        int h=n-1;
        int temp=0;
        while(mid<=h){
            switch(a[mid]){
                case 0:{
                    temp=a[l];
                    a[l]=a[mid];
                    a[mid]=temp;
                    l++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=a[mid];
                    a[mid]=a[h];
                    a[h]=temp;
                    h--;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
    }
}
