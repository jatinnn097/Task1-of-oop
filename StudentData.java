package StudentExamScoreLogger;

public class StudentData {
    String studentName;
    int studentId;
    int obtainedMarks;

   public StudentData(String studentName, int studentId, int obtainedMarks) {
       this.studentName = studentName;
       this.studentId = studentId;
       this.obtainedMarks = obtainedMarks;
   }

   public String formatAsCSV() {
       return studentName + "," + studentId + "," + obtainedMarks + System.lineSeparator();
   }

}
