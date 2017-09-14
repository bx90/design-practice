package clone;

import factory.button.Button;

import java.io.*;

/**
 * @author bsun
 */
public class WeeklyLog implements Serializable, Cloneable {
    String name;

    public String getName() {
        return name;
    }

    public WeeklyLog setName(String name) {
        this.name = name;
        return this;
    }

    public String getA() {
        return a;
    }

    public WeeklyLog setA(String a) {
        this.a = a;
        return this;
    }

    String a;

    public Button getButton() {
        return button;
    }

    public WeeklyLog setButton(Button button) {
        this.button = button;
        return this;
    }

    Button button;

    public WeeklyLog clone() throws CloneNotSupportedException {
        Object obj = null;
        obj = super.clone();
        return (WeeklyLog) obj;
    }

    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog) ois.readObject();
    }
}
