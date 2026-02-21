public class windowFactory implements GUIFactory
{
    public Button createButton()
    {
        return new windowButton();
    }

    public checkBox createCheckbox()
    {
        return new windowCheckBox();
    }
}
