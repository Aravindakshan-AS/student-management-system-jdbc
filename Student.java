
public class Student {
	private int id;
    private String name;
    private int age;
    private String course;
    private String grade;

    public Student(int id, String name, int age, String course, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public Student(String name, int age, String course, String grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + course + " | " + grade;
    }
}
