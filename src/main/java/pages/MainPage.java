package pages;

import base.PageBase;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

public class MainPage extends PageBase {
	private static final String TITLE = "Welcome!";

	private static final By TASKSIX_BUTTON = get("MainPage.TaskSixButton");

	public static void taskSixButton() {
		$(TASKSIX_BUTTON).click();
	}

	public static void titleShouldAppear() {
		titleShouldAppear(TITLE);
	}

	public static boolean taskSixButtonIsVisible() {
		return $(TASKSIX_BUTTON).isDisplayed();
	}

	public static void checkExpectedElements() {
		checkExpectedElements(TASKSIX_BUTTON);
	}
}
