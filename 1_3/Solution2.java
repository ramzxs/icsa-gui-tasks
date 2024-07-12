public class Solution2 {
    public static void main(String[] args) {
        System.out.println("STUDENT MARKS APP (SOLUTION 2)");

        String[] studentNames  = { "Jane", "Jon", "Stewart" };

        // Two-Dimensional Array
        double[][] grades = {
            { 40, 20 },
            { 70, 60},
            { 80, 75}
        };

        // String[][][] array3D = {
        //     {
        //         {"x1", "y1", "z1"}
        //     },
        //     {
        //         {"x2", "y2", "z2"}
        //     }
        // };

        // grades[0] = { 40, 20 };
        // grades[1] = { 70, 60};
        // grades[2] = { 80, 75};

        // grades[0][0] = 40;
        // grades[0][1] = 20;

        // grades[1][0] = 70;
        // grades[1][1] = 60;

        // grades[2][0] = 80;
        // grades[2][1] = 75;

        System.out.format(
            "%-20s %10s %10s%n",
            "STUDENT", "MATH", "PHYSICS"
        );
        
        for (int i = 0; i < studentNames.length; i++) {
            System.out.format(
                "%-20s      %2.2f      %2.2f%n",
                studentNames[i], grades[i][0], grades[i][1]
            );
        }            
    }
}
