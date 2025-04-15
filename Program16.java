class ClassA{
    int age;
    private int privateAge;
    public int publicAge;
    protected int protectedAge;

    public void AccessAll(int age,int privateAge, int publicAge, int protectedAge){
        this.age = age;
        this.privateAge = privateAge;
        this.publicAge = publicAge;
        this.protectedAge = protectedAge;

        System.out.println("Default Variable value is :"+ this.age);
        System.out.println("Private variable value is: "+ this.privateAge);
        System.out.println("Public variable value is: "+ this.publicAge);
        System.out.println("Protected variable value is: "+ this.protectedAge);
    }
}

class ClassB extends ClassA{

    public void AccessAll(int age,int privateAge, int publicAge, int protectedAge){
        this.age = age;
        // this.privateAge = privateAge;
        this.publicAge = publicAge;
        this.protectedAge = protectedAge;

        System.out.println("Default Variable value is :"+ this.age);
        // System.out.println("Private variable value is: "+ this.privateAge);
        System.out.println("Public variable value is: "+ this.publicAge);
        System.out.println("Protected variable value is: "+ this.protectedAge);
    }
}



public class Program16 {
    public static void main(String[] args) {
        System.out.println("Class A Variables:");
        ClassA obj1 = new ClassA();
        obj1.AccessAll(12,13,14,15);

        System.out.println("------------------------------------");

        System.out.println("Class B Variables");
        ClassB obj2 = new ClassB();
        obj2.AccessAll(122,133,144,155);
    }
}
