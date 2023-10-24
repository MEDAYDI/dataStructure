
public class Main{

    public static void main(String[] args){

        DynamicArray dynamicArray=new DynamicArray();

        dynamicArray.add("A"); 
        dynamicArray.add("B");       
        dynamicArray.add("C");

 
        dynamicArray.insert(0,"X");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));
        System.out.println(dynamicArray);

        
    }
}