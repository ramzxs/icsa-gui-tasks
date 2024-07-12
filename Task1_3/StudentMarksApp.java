public class StudentMarksApp {
    public static void main(String[] args) {
        System.out.println("STUDENT MARKS APP (SOLUTION 3)");

        // OOP
        StudentMark[] marks = {
            new StudentMark("Jane", 40, 20),
            new StudentMark("Jon", 70, 60),
            new StudentMark("Stewart", 80, 75)
        };
        
        /* StudentMark[] marks = new StudentMark[3];
        marks[0] = new StudentMark("Jane", 40, 20);
        marks[1] = new StudentMark("Jon", 70, 60);
        marks[2] = new StudentMark("Stewart", 80, 75); */

        System.out.format(
                "%-20s %10s %10s%n",
                "STUDENT", "MATH", "PHYSICS");

        for (int i = 0; i < marks.length; i++) {
            System.out.format(
                    "%-20s      %2.2f      %2.2f%n",
                    marks[i].student,
                    marks[i].gradeMath,
                    marks[i].gradePhysics);
        }
    }
}
