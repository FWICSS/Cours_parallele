import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HorlogeThread extends Thread{
    private int format;

    private int time;

    public HorlogeThread(int type,int t) {
      format = type;
      time = t*1000;
    }
    public void run() {
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        while (format==1) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(dtf2.format(LocalDateTime.now()));
        }
        while (format==2){
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(dtf3.format(LocalDateTime.now()));
        }
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
