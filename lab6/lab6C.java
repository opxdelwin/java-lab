import java.util.*;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours! Hours should be between 0 and 24");
        }
        
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes! Minutes should be between 0 and 60");
        }
        
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds! Seconds should be between 0 and 60");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

public class lab6C {
    public static void main(String[] args) {
        Time time = new Time();
        
        try {
            time.setTime(25, 45, 30);  
            time.displayTime();
        } catch (HrsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            time.setTime(12, 61, 30);  
            time.displayTime();
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}