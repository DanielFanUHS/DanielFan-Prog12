import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;

    public DatabaseHandler(){
        createConnection();
        createDirectoryTable("hello");
    }

    private void createConnection(){
        try{
            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance(); -- don't use this anymore
            conn = DriverManager.getConnection(DB_url);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void createDirectoryTable(String dirName){
        String TABLE_NAME = dirName;
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null,null, TABLE_NAME, null);
            if(tables.next()){
                System.out.println("Table " + TABLE_NAME + " already exists");
            } else {
                String statement =  "CREATE TABLE " + TABLE_NAME + "("
                        + "name varchar(200) primary key, \n"
                        + "type varchar (200), \n"
                        + "size varchar (200), \n"
                        + "subfolder varchar(200), \n";
                System.out.println(statement);
                stmt.execute(statement);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage() + "setting up database");
        }
    }

    public boolean execAction(String qu){
        try{
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        }catch (SQLException e){
            System.out.println("exception at execQuery" + e.getLocalizedMessage());
            return false;
        }
    }

    public ResultSet execQuery(String query){
        ResultSet resultSet;
        try{
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException e){
            System.out.println("Exception at execute query");
            return null;
        }
        return resultSet;
    }
}
