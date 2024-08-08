public class Program {

   
    public static class Person {
       
        int age = 16;
        String name = "Tanish";

        
        public void printAge() {
            System.out.println("Age: " + age);
        }

        
        public void makeOlder() {
            age += 1;
        }

        
        public void makeYounger() {
            age -= 1;
        }

       
        public void setAge(int newAge) {
            age = newAge;
        }

       
        public void setAgeAndName(int newAge, String newName) {
            age = newAge;
            name = newName;
        }

       
        public int getAge() {
            return age;
        }
    }

  
    public static void main(String[] args) {
       
        Person person = new Person();

       
        person.printAge();

       
        person.makeOlder();
        
        person.printAge();

       
        person.setAge(20);
        System.out.println("New age set to: " + person.getAge());

      
        person.setAgeAndName(25, "Keyaan");
        System.out.println("New age set to: " + person.getAge());

       
        System.out.println("Final age: " + person.getAge());
    }
}
