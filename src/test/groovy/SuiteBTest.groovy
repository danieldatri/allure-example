import org.junit.Test
import ru.yandex.qatools.allure.annotations.Features
import ru.yandex.qatools.allure.annotations.Stories

/**
 * Created by danieldatri on 8/31/16.
 */
@Features("Feature B")
class SuiteBTest extends CommonSteps{

    @Test
    @Stories("Test case B1")
    public void testB1() {
        this.firstStep("testCase B1")
        this.secondStep("testCase B1")
        assert true == true
    }


    @Test
    @Stories("Test case B2")
    public void testB2() {
        this.firstStep("testCase B2")
        this.secondStep("testCase B2")
        assert true == true
    }


    @Test
    @Stories("Test case B3")
    public void testB3() {
        this.firstStep("testCase B3")
        this.secondStep("testCase B3")
        assert true == true
    }
}
