
class MyClass {
  private int i;
  private int j;

  public MyClass(int i, int j) {
    this.i = i;
    this.j = j;
  }

  public int getI() {
    return i;
  }

  public int getJ() {
    return j;
  }

  public static MyClass addObjects(MyClass obj1, MyClass obj2) {
    int sumI = obj1.getI() + obj2.getI();
    int sumJ = obj1.getJ() + obj2.getJ();
    return new MyClass(sumI, sumJ);
  }

  public void display() {
    System.out.println("i: " + i + ",j: " + j);
  }
}

class Program15{
  public static void main(String[] args) {
    MyClass obj1 = new MyClass(5,10);
    MyClass obj2 = new MyClass(15,20);
  
    MyClass obj3 = MyClass.addObjects(obj1, obj2);
  
    System.out.println("Result stored in obj3:");
  obj3.display();
  }
  
}
