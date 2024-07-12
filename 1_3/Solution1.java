/**
 * Solution 1
 * Using 3 arrays
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println("STUDENT MARKS APP (SOLUTION 1)");

        // String[] row1 = { "Jane", "40", "20" };
        //                   "Jane", 40.00, 20.00

        String[] studentNames  = { "Jane", "Jon", "Stewart" };
        double[] mathGrades    = { 40, 70.5, 80 };
        double[] physicsGrades = { 20, 60, 75 };

        System.out.format(
            "%-20s %10s %10s%n",
            "STUDENT", "MATH", "PHYSICS"
        );
        
        for (int i = 0; i < studentNames.length; i++) {
            System.out.format(
                "%-20s      %2.2f      %2.2f%n",
                studentNames[i], mathGrades[i], physicsGrades[i]
            );
        }
    }    
}