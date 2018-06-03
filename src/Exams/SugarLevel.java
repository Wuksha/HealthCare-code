package Exams;

import People.HealthLogger;
import People.Patient;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Random;

public class SugarLevel extends Exam {

    private LocalDateTime lastMeal;
    private double sugarLevel;

    public SugarLevel(Patient patient, LocalDateTime examTime)
    {
        this.patient = patient;
        this.name = "Nivo secera u krvi";
        this.examTime = examTime;
    }



    public void doExam(String patientName)
    {
        Random rand = new Random();
        this.lastMeal = LocalDateTime.now().minusHours(8);
        this.sugarLevel = 3.5 + (6.5 - 3.5) * rand.nextDouble();
        getResults(patientName);
    }

    public void getResults(String patientName)
    {
        NumberFormat formatter = new DecimalFormat("#.##");
        HealthLogger.getInstance().getWriter().println("Analiza: Merenje nivoa secera u krvi.");
        HealthLogger.getInstance().getWriter().println("Pacijent: \"" + patientName + "\"");
        HealthLogger.getInstance().getWriter().println("Nivo secera: " + formatter.format(sugarLevel) + " mmol/L");
        HealthLogger.getInstance().getWriter().println("Vreme poslednjeg obroka: " + dtf.format(lastMeal));
        HealthLogger.getInstance().getWriter().println("");
    }
}
