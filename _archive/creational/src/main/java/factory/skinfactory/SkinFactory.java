package factory.skinfactory;


import factory.button.Button;
import factory.combobox.ComboBox;
import factory.textfield.TextField;

/**
 * @author bsun
 */
public interface SkinFactory {
    Button createButton();
    ComboBox createComboBox();
    TextField createTextField();
}
