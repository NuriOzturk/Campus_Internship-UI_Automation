package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

import java.util.List;

public class DialogContent extends ReusableMethods {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement usernameField;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement passwordField;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()=' Welcome, Student_4 11A ! ']")
    public WebElement loginCheck;

    @FindBy(xpath = "//div[text()='Invalid username or password']")
    public WebElement invalidMessage;

    @FindBy(xpath = "//span[@class='title dialog-title']")
    public WebElement dcTitle;

    @FindBy(xpath = "(//div/button)[8]")
    public WebElement previousButton;

    @FindBy(xpath = "(//div/button)[9]")
    public WebElement todayButton;

    @FindBy(xpath = "(//div/button)[10]")
    public WebElement nextButton;

    @FindBy(css = "div[fxlayout='row'] h4 strong")
    public WebElement dateCheck;

    @FindBy(xpath = "(//table)[1]")
    public WebElement weeklyPlanTableCheck;

    @FindBy(xpath = "//*[text()=' P ']")
    public WebElement publishedIcon;

    @FindBy(xpath = "//*[text()=' Published ']")
    public WebElement publishedDescription;

    @FindBy(xpath = "//*[text()=' S ']")
    public WebElement startedIcon;

    @FindBy(xpath = "//*[text()=' Started ']")
    public WebElement startedDescription;

    @FindBy(xpath = "//*[text()=' E ']")
    public WebElement endedIcon;

    @FindBy(xpath = "//*[text()=' Ended ']")
    public WebElement endedDescription;

    @FindBy(xpath = "//*[text()=' C ']")
    public WebElement cancelledIcon;

    @FindBy(xpath = "//*[text()=' Cancelled ']")
    public WebElement cancelledDescription;

    @FindBy(xpath = "//*[contains(text(),' Weekly Course Plan ')]")
    public WebElement weeklyCoursePlanButton;

    @FindBy(xpath = "(//*[text()=' Calendar '])[2]")
    public WebElement calendarPageButton;

    @FindBy(xpath = "//table[@role='grid']")
    public WebElement calendarTableCheck;

    @FindBy(xpath = "(//td/div//span[contains(text(),'11A')])[1]")
    public WebElement lessonsButton;

    @FindBy(xpath = "//mat-panel-description[@class='mat-expansion-panel-header-description']")
    public WebElement lessonMessage;

    @FindBy(xpath = "//span[@class='mat-badge-content mat-badge-active'][text()='E']")
    public List<WebElement> endedLessonIcons;

    @FindBy(xpath = "//span[@class='mat-badge-content mat-badge-active'][text()='P']")
    public List<WebElement> publishedLessonIcons;

    @FindBy(xpath = "//span[@class='mat-badge-content mat-badge-active'][text()='S']")
    public List<WebElement> startedLessonIcons;

    @FindBy(xpath = "//span[@class='mat-badge-content mat-badge-active'][text()='C']")
    public List<WebElement> cancelledLessonIcons;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement lessonName;

    @FindBy(xpath = " //tbody//td[text()=' Teacher_5 T5' ]")
    public WebElement instructorName;

    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix'])[5]")
    public WebElement lessonDate;

    @FindBy(xpath = "//span[contains(text(),'Topic')]")
    public WebElement topicButton;

    @FindBy(xpath = "//span[contains(text(),'Information')]")
    public WebElement informationButton;

    @FindBy(xpath = "(//span[contains(text(),'Attachments')])[1]")
    public WebElement attachmentsButton;

    @FindBy(xpath = "//span[contains(text(),'Recent Events')]")
    public WebElement recentEventsButton;

    @FindBy(xpath = "//*[@formcontrolname='period']")
    public WebElement lessonPeriod;

    @FindBy(xpath = "//span[text()='Recording']")
    public WebElement recordingButton;

    @FindBy(xpath = "//button[@title='Play Video']")
    public WebElement playVideoButton;

    @FindBy(xpath = "(//button[@aria-label='Close dialog'])[2]")
    public WebElement videoCloseButton;

    @FindBy(tagName = "iframe")
    public WebElement videoIframe;

    @FindBy(xpath = "//*[contains(text(),'not been started')]")
    public WebElement lessonMessageNotStarted;

    @FindBy(xpath = "(//div//mat-error)[1]")
    public WebElement emailRequiredMessage;

    @FindBy(xpath = "(//div//mat-error)[2]")
    public WebElement passwordRequiredMessage;

    @FindBy(xpath = "(//button[@matbadgesize='medium'])[2]")
    public WebElement receiversButton;

    @FindBy(xpath = "(//*[text()='User'])[10]")
    public WebElement receiversCheckbox;

    @FindBy(xpath = "//span[text()='Add & Close']")
    public WebElement addAndCloseButton;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement subjectInput;

    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    public WebElement messageTextIframe;

    @FindBy(xpath = "//span[text()='Attach Files...']")
    public WebElement attachInput;

    @FindBy(xpath = "//*[contains(text(),'From My Files')]")
    public WebElement fromMyFiles;

    @FindBy(xpath = "(//*[text()=' Info '])[1]")
    public WebElement selectMessageButton;

    @FindBy(xpath = "//*[text()='Move to Trash']")
    public WebElement moveToTrashButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement yesButton;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement messageTextBody;

    @FindBy(xpath = "//span[text()='Send']")
    public WebElement sendButton;

    @FindBy(xpath = "(//*[@icon='trash-restore'])[1]")
    public WebElement restoreButton;

    @FindBy(xpath = "//span[contains(text(), 'Pay in full')]")
    public WebElement payInFullButton;

    @FindBy(xpath = "//span[contains(text(), 'Create Installment')]")
    public WebElement createInstallmentButton;

    @FindBy(xpath = "//span[text()= 'Pay']")
    public WebElement payButton;

    @FindBy(xpath = "//ms-button[@icon='wallet']/button")
    public WebElement paymentButton;

    @FindBy(xpath = " //h2[text()=' Pay  $ '] ")
    public WebElement cardPaymentTitle;

    @FindBy(id = "Field-numberInput")
    public WebElement cardNumberInput;

    @FindBy(xpath = "//div[@class='StripeElement']/following-sibling::button")
    public WebElement paymentsButton;

    @FindBy(xpath = "//div[contains(text(), 'Payment successfully created')]")
    public WebElement paymentSuccessMessage;

    @FindBy(xpath = "//tfoot[@role='rowgroup']/tr[1]/td[9]")
    public WebElement totalBalance;

    @FindBy(xpath = "//span[text()=' Students Fees ']")
    public WebElement studentFees;

    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr)[1]")
    public WebElement processingPayment;

    @FindBy(xpath = "//span[contains(text(),'Student Fee')]")
    public WebElement studentFee;

    @FindBy(xpath = "//label[text()='Stripe ']")
    public WebElement stripe;

    @FindBy(xpath = "//input[@placeholder='Amount']")
    public WebElement amountField;

    @FindBy(xpath = "//div[@class='p-HeightObserverProvider']")
    public WebElement creditCardField;

    @FindBy(xpath = "//iframe[@title='Secure payment input frame']")
    public WebElement paymentIframe;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[23]")
    public WebElement threeDotButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[1]")
    public WebElement excelDownload;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement pdfDownload;

    @FindBy(xpath = "//span[text()=' New Installment Plans']")
    public WebElement newInstallmentPlansPageTitle;

    @FindBy(xpath = "//span[@class='mdc-tab__text-label' and contains(., 'Course Grade')]")
    public WebElement courseGradeButton;

    @FindBy(xpath = "//*[@id='ms-standard-button-0']/button")
    public WebElement printIcon;

    @FindBy(xpath = "//button[.//fa-icon/svg[@data-icon='print']]")
    public WebElement downloadIcon;

    @FindBy(xpath = "//span[text()='Student Transcript']")
    public WebElement studentTranscript;

    @FindBy(xpath = "//span[text()='Transcript by Subject']")
    public WebElement transcriptBySubject;

    @FindBy(xpath = "(//div[@class='mat-mdc-select-value'])[3]")
    public WebElement semesterButton;

    @FindBy(xpath = "(//span[contains(text(),'All')])[2]")
    public WebElement allButton;

    @FindBy(xpath = "//span[text()='Save as Draft']")
    public WebElement saveAsDraftButton;

    @FindBy(xpath = "//*[text()='Course']")
    public WebElement courseButton;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement statusButton;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Default View']")
    public WebElement defaultViewButton;

    @FindBy(xpath = "//span[text()='Show by Course']")
    public WebElement showByCourse;

    @FindBy(xpath = "//span[text()='Show by Type']")
    public WebElement showByType;

    @FindBy(xpath = "//span[text()='Show by Date']")
    public WebElement showByDate;

    @FindBy(xpath = "//span[text()='Show by Chart']")
    public WebElement showByChart;

    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    public WebElement homeworkIframe;

    @FindBy(id = "tinymce")
    public WebElement inputText;

    @FindBy(xpath = "//ms-confirm-button//button")
    public WebElement submitSend;

    @FindBy(xpath = "//span[contains(text(),'Select')]")
    public WebElement selectButton;

    @FindBy(xpath = "(//strong[text()='11A-Mathematics '])[1]")
    public WebElement homeworkButton;

    @FindBy(xpath = "//span[text()='New Submission']")
    public WebElement newSubButton;

    @FindBy(xpath = "//*[text()='Semester']")
    public WebElement semesterBtn;

    @FindBy(xpath = "((//*[@icon='comments-alt']) //button )[1]")
    public WebElement discussion;

    @FindBy(xpath = "(//*[@data-icon='messages'])[3]")
    public WebElement chats;

    @FindBy(xpath = "//*[@icon='users']")
    public WebElement contacts;

    @FindBy(xpath = "(//*[@class='mat-mdc-form-field-infix'])[7]")
    public WebElement textArea;

    @FindBy(xpath = "//*[@data-icon='paper-plane']")
    public WebElement chatSendButton;

    @FindBy(xpath = "//bdi[text()=' Deneme']")
    public WebElement messageTrue;

    @FindBy(xpath = "(//*[@icon='info'])[1]")
    public WebElement infoAssignment;

    @FindBy(xpath = "(//*[@icon='file-import'])[1]")
    public WebElement submitAssignment;

    @FindBy(xpath = "(//*[@icon='star'])[1]")
    public WebElement starAssignment;

    @FindBy(xpath = "//div[@class='mdc-checkbox']")
    public WebElement showMarked;

    @FindBy(xpath = "(//div[@fxlayoutalign='start center'])[7]")
    public WebElement centerPush;

    @FindBy(xpath = "//span[text()='Description']")
    public WebElement description;

    @FindBy(css = "[class='profile-image avatar huge']")
    public WebElement uploadPicture;

    @FindBy(css = "[class='mat-mdc-form-field-icon-suffix']")
    public WebElement uploadPictureIcon;

    @FindBy(xpath = "//span[text()=' Upload ']")
    public WebElement uploadButton;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class='profile-image avatar huge']")
    public WebElement image;

    @FindBy(xpath = "//img[@class='avatar-bigger']")
    public WebElement getImage;

    @FindBy(xpath = "//button//span[@class='mdc-button__label'][text()=' Delete ']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[text()=' Close ']")
    public WebElement closeButton;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement escButton;

    @FindBy(xpath = "(//*[@class='mat-ripple mat-mdc-tab-ripple'])[3]")
    public WebElement attendanceExcusesButton;

    @FindBy(xpath = "(//button[@matbadgesize='medium'])[2]")
    public WebElement addAttendanceExcusesIcon;

    @FindBy(xpath = "//textarea[@placeholder='Message']")
    public WebElement inputMessageAttendance;

    @FindBy(xpath = "//span[text()='Select']")
    public WebElement select;

    @FindBy(xpath = "//span[text()='Default Theme']")
    public WebElement defaultThemeButton;

    @FindBy(xpath = "//span[text()=' Default Theme ']")
    public WebElement defaultTheme;

    @FindBy(xpath = "//span[text()=' Purple Theme ']")
    public WebElement purpleThemeButton;

    @FindBy(xpath = "//span[text()='Purple Theme']")
    public WebElement purpleTheme;

    @FindBy(xpath = "//span[text()=' Green Theme ']")
    public WebElement greenThemeButton;

    @FindBy(xpath = "//span[text()='Green Theme']")
    public WebElement greenTheme;

    public WebElement getWebElement(String dcElement) {
        switch (dcElement) {
            case "previousButton":
                return this.previousButton;
            case "todayButton":
                return this.todayButton;
            case "nextButton":
                return this.nextButton;
            case "Course Grade":
                return this.courseGradeButton;
            case "Print":
                return this.printIcon;
            case "Download":
                return this.downloadIcon;
            case "Student Transcript":
                return this.studentTranscript;
            case "Transcript by Subject":
                return this.transcriptBySubject;
            case "stripe":
                return this.stripe;
            case "payInFullButton":
                return this.payInFullButton;
            case "payButton":
                return this.payButton;
            case "createInstallmentButton":
                return this.createInstallmentButton;
        }
        return null;
    }

    public List<WebElement> getWebElements(String dcElement) {
        switch (dcElement) {
            case "endedLessonIcons":
                return this.endedLessonIcons;
            case "publishedLessonIcons":
                return this.publishedLessonIcons;
            case "startedLessonIcons":
                return this.startedLessonIcons;
            case "cancelledLessonIcons":
                return this.cancelledLessonIcons;
        }
        return null;
    }
}