package week2;

class Person
{
    String name;
    int age;

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Question1
{
    public static void main(String[] args) {
        Person person=new Person("Kirtidas",21);
        person.display();


    }
}
