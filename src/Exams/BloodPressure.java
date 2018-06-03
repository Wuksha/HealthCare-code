package Exams;


import People.HealthLogger;
import People.Patient;

import java.time.LocalDateTime;
import java.util.Random;

public class BloodPressure extends Exam {

    private int systolic=0;
    private int distolic=0;
    private int heartbeat=0;
    private Random random;

    public BloodPressure(Patient patient, LocalDateTime examTime)
    {
        this.patient = patient;
        this.name = "Krvni pritisak";
        this.examTime = examTime;
    }

    public void doExam(String patientName)
    {
        Random rand = new Random();
        this.systolic =  rand.nextInt((200 - 100) + 1) + 100;
        this.distolic =  rand.nextInt((this.systolic - (this.systolic-60)) + 1) + this.systolic - 60;
        this.heartbeat =  rand.nextInt((160 - 65) + 1) + 65;

        getResults(patientName);
    }

    public void getResults(String patientName)
    {
        HealthLogger.getInstance().getWriter().println("Analiza: Merenje krvnog pritiska.");
        HealthLogger.getInstance().getWriter().println("Pacijent: \"" + patientName + "\"");
        HealthLogger.getInstance().getWriter().println("Gornji pritisak: " + systolic);
        HealthLogger.getInstance().getWriter().println("Donji pritisak: " + distolic);
        HealthLogger.getInstance().getWriter().println("Puls: " + heartbeat);
        HealthLogger.getInstance().getWriter().println("");
    }
}
