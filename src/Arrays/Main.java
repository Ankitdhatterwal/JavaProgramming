package Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Use u = new Use();
       int arr[] = u.read();

//       ** program for find the largest element is orderd array ASC/DSC both ** (code for MaxElementArray)
//        int arr[] ={8,7,6,5,3};
//   MaxElementArray max = new MaxElementArray();
//    int s = max.max1(arr);
//        if(s ==1){
//            System.out.println("Largest element is: "+arr[0]);
//        }else{
//            System.out.println("Largest element is: "+arr[4]);
//        }

// ** program to reverse a string **// name ~ ReverseArray
//        ReverseArray rsv = new ReverseArray();
//        int rsvarray[] = rsv.reverse(arr);
//        for(int rs:rsvarray){
//            System.out.print(rs+" ");
//        }


        //** Program to find Kth largest element in a string (KthLargest)
//        int k =3;
//   KthLargest l = new KthLargest();
//    int largest  =l.kthLargestElement(arr,k);
//
//        System.out.println(largest);
//        u.print(arr);

        //** program to count the Occurrencess of integer in array (CounOccurrences)
//       countOccurrences count = new countOccurrences();
//      int n= count.countOccurrences(arr,4);
//        System.out.println("Element found at : "+n);

//** program to sort the array of 0's 1's and 2's
//        sorting012 sort =new sorting012();
//        int[] arr1 = sort.sorting012(arr);
//        u.print(arr1);

        //** program to find the sum of sub array between start and end index (SubArraySum)
//        System.out.print("Enter the start index : " );
//         int n1 =scan.nextInt();
//        System.out.print("Enter the end index: ");
//        int n2 = scan.nextInt();
//        SubArraySum sub = new SubArraySum();
//       int sum= sub.subArraySum(arr,n1,n2);
//        System.out.println("Sum = "+sum);

        //** program to check that the given sum belongs to any start and end index (CheckSubArraySum)
//        System.out.println("Enter the sum value to check: " );
//                 int k =scan.nextInt();
//                 ChecksubArraysum checkSum = new ChecksubArraysum();
//                 checkSum.checkSubArraysum(arr,k);

        //** program to find the union of the two arrays (UnionOfArray)

//        int[] arr1= u.read();
//   UnionOfArray union = new UnionOfArray();
//   union.union(arr,arr1);

        //** program to find the intersection of the array (InterSectionArray)

//        int[] arr1 =u.read();
//        InterSectionOfArray intersection = new InterSectionOfArray();
//        intersection.interSection(arr,arr1);

        // ** program to Rotate the array by one RotateArray
//        RotateArray rArray = new RotateArray();
//        while(true) {
//            arr = rArray.rotateArray(arr);
//            u.print(arr);
//              System.out.println("want to rotate(yes/no): ");
//              String feedback = scan.nextLine();
//              if(feedback.equalsIgnoreCase("no")){
//                  break;
//              }

        //** program to Find missing number
//        FindMissingNumber find  = new FindMissingNumber();
//        List<Integer> list  =  new ArrayList<>(Arrays.asList(6,3,2,1,4));
//       int n =  find.missingNumber(list);
//        System.out.println(n);


        //** program to find duplicate number
        FindDuplicate duplicate = new FindDuplicate();
        duplicate.duplicate(arr);
        }


}
