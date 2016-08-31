import org.junit.Test
import ru.yandex.qatools.allure.annotations.Features
import ru.yandex.qatools.allure.annotations.Stories

/**
 * Created by danieldatri on 8/31/16.
 */
@Features("Feature A")
class SuiteATest extends CommonSteps {


    @Test
    @Stories("Test case A1")
    public void testA1() {
        this.firstStep("testCase A1")
        this.secondStep("testCase A1")
        assert true == true
    }


    @Test
    @Stories("Test case A2")
    public void testA2() {
        this.firstStep("testCase A2")
        this.secondStep("testCase A2")
        assert true == true
    }


    @Test
    @Stories("Test case A3")
    public void testA3() {
        this.firstStep("testCase A3")
        this.secondStep("testCase A3")
        assert true == true
    }


}
