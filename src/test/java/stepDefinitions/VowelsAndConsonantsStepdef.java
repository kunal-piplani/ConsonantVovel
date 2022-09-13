package stepDefinitions;

import com.exercise.VowelAndConsonantCount;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import org.junit.Assert;

import java.util.*;

public  class VowelsAndConsonantsStepdef {
    HashMap<String, ArrayList<Integer>> count = new HashMap<>();
    VowelAndConsonantCount vowelCount = new VowelAndConsonantCount();

    @Given("^User call Vowels Function with String as \"([^\"]*)\"$")
    public void User_call_Vowels_Function_with_String_as(String arg1) {
        LinkedList<String> s = new LinkedList<String>(Arrays.asList(arg1.split(",")));
        count = vowelCount.ConstantAndVowelCount(s);

    }

    @Then("^Verify count of Vowels and consonant and count as \"([^\"]*)\"$")
    public void Verify_count_of_Vowels_and_consonant_and_count_as(String arg1) {
        ArrayList<String> s = new ArrayList<String>(Arrays.asList(arg1.split("#")));
        int i = 0;


        for (Map.Entry<String, ArrayList<Integer>> map : count.entrySet()) {
            if (map.getKey().equals("Extra arguments passed")) {
                Assert.assertTrue("Extra Argument Passed", true);
                i++;
            } else {
                System.out.println(map.getKey());
                System.out.println(map.getValue());
                Assert.assertEquals(String.valueOf(map.getValue()).replace(" ", ""), String.valueOf(s.get(i)));
                i++;
            }


        }

    }
}

