public class Ministry {
    //attribute
    private int year;
    private static String ministryname;
    private DschoolList schoollist;
    private String pic;


    public Ministry(String pic) {
        this.pic = pic;
    }

    public DschoolList getSchoollist() {
        return schoollist;
    }

    public void setSchoollist(DschoolList schoollist) {
        this.schoollist = schoollist;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Examiner getExaminer(int i){
        return examiner
    }


    public String getMinistryname() {
        return ministryname;
    }

    public void setMinistryname(String ministryname) {
        Ministry.ministryname = ministryname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String args[])
    { //application test code
        Ministry.ministryname = "MOE"
        Ministry ministry21 = new Ministry("Julia" );
        ministry21.setMinistryname("Mrs.Adriana");
        ministry21.setYear(2021);
        Ministry ministry22 = new Ministry("Nana" );
        ministry22.setMinistryname("Mrs.Athirawr");
        ministry21.setYear(2022);

        System.out.println("Ministry name for y 2021: "+
                ministry21.getMinistryname());
        System.out.println("Ministry name for y 2022: "+
                ministry22.getMinistryname());


    }

}
