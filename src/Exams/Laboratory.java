package Exams;

import java.util.ArrayList;

public class Laboratory
{

    public static ArrayList<Exam> listOfExams = new ArrayList<>();

    public void addExam(Exam exam)
    {
        this.listOfExams.add(exam);
    }

    public void doExams()
    {
        for(Exam exam : listOfExams)
        {
            People.HealthLogger.getInstance().doExamLog(exam.getPatient().getName(),exam.getPatient().getLastName(),exam.getName());
            exam.doExam(exam.getPatient().getName() + " " + exam.getPatient().getLastName());
        }
    }

}
