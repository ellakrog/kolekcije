/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file111;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author MULTINORM-USR-78
 */
public class File111 {
 public void LIST(String directoryName) {
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            System.out.println(file.getName());
            }
   }
    
    public void INFO(String directoryName) throws IOException{
      File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            System.out.println("Prikaz informacija o folderu/file-u :");
            System.out.println("Ime: " +file.getName());
            System.out.println("Putanja :" +file.getAbsolutePath());
            
            System.out.println("Velicina file-a: " +file.length()+"B");
            System.out.println("Creation time :"
                        + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                   .format(FileCreationTime.getCreationTime(file).toMillis()));
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Posljednje izmjene :" +sdf.format(file.lastModified()));
        }

    }
     public void CREATE_DIR(String directoryName) {
     File directory = new File(directoryName);
        try {
            if(!directory.exists())
            {
            directory.mkdir();
        System.out.println("Created a directory called " + directory.getName());
        }
        else
        {
        System.out.println("Directory called " + directory.getName() + " already exists.");
        }
             
        } catch (Exception e) {
        System.out.println("Couldn't create a directory called "
                    + directory.getName());
        } 
    }
    public void RENAME(String directoryName, String newName) {
        File directory = new File(directoryName);
        File directory1 = new File(newName);
        if(!directory.exists())
           {
        System.out.println("File doesn't exists!");
            return;
            }
        if(directory1.exists())
            {
            System.out.println("File with desired name already exists!");
            return;
            }
        if(directory.renameTo(directory1))
            {
            System.out.println("Rename succesful");
            }
        else
            {
            System.out.println("Rename failed");
            }
        }



  
 
      public void MOVE(String directoryName, String newDirectory) {
        File directory = new File(directoryName);
        File directory1 = new File(newDirectory + "\\" + directory.getName());
         
        try(FileInputStream inStream = new FileInputStream(directory);
            FileOutputStream outStream = new FileOutputStream(directory1))
        {
            byte[] buffer = new byte[1024];
            int length;
            while((length = inStream.read(buffer)) > 0)
                outStream.write(buffer, 0, length);
            System.out.println("File is moved successfuly!");
             
            inStream.close();
            outStream.close();
             
            directory.delete();
        }
        catch(IOException exc)
        {
            System.out.println(exc);
        }
    }
    public void DELETE(File f) throws IOException {
    {
        File[] fs = f.listFiles();
        if(fs != null)
        for(File f1 : fs)
        DELETE(f1);

         f.delete();
    }
    }
    public void COPY(File f1, File f2) throws FileNotFoundException, IOException
    {
        if(f1.isDirectory())
        {
       	if(!f2.exists())
          f2.mkdir();

       	String fs[] = f1.list();
       	for(int i = 0; i < fs.length; i++)
            COPY(new File(f1, fs[i]), new File(f2, fs[i]));
        }
    else
        {
       	InputStream is = new FileInputStream(f1);
       	OutputStream os = new FileOutputStream(f2);

       	byte bs[] = new byte[1024];
       	int l;
       	while((l = is.read(bs)) > 0)
            os.write(bs, 0, l);

       	is.close();
       	os.close();
        }
    }

    
    
    
   
    public static void main (String[] args) throws IOException {
       File f=null;
       File f2=null;
       
        
       Scanner reader = new Scanner(System.in);    
       System.out.println("Enter a path"); 
       String dir = reader.nextLine();
       String file1 = reader.nextLine();
       File file = new File(file1);
   
       String operation = "";
       
           System.out.println("Izaberite operaciju\n");
           System.out.println("LIST\n");
           System.out.println("INFO\n");
           System.out.println("CREATE_DIR\n");
           System.out.println("RENAME\n");
           System.out.println("COPY\n");
           System.out.println("MOVE\n");
           System.out.println("DELETE\n");
           operation= reader.nextLine();
           operation =operation.toUpperCase();

          
       switch (operation) {
           case "LIST":
               {
                   File111 listFilesUtil = new  File111();
                   listFilesUtil.LIST(dir);
                   break;
               }
           case "INFO":
               {
                   File111 listFilesUtil = new  File111();
                   listFilesUtil.INFO(dir);
                   break;
               }
           case "CREATE_DIR":
               {
                   File111 listFilesUtil = new  File111();
                   listFilesUtil.CREATE_DIR(dir);
                   break;
               }
           case "RENAME":
               {   
                   File111 listFilesUtil = new  File111();
                   System.out.println("Enter a new path name:");
                   String dir1 = reader.nextLine();
                   listFilesUtil.RENAME(dir,dir1);
                
                   break;
               }
           case "COPY":
               {
                   File111 listFilesUtil = new  File111();
                   System.out.println("Enter a new path name:");
                   
                   listFilesUtil.COPY(f,f2);
                }
           case "DELETE":
                {
                   File111 listFilesUtil = new  File111();
                   listFilesUtil.DELETE(f);
                  
                   break;  
                }
           default:
               System.out.println("Izaberite operaciju\n");
               break;
       }
        reader.close();
    }

   
}
   

   
    

    

      
      