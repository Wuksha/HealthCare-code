package People;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HealthLogger
{
    PrintWriter writer;

    private static HealthLogger instance = null;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    private HealthLogger()
    {
        try {
            writer = new PrintWriter("Health Logger.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static HealthLogger getInstance()
    {
        if (instance == null)
        {
            instance = new HealthLogger();
        }
        return instance;
    }

    public void chooseLog(String patientName, String patientLastName, String docName, String docLastName)
    {
        now = LocalDateTime.now();
        writer.println("[" + dtf.format(now) + "] " + "Pacijent: \"" + patientName  + " " + patientLastName + "\" je izabrao/la lekara: \"" + docName + " " + docLastName + "\"");
    }

    public void createLog(String who, String name, String lastName)
    {
        now = LocalDateTime.now();
        writer.println("[" + dtf.format(now) + "] " + "Kreiran " + who + name + " " + lastName + "\"");
    }

    public void doExamLog(String patientName, String patientLastName, String examName)
    {
        now = LocalDateTime.now();
        writer.println("");
        writer.println("[" + dtf.format(now) + "] " + "Pacijent: \"" + patientName + " " + patientLastName + "\" odradio pregled: " + examName + ".");
    }

    public PrintWriter getWriter() {
        return writer;
    }

    public void closeFile()
    {
        writer.close();
    }
}
