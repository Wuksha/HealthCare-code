package People;

import java.util.ArrayList;
import Exams.Exam;
import Exams.Laboratory;

public class Doctor extends Person {

    private String spec;
    ArrayList<Patient> listOfPatient = new ArrayList<>();

    public Doctor(String name, String lastName, String spec)
    {
        this.name = name;
        this.lastName = lastName;
        this.spec = spec;
        People.HealthLogger.getInstance().createLog("doktor: \"", name, lastName);
    }

    public void setExamForPatient(Exam exam, Laboratory lab)
    {
        lab.addExam(exam);
    }
}
