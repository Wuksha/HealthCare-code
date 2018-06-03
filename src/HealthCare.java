import Exams.BloodPressure;
import Exams.Laboratory;
import Exams.SugarLevel;
import People.Doctor;
import People.HealthLogger;
import People.Patient;

import java.time.LocalDateTime;

public class HealthCare {


    public static void main(String[] args)
    {
        Laboratory firstLab = new Laboratory();
        Doctor milan = new Doctor("Milan", "Milanovic", "Kardiolog");
        Patient dragan = new Patient("Dragan", "Dragic", "2910995880001");
        dragan.chooseDoc(milan);
        milan.setExamForPatient(new BloodPressure(dragan, LocalDateTime.now().plusHours(5)), firstLab);
        milan.setExamForPatient(new SugarLevel(dragan, LocalDateTime.now().plusDays(11)), firstLab);
        firstLab.doExams();
        HealthLogger.getInstance().closeFile();
    }
}
