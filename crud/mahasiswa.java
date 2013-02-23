package crud;


/**
 * Write a description of class mahasiswa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mahasiswa
{
   private String nama;
   private String nim;
   
   public mahasiswa(){
    }
    
   public mahasiswa(String nim, String nama){
    
       this.nim = nim;
       this.nama = nama;
    }
    
   public void setNama(String nama){
     this.nama = nama;
    }
    
   public String getNama(){
     return nama;
    }
     
   public void setNim(String nim){
     this.nim = nim;
    }
    
   public String getNim(){
     return nim;
    }
}
