public class Person{
  private String name;
  private int age;
  public Person(){
    name = "Thomas";
    age = 16;
  }
  public Person(String n, int a){
    name = n;
    age = a;
}
class Employee extends Person{
  private String department;
  private int id;
  public Employee(){
    department = "returns";
    id = 0011;
  }
  public Employee(String theName){
    super(theName);
    department = "returns";
    id = 0011;
  }
  public Employee(String theName, int theAge, String department){
    super(theName);
    super(theAge);
    department = this.department;
    id = 0011;
  }
}
