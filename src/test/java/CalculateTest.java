import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CalculateTest {

    @Test
    public void calcTest() {
        int expexted1 = 42;
        int expexted2 = 13;
        int expexted3 = 20;

        assertAll(

                () -> assertThat(expexted1, comparesEqualTo(Calculate.calc(10, 32))),
                () -> assertThat(expexted2, comparesEqualTo(Calculate.calc(10, 3))),
                () -> assertThat(expexted3, comparesEqualTo(Calculate.calc(10, 10)))
        );
    }
}
