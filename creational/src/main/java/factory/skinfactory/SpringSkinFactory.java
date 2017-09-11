package factory.skinfactory;


import factory.button.Button;
import factory.button.SpringButton;
import factory.combobox.ComboBox;
import factory.combobox.SpringComboBox;
import factory.textfield.SpringTextField;
import factory.textfield.TextField;

/**
 * @author bsun
 */
public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
