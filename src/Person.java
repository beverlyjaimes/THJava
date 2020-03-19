public class Person {
    private String name;

    public Person(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    private void setName(String name) {
        this.name = name;

    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("James");
        System.out.println(person1.getName());
        person1.setName("James");
        person1.sayHello();
    }

}

