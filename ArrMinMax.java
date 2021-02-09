import java.util.Scanner;

class ArrMinMax{
public void calArr(int arr[],int n){
    int Min,Max;
    Min = Max = arr[0];
    for(int i = 0; i < n; i++){
     if(Min>arr[i]){
         Min = arr[i];
     }
     else if(Max<arr[i]){
         Max = arr[i];
     }
    }
    System.out.println("Min and Max is "+Min+" & "+Max);
    
}

public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the size of the Array");
    int n = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    int[] arry = new int[50];
    System.out.println("Enter the "+n+" Elements");
    for(int i = 0; i<n; i++){
        arry[i]=sc2.nextInt();
    }
    
    sc1.close();
    sc2.close();
    ArrMinMax mnm = new ArrMinMax();
    mnm.calArr(arry,n); 
}
}