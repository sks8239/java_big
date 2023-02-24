package 미니프로젝트;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberInsertDao {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public void conn(){
        try{
            Class.forName("orcle.jdbc.driver.OracleDriver");
            String db_url = "jdbc:oracle:thin:@localhost:xe";
            String db_id = "HR2";
            String db_pw = "1234";
            conn = DriverManager.getConnection(db_url,db_id,db_pw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void close(){
        try{
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
