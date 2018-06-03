package People;

import java.util.ArrayList;
import Exams.Exam;

public class Patient extends Person
{

    private String jmbg;
    private Doctor choosenOne;
    public static int i = 0;
    private int cartonNmb;



    public Patient(String name, String lastName, String jmbg)
    {
        i+=1;
        this.name = name;
        this.lastName = lastName;
        this.jmbg = jmbg;
        this.cartonNmb = i;
        People.HealthLogger.getInstance().createLog("pacijent: \"", name, lastName);
    }

    public void chooseDoc(Doctor doc)
    {
        doc.listOfPatient.add(this);
        this.choosenOne= doc;
        People.HealthLogger.getInstance().chooseLog(this.name, this.lastName, doc.getName(), doc.getLastName());
    }


}
