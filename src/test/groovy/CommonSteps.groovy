import org.junit.Before
import org.junit.BeforeClass
import ru.yandex.qatools.allure.annotations.Attachment
import ru.yandex.qatools.allure.annotations.Step

/**
 * Created by danieldatri on 8/31/16.
 */
class CommonSteps {


    @BeforeClass
    static void beforeClass(){
        println "run before each class"
    }

    @Before
    void beforeTest(){
        println "Run before each test"
    }

    @Step("First step")
    public void firstStep(String a, String b = "optional parameter"){
        this.attachDatasetToTest("attachment ${a} with ${b}")

    }

    @Step("Second step")
    public void secondStep(String a, String b = "optional parameter"){
        this.attachDatasetToTest("attachment ${a} with ${b}")

    }

    @Attachment(value = "{0}", type = "text/plain")
    protected String attachDatasetToTest(String attachName) {
        return "Test attachment"
    }

}
