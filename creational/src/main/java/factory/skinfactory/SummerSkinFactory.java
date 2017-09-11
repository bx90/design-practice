package factory.skinfactory;


import factory.button.Button;
import factory.button.SummerButton;
import factory.combobox.ComboBox;
import factory.combobox.SummerComboBox;
import factory.textfield.SummerTextField;
import factory.textfield.TextField;

/**
 * @author bsun
 */
public class SummerSkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
