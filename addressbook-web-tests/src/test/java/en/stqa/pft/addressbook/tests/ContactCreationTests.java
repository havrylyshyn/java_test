package en.stqa.pft.addressbook.tests;

import en.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by Bohdan.Havrylyshyn on 09.06.2017.
 */
public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Igor", "Robotnutskyi", "Borshchagivska st, 97a", "0964451545", "igor4uck@ukr.net"));
        app.getContactHelper().submitContactCreation();
    }
}
