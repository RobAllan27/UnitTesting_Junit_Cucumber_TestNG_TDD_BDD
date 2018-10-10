package simplegeneratedjunittestcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EnglishSingleChargeCase.class, FrenchSingleChargeCase.class })
public class AllTestsSuite {

}
