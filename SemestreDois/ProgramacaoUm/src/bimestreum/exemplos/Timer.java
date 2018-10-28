package exemplos;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Timer {
    public static void main(String[] args) {

        do {

            String tempo = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS").format(Calendar.getInstance().getTime());
            System.out.println(tempo);

            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (true);
    }
}
