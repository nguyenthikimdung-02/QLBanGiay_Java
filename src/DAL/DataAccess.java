/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class DataAccess {
    private static Connection conn = DataConnect.Connect;
    private static Statement st;
    private ResultSet rs = null;
    CallableStatement stmt =null;
    
    public DataAccess()
    {
        
    }
    public DataAccess(String sql)
    {
        try {
            st = getStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public DataAccess(String sql, boolean t)
    {
        try{
            if(t == false)
                stmt = conn.prepareCall(sql);
            else{
                st = getStatement();
                rs = st.executeQuery(sql);
            }
        }
        catch(Exception err ){
            
        }
    }
    
    // khởi tạo lấy statement
    private static Statement getStatement () {
        try {
            return conn.createStatement (
            ResultSet.TYPE_SCROLL_INSENSITIVE ,
            ResultSet.CONCUR_READ_ONLY);
        } catch ( Exception err ) {
            System.err.print (err.getMessage ());
        }
        return null;
    }
    
    // phương thức dùng để truy vấn tên cột của bảng
    public String[] QueryHeaderTable()
    {
        try{
            //lấy tên cột của bảng
            ResultSetMetaData rsmd = rs.getMetaData();
            //lấy cột của column
            int numColumn = rsmd.getColumnCount();
            String[] ColumnNames = new String[numColumn];
            //gán vào chuỗi ColumnNames
            for(int i=0;i<numColumn;i++)
                ColumnNames[i]=rsmd.getColumnName(i+1);
            return ColumnNames;
        }
        catch(Exception err)
        {
            
        }
        return null;
    }
    
    //phương thức dùng để truy vấn các dòng của bảng
    public Object[][] QueryContentTable()
    {
        try{
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumn = rsmd.getColumnCount();
            int numRow = 0;
            rs.last ();
            numRow = rs.getRow ();
            rs.beforeFirst ();
            //hiển thị kết quả của câu truy vấn
            Object[][] resultsQuery = new Object[numRow][numColumn];
            int i = 0;
            while(rs.next())
            {
                for(int j=0;j<numColumn;j++)
                    resultsQuery[i][j]=rs.getObject(j+1);
                i++;
            }
            return resultsQuery;
        }
        catch(Exception err)
        {
            
        }
        return null;
    }
    
    //phương thức lấy toàn bộ cột, nội dung của bảng
    public ArrayList QueryTable()
    {
        String[] ColumnNames;
        Object[][] DataRows;
        ColumnNames = QueryHeaderTable();
        DataRows = QueryContentTable();
        
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(ColumnNames);
        arr.add(DataRows);
        return arr;
    }
    // Lấy kết quả câu lệnh thực thi không truy vấn
    public static boolean ResultOfExecuteSql (String query) {
        try {
            st=conn.createStatement();
            st.executeQuery (query);
            return true;
        } catch ( SQLException err ) {
            JOptionPane.showMessageDialog (null ,
            err.getMessage () ,
            "Thông Báo" ,
            JOptionPane.ERROR_MESSAGE);
            System.out.print (err.getMessage ());
            return false;
        }
    }
    
    public static boolean ResultOfExecuteSqlUpdate (String query) {
        try {
            st=conn.createStatement();
            st.executeUpdate(query);
            return true;
        } catch ( SQLException err ) {
            JOptionPane.showMessageDialog (null ,
            err.getMessage () ,
            "Thông Báo" ,
            JOptionPane.ERROR_MESSAGE);
            System.out.print (err.getMessage ());
            return false;
        }
    }
    
    
}
