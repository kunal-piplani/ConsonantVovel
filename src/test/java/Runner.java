import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
//        features = "C:\\Users\\91993\\Downloads\\agile_qa_test (1)\\agile_qa_interview_exercise_1ca32ca\\src\\test\\resources"
        //glue={"stepDefinition"}
        format = {"pretty", "html:target/cucumber"}
)
public class Runner {
}
