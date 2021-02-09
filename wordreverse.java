import java.util.*;

class wordreverse{
public static void main(String args[]){
   Scanner s=new Scanner(System.in); 
   String str=s.nextLine();    //"I Love India";
    String a[]=str.split(" ");
    s.close();
    for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+" ");
    }
}

}