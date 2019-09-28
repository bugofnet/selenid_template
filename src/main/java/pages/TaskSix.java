package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

public class TaskSix extends PageBase{
	private static final String TITLE = "Welcome!";

	private static final By USERNAME_INPUT = get("TaskSix.UsernameInput");
	private static final By PASSWORD_INPUT = get("TaskSix.PasswordInput");
	private static final By LOGIN_BUTTON = get("TaskSix.LoginButton");
	private static final By LOGOUT_LINK = get("TaskSix.LogoutLink");


	public static void login(String username, String password) {
		$(USERNAME_INPUT).val(username);
		$(PASSWORD_INPUT).val(password);
		$(LOGIN_BUTTON).click();
	}

	public static boolean loginButtonIsVisible() {
		return $(LOGIN_BUTTON).isDisplayed();
	}

	public static void checkExpectedElements() {
		checkExpectedElements(USERNAME_INPUT, PASSWORD_INPUT, LOGIN_BUTTON);
	}

	public static void titleShouldAppear() {
		titleShouldAppear(TITLE);
	}

	public static boolean logoutLinkIsVisible() {
		return $(LOGOUT_LINK).isDisplayed();
	}
}
