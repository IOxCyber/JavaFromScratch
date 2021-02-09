import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        //Only Store Strings
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Saransh");
        list1.add("Chauhan");
        list1.add("Student");
        System.out.println("===========List1============");
        System.out.println(list1);
        System.out.println( );
        //Genaric Type list to store Any Type Values
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(10);
        list2.add("AnyType Data");
        System.out.println("============List2=============");
        System.out.println(list2);

        //using Object type storing any data 
        List<Object> objectList = new ArrayList<Object>();
        objectList.add(87);
        objectList.add("You are Good");
        objectList.add(76.50);
        System.out.println("======list3=======");
        System.out.println(objectList);
        
        //Get the Element
        String name = list1.get(1);
        System.out.println("Name is "+name);
         
        //Update
        list1.set(2, "Kumar");
        System.out.println("After updatation "+list1);
        if(list1.contains("Student")){
            System.out.println("Student is in the List");
        }

        System.out.println("=====Iteration=====");
        //Iterator
        for(String str : list1){
            System.out.println(str);
        }

        System.out.println("=====Using Iterator=====");
        //Iterator with Itertor
        Iterator<String> itr = list1.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        

    }
}