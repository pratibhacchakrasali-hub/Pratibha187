package academic.grading;
public class Marks
{
    public static void main(String[] args)
    {
        TotalMarks obj = new TotalMarks(10.0,20.0);
        
        System.out.println("Total Marks = " + obj.Total());
    }
}