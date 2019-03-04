// QUES 1:- Implement Singleton Design Pattern on a dummy class.

package Ques1;

class DBConnectivity{

    static DBConnectivity dbconnection;
    String dbname;
    Integer connection;

    private DBConnectivity()
    {
        this.connection=1101;
        this.dbname="sql";
    }
    static DBConnectivity getInstance()
    {
       if(dbconnection==null)
           dbconnection= new DBConnectivity();
       return dbconnection;
    }

    @Override
    public String toString() {
        return "DBConnectivity{" +
                "dbname='" + dbname + '\'' +
                ", connection=" + connection +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(DBConnectivity.getInstance());
        System.out.println(DBConnectivity.getInstance());
    }
}
