package singleton.database.example;
/**
 *
 * @author felipe
 */
public class ThreadSqlSingleTon implements Runnable
{
   public void run()
   {
      InsertRecords insert = new InsertRecords();
      insert.insertRecords();            
      SelectTable select = new SelectTable();
      select.selectTable();      
      DeleteRecord delete = new DeleteRecord();
      delete.deleteRecord();              
   }
}   
      