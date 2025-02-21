package learningFactoryPattern;

public class WebDeveloper implements Employee {
    @Override
    public int Salary() {
        System.out.println("web developer salary");
        return 400000;
    }
}
