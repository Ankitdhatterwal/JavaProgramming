package Arrays;

public class sorting012 {
    public static int[] sorting012(int arr[]){
        int count0 =0,count1=0,count2=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                count0++;
            } else if (arr[i]==1) {
                count1++;
            }else if(arr[i]==2){
                count2++;
            }}
int j =0;
            int arr1[] = new int[arr.length];
            while(count0 != 0){
                arr1[j]=0;
                count0--;
                j++;
            }while(count1 != 0){
                arr1[j]=1;
                count1--;
                j++;
            }while(count2 != 0){
                arr1[j]=2;
                count2--;
                j++;
            }

return arr1;

    }
}
