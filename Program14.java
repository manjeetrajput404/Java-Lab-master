class MyObject {  
    static int count = 0;  

    MyObject() {  
        count++;
        System.out.println("The total objects created are: " + MyObject.count);  
    }
}

class Main {  
    public static void main(String[] args) {  
        MyObject obj1 = new MyObject(); 
        MyObject obj2 = new MyObject();  
        MyObject obj3 = new MyObject();  
    }  
}

//output
// The total objects created are: 1
// The total objects created are: 2
// The total objects created are: 3
