//import com.example.mathcompetencysurvey.DschoolList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of data: ");
        int numdata = scanner.nextInt();

        Marks marks = new Marks(numdata);
        marks.createData();
        PrincipalName principalName = new PrincipalName("Micheal", "Jackson");
        Address address = new Address("No 999, Jalan Leicester", "31620", "Kuala Terengganu", "Terengganu");
        School school = new School("Sk Raudah",address,principalName,marks);

        Marks mark = new Marks(100);
        Student student = new Student("ainul", "ain21001745", mark, "5 Nilam");
       // DschoolList moelist = new DschoolList();

        school.setNumberParticipants();
        // we want a class that being able to read a file like this
        /*Fileloader fl = new Fileloader("filename.txt");
        fl.readAndDisplay();
       /* System.out.println(school.toString());
        System.out.printf("Average Score     : %.2f",marks.average());
        System.out.printf("\nStandard Deviation: %.2f\n",marks.stanDev(marks.average()));
        System.out.printf(student.toString());*/

        // we want a facade class
    }
}
