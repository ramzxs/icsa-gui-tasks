public class StudentMark {
    String student;
    float gradeMath;
    float gradePhysics;

    // CONSTRUCTOR
    public StudentMark(String s) {
        this.student = s;
    }

    public StudentMark(String s, float m) {
        this.student = s;
        this.gradeMath = m;
    }

    public StudentMark(String s, float m, float p) {
        this.student = s;
        this.gradeMath = m;
        this.gradePhysics = p;
    }
}
