public class Student {
    private String studName;
    private String id;
    private Marks marks;
    //class constructor
    public Student(String studName, String id, Marks marks, String className) {
        this.studName = studName;
        this.id = id;
        this.marks = marks;
        this.className = className;
    }

    public String getStudName(){
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private String className;

    @Override
    public String toString() {
        return  studName + ", " + id + ", " + marks + ", " +className ;
    }
}
