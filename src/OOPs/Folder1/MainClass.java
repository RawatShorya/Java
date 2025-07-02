package OOPs.Folder1;

public class MainClass {
    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            Student student1 = new Student("Student" + i,
                    switch (i) {
                        case 1 -> "Shivam";
                        case 2 -> "Chotu";
                        default -> "Default" + i;
                    });
            RecordStudent student2 = new RecordStudent("Student" + i,
                    switch (i) {
                        case 1 -> "Shivam";
                        case 2 -> "Chotu";
                        default -> "Default" + i;
                    });
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student1.getName());
            System.out.println(student2.name());
        }
    }
}