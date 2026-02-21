public class macFactory implements GUIFactory
{
    
    public Button createButton()
    {
        return new macButton();
    }
    
    public checkBox createCheckbox()
    {
        return new macCheckBox();
    }
}
