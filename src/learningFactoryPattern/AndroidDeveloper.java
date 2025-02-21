package learningFactoryPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Android developer salary");
        return 500000;
    }
}
