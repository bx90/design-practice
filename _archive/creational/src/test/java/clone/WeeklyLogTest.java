package clone;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author bsun
 */
public class WeeklyLogTest {
    @Test
    public void cloneTest() throws IOException, ClassNotFoundException, CloneNotSupportedException {
        WeeklyLog oldLog = new WeeklyLog();
        oldLog.setA("A");
        oldLog.setName("Name");
        oldLog.setButton(() -> {
            return;
        });

//
//        WeeklyLog newLog = oldLog.deepClone();
//        System.out.println(newLog.toString() + "\n" + oldLog.toString());
//        System.out.println(newLog.getA() + newLog.getName());


//        WeeklyLog anotherNewLog = newLog.clone();
//        System.out.println(newLog.toString() + "\n" + anotherNewLog.toString());
//        System.out.println(anotherNewLog == newLog);
//        System.out.println(anotherNewLog.getButton() == newLog.getButton());


        WeeklyLog anotherNewLog =oldLog.clone();
        System.out.println(oldLog.toString() + "\n" + anotherNewLog.toString());
        System.out.println(anotherNewLog == oldLog);
        System.out.println(anotherNewLog.getButton() == oldLog.getButton());

    }
}
