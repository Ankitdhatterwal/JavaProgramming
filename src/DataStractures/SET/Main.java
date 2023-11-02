package DataStractures.SET;

import DataStractures.LIst.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperationsSet op= new OperationsSet();
       Scanner scan = new Scanner(System.in);
       int arr[] = {1,2,3,4,5,6,5,6,7,8};

        op.operations(arr);
    }
}
