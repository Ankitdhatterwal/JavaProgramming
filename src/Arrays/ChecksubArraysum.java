package Arrays;

public class ChecksubArraysum {
    public static void  checkSubArraysum(int[] arr,int k){
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            int currentsum =arr[i];
            if(currentsum==k){
                System.out.println("the sum is fond at index :"+i);
                return ;
            }
            for (int j = i+1; j<n ; j++) {
           currentsum += arr[j];
               if(currentsum==k){
                   System.out.println("the start index is :"+i+"End index is:"+j);
                   return;
               }

            }

        }
        System.out.println("sum not found");

    }
}
