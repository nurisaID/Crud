package interfc;

import crud.*;
import java.sql.SQLException;
import java.util.List;
/**
 * Write a description of class interMahasiswa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface interMahasiswa
{
   mahasiswa insert(mahasiswa o) throws SQLException;
   
   void update(mahasiswa o) throws SQLException;
   
   void delete(String nim) throws SQLException;
   
   List getAll() throws SQLException;
   
}
