import org.testng.Assert;
//Sept14 run warning - Method testLEADIF never used
import java.sql.*;
//Sept18 test2@EcLipse passed but testLEADIF failed
//Oct30 RAC called by resources/restNG.xml
public class RestAPI {
    public void testLEADIF() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jan20";
        String user = "root";
        String password = "Aimereon24";

        Connection connection = null;
        Statement statement;
        statement = null;
        ResultSet resultSet = null;
        boolean resSet = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            connection.setSchema(password + " TEK");
            System.out.println("Success connection to MySQL schema  " + connection.getSchema());
            statement = connection.createStatement();
            statement.getConnection();
            statement.execute("select current_time()");
            System.out.println("catalog is " + connection.getCatalog());
            String sqlQuery = "select * from jan20.dif_demo";
            resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                String rev = resultSet.getString("revision");
                System.out.println(resultSet.getString("id") + " " + resultSet.getString("revision"));
                Assert.assertEquals(rev, "1.150", "records updated!");
                Assert.assertEquals(resultSet.getString(3), "shift supervisor");//check for revison #
            }
            System.out.println("Sept14 IntelliJ " + statement.execute(sqlQuery));
            System.out.println("LEADIF_Demo executeQuery " + resultSet);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            resSet = statement.execute("select current_user()");
            System.out.println("current user " + resSet);
            resultSet.close();
            statement.close();
            connection.clearWarnings();
        }
    }

}
