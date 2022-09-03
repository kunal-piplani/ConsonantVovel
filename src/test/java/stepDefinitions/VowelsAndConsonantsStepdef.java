package stepDefinitions;

import com.exercise.VowelCount;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import org.junit.Assert;

import java.util.*;

public class VowelsAndConsonantsStepdef {
HashMap<String, ArrayList<Integer>>count =new HashMap<>();
    VowelCount vowelCount = new VowelCount();
    @Given("^User call Vowels Function with String as \"([^\"]*)\"$")
    public void User_call_Vowels_Function_with_String_as(String arg1) {
        LinkedList<String> s = new LinkedList<String>(Arrays.asList(arg1.split(",")));
        count =vowelCount.getConstantAndVowelCount(s);

    }

    @Then("^Verify count of Vovels and consonant and count as \"([^\"]*)\"$")
    public void Verify_count_of_Vovels_and_consonant_and_count_as(String arg1) {
        ArrayList<String> s = new ArrayList<String>(Arrays.asList(arg1.split("#")));
        int i=0;
        for(Map.Entry<String,ArrayList<Integer>>map:count.entrySet()){
           Assert.assertEquals(String.valueOf( map.getValue()).replace(" ",""),String.valueOf(s.get(i)));
        i++;
        }



    }



}
