package code.gaurav.creational.factory.practical;

public class MacFactory implements IFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox showTextBox() {
        return new MacTextBox();
    }
}
