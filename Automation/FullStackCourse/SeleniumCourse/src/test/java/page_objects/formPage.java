package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class formPage
{
    @FindBy(how = How.ID, using = "occupation")
    public WebElement occupation;

    @FindBy(how = How.ID, using = "age")
    public WebElement age;

    @FindBy(how = How.ID, using = "location")
    public WebElement location ;

    @FindBy(how = How.CSS, using = "input[value='Click Me']")
    public WebElement clickMe ;

    public void formAction(String sOccupation, String sAge, String slocation)
    {
        occupation.sendKeys(sOccupation);
        age.sendKeys(sAge);
        location.sendKeys(slocation);
        clickMe.click();
    }
}
