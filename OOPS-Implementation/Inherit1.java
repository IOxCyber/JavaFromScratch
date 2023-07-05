class Parent{

    public void smile(){
        System.out.println("I smile like Father.");
    } 
    
}

class Child extends Parent{
    //Constractor will always called.
    Child(){
        System.out.println("I am from Child Constractor");
    } 
    @Override
    public void smile(){
        System.out.println("I smile like Baby.");
    }
    public void show(){
        System.out.println("In Child Class.");
    }
}

public class Inherit1{
    public static void main(String[] args) {
        Parent p = new Child(); 
        p.smile(); //If Not Override by Child class then Print ::I smile like Father:: else OVERRIDE method.

         System.out.println("=========================================================================================================================================");
       
       //Child c = new Parent(); //NOT POSSIBLE IN JAVA EXPLICIT TYPECASTING
       
    }
}