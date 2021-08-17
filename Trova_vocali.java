package file;

public class Trova_vocali extends Thread 
    {
    public void run(String riga)
        {
        int i=0;
        int j=0;
        
        while ( i!=riga.length() )
            {
            if (riga.charAt(i) =='a' || riga.charAt(i) =='A' || riga.charAt(i) =='e' || riga.charAt(i) =='E' || riga.charAt(i) =='i' || riga.charAt(i) =='I' | riga.charAt(i) =='o' || riga.charAt(i) =='O' || riga.charAt(i) =='u' || riga.charAt(i) =='U'  )
                {
                j=j+1;
                System.out.print(riga.charAt(i));
                }
            i=i+1;
            }
        System.out.print("="+j);

        
        }
    }
