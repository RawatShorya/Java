package Collections.Equals;

public class OverrideEquals {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object e){
            if (this == e) return true;
            if (e == null || getClass() != e.getClass()) return false;

            Person person = (Person) e;
            return age == person.age && name.equals(person.name);
        }
    }

    public static void main(String[] args) {
        OverrideEquals.Person p1 = new OverrideEquals.Person("Alice", 25);
        OverrideEquals.Person p2 = new OverrideEquals.Person("Alice", 25);
        System.out.println(p1.equals(p2));
    }
}
