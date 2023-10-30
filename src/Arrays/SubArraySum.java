package Arrays;

public class SubArraySum
{
    public static int subArraySum(int arr[],int start,int end){
        int sum=0;
        for (int i = start; i <=end ; i++) {

            sum = sum+arr[i];
        }
        return sum;

    }


}
