package factory;

import factory.button.Button;
import factory.combobox.ComboBox;
import factory.skinfactory.SkinFactory;
import factory.skinfactory.SpringSkinFactory;
import factory.textfield.TextField;
import org.testng.annotations.Test;

/**
 * @author bsun
 */
public class factoryTest {
    @Test
    public void test() {
        SkinFactory skinFactory;
        Button button;
        TextField textField;
        ComboBox comboBox;

        skinFactory = new SpringSkinFactory();
        button = skinFactory.createButton();
        comboBox = skinFactory.createComboBox();
        textField = skinFactory.createTextField();

        button.display();
        comboBox.display();
        textField.display();
    }
}
