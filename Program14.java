class MyObject {  
    static int count = 0;  

    MyObject() {  
        count++;
    }
}

public class Main {  
    public static void main(String[] args) {  
        MyObject obj1 = new MyObject(); 
        System.out.println("The total objects created are: " + MyObject.count);  
        MyObject obj2 = new MyObject();  
        System.out.println("The total objects created are: " + MyObject.count);  
        MyObject obj3 = new MyObject();  
        System.out.println("The total objects created are: " + MyObject.count);  
    }  
}

//output
// The total objects created are: 1
// The total objects created are: 2
// The total objects created are: 3
