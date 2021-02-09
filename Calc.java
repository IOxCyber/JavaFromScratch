class Sum{
public void add(int a,int b){

 int sum=a+b;
System.out.println("sum="+sum);
}
/*public static void sub(int a,int b){
    int sub=a-b;
    System.out.println("subtraction="+sub);
}*/
}


class Calc{
public static void main(String[] args) {
  Sum sm= new Sum();
  sm.add(45,6);
  //sm.sub(45,6);
} 
}