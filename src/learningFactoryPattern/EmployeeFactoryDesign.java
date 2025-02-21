package learningFactoryPattern;

public class EmployeeFactoryDesign {
    public static Employee getEmployee(String EmpType){
        if (EmpType.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        } else if (EmpType.trim().equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper() ;
        }
        else {
            return null;
        }
    }
}
