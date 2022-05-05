package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BugReportElements {

    public static SelenideElement createBugReportButton = $x("//a[@id='create_link']");
    public static SelenideElement issueType = $x("//div[@id='issuetype-single-select']");
    public static SelenideElement summaryInput = $x("//input[@id = 'summary']");

    public static SelenideElement versionA = $x("(//option[@value = '10001'])[1]");
    public static SelenideElement versionB = $x("(//option[@value = '10001'])[2]");

    public static SelenideElement assignOnMe = $x(" //button[contains(text(),'Назначить меня')]");
    public static SelenideElement createIssueSubmit = $x("//input[@id = 'create-issue-submit']");
    public static SelenideElement tasksHref = $x("//a[@id='find_link']");
    public static SelenideElement reportedByMeTasks = $x(" //a[@id='filter_lnk_reported_lnk']");
    public static SelenideElement needToDoStatus = $x("(//span[@class='trigger-label'])[4]");
    public static SelenideElement inWorkStatus = $x("(//span[@class='trigger-label'])[5]");
    public static SelenideElement closedStatusDropdown = $x("( //span[@class='dropdown-text'])[2]");
    public static SelenideElement closedStatus= $x("(//aui-item-link[@class='issueaction-workflow-transition'])[1]");


    // public static SelenideElement iframe = $x("//iframe[@id='mce_0_ifr']");
    // public static SelenideElement iframe = $x("//div[@class='tox tox-tinymce jira-editor-container']");
    public static SelenideElement description = $x("//textarea[@id='description']");
    public static SelenideElement descriptionTxtButton= $x("(//button[@class='aui-button' and @aria-pressed='true'])[1]");



}
