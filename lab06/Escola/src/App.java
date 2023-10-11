import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        try( FileInputStream file = new FileInputStream("entradas/entrada.csv");
             InputStreamReader r = new InputStreamReader(file, "ISO-8859-1");
             BufferedReader br = new BufferedReader(r);){

                String linha;
                String buffer = "";
                linha = br.readLine();
                
                while( linha != null ){
                    
                        int i = 0;

            } catch ( IOException e ){
                System.out.println("Erro de I/O");
                e.printStackTrace();   
                
            }



    }
}
