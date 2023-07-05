class Encap2{
private int num;

//Private variable is set by public setter method from main Method. 
public void setter(int num){
    this.num=num;
}

//Private variable is get by publicn getter method from main method. 
public int getter(){
     return this.num;
}
public static void main(String[] args) {
    Encap2 en = new Encap2();
    en.setter(50);
    System.out.println("Value is Setted As "+en.getter());
}
}