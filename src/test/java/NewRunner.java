import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

// co-exits with RestAPI which is testNG
// Sep 1 copy from Eclipse
public class NewRunner {
    //Karate firstTest() {
      //  return Karate.run("TekUser");
    // NewRunner per Gemini it should run feature;
     //   this format is not tied to Junit %
   // Try non-Karate, 10/24/24 Ft McH }

    //System.out.println("Fort McHenry Eco-Horizons");
    @Karate.Test
   Karate secondTest() {
        return Karate.run("GenerateToken").relativeTo(getClass());
        //return Karate.run("GenerateToken").tags("Token"); 1/24 relocated from NeuRunnerS
    }
    //below path point to feature files
    @Karate.Test
     Karate thirdUsers() {
        return Karate.run("Copilot").relativeTo(getClass());
    }
}
