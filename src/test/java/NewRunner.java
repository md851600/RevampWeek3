import com.intuit.karate.junit5.Karate;

// Sep 1 copy from Eclipse
public class NewRunner {
    Karate firstTest() {
        return Karate.run("RestAPI"); //.NewRunner;
     //   return null;
    }
    Karate secondTest() {
        return Karate.run("GenerateToken").relativeTo(getClass());
        //return Karate.run("GenerateToken").tags("Token"); 1/24 relocated from NeuRunnerS
    }
    @Karate.Test
     Karate thirdUsers() {
        return Karate.run("Tekusers").relativeTo(getClass());
    }
}
