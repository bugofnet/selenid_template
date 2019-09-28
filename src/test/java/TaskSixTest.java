import base.TestBase;
import helpers.Creds;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.MainPage;
import pages.TaskSix;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class TaskSixTest extends TestBase {
	@Test(groups = {"smoke"})
	@Features("Sign in")
	@Stories("Verify ability to login")
	@TestCaseId("1.1")
	public void simpleSignInTest() {
		MainPage.taskSixButton();
		TaskSix.titleShouldAppear();
		TaskSix.loginButtonIsVisible();
		TaskSix.checkExpectedElements();
		TaskSix.login(Creds.username, Creds.password);

		boolean logoutLinkAppeared = TaskSix.logoutLinkIsVisible();
		Assert.assertTrue(logoutLinkAppeared, "Logout link is not appeared!");
	}

}
