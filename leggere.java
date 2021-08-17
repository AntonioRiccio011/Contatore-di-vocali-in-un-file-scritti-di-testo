package file;

import java.io.*;


public class leggere extends Thread 
    {   
    public void run() 
        {        
        Trova_vocali trovap = new Trova_vocali();
        
        
        try 
            {
            // TODO code application logic here
            FileReader fReader = new FileReader("prova.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String line = bReader.readLine();
            while (line != null)
                {
                System.out.println(line+"\n");
                trovap.run(line); 
                trovap.join();
                line = bReader.readLine();                
                System.out.println("\n");

                }
            }
        catch (Exception ex) 
            {
            ex.printStackTrace();
            } 

        }
   }
   
