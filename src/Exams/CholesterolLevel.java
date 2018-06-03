package Exams;

import People.HealthLogger;
import People.Patient;

import java.time.LocalDateTime;
import java.util.Random;

public class CholesterolLevel extends Exam {

    private LocalDateTime lastMeal;
    private double cholesterolLevel;

    public CholesterolLevel(Patient patient, LocalDateTime examTime)
    {
        this.patient = patient;
        this.name = "Nivo holesterola u krvi";
        this.examTime = examTime;
    }

    public void doExam(String patientName)
    {
        Random rand = new Random();
        this.lastMeal = LocalDateTime.now().minusHours(6);
        this.cholesterolLevel =  140 + (220 - 140) * rand.nextDouble();
        getResults(patientName);
    }

    public void getResults(String patientName)
    {
        HealthLogger.getInstance().getWriter().println("Analiza: Merenje nivoa secera u krvi.");
        HealthLogger.getInstance().getWriter().println("Pacijent: \"" + patientName + "\"");
        HealthLogger.getInstance().getWriter().println("Nivo secera: " + cholesterolLevel + " mg/dL");
        HealthLogger.getInstance().getWriter().println("Vreme poslednjeg obroka: " + dtf.format(lastMeal));
        HealthLogger.getInstance().getWriter().println("");
    }
}
