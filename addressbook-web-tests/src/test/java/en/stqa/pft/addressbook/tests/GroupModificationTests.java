package en.stqa.pft.addressbook.tests;

import en.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by Bohdan.Havrylyshyn on 06.06.2017.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
