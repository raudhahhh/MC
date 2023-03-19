public class Examiner {
    private Name examiner;
    private String id;

    public Examiner(Name examiner, String id) {
        this.examiner = examiner;
        this.id = id;
    }

    public Name getExaminer() {
        return examiner;
    }

    public void setExaminer(Name examiner) {
        this.examiner = examiner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
