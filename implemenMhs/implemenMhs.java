package implemenMhs;

import crud.*;
import interfc.*;
import connection.*;
import java.util.*;
import java.sql.*;
/**
 * Write a description of class implemenMhs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class implemenMhs implements interMahasiswa
{
    public mahasiswa insert(mahasiswa o) throws SQLException{
        PreparedStatement st = databaseConn.getConnection().prepareStatement("insert into mahasiswa values(?,?)");
        
        st.setString(1, o.getNim());
        st.setString(2, o.getNama());
        st.executeUpdate();
        return o;
    }
   
   public void update(mahasiswa o) throws SQLException{
        PreparedStatement st = databaseConn.getConnection().prepareStatement("update set mahasiswa set nama=? where nim=?)");
        
        st.setString(1, o.getNama());
        st.setString(2, o.getNim());
        st.executeUpdate();
    }
   
   public void delete(String nim) throws SQLException{
        PreparedStatement st = databaseConn.getConnection().prepareStatement("delete from mahasiswa where nim=?)");
        
        st.setString(1, nim);
        st.executeUpdate();
    }
   
   public List getAll() throws SQLException{
      Statement st= databaseConn.getConnection().createStatement();
      
      ResultSet rs = st.executeQuery("select * from mahasiswa");
      List list = new ArrayList();
      while(rs.next()){
         mahasiswa mhs = new mahasiswa();
         mhs.setNim(rs.getString("nim"));
         mhs.setNama(rs.getString("nama"));
         list.add(mhs);
        }
        return list;
    }
}
