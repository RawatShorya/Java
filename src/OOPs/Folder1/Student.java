package OOPs.Folder1;

public class Student {
    private String id;
    private String name;

    public String getName(){
        return this.name;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
