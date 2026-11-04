package academic.grading;
public class TotalMarks
{
    double marks1;
    double marks2; 

    public TotalMarks(double m1,double m2)
    {
        marks1 = m1;
        marks2 = m2;
    }

    public double Total()
    { 
        double result = marks1 + marks2;
        return result;
    }
    
}