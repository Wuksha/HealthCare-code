package Exams;

import People.Patient;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Exam {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    protected LocalDateTime examTime;
    protected String name;
    protected Patient patient;

    public String getName()
    {
        return this.name;
    }

    public Patient getPatient()
    {
        return this.patient;
    }

    abstract public void doExam(String patientName);
    abstract public void getResults(String patientName);


}
