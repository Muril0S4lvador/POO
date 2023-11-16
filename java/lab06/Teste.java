import java.io.*;

public class Teste{

    public static void main(String[] args) {

        try( FileInputStream file = new FileInputStream("entradas/entrada.csv");
             InputStreamReader r = new InputStreamReader(file, "ISO-8859-1");
             BufferedReader br = new BufferedReader(r);){

                String linha;
                String buffer = "";
                linha = br.readLine();
                
                while( linha != null ){
                    buffer += linha + "\n";
                    
                    String[] partes = linha.split(";");
                    linha = br.readLine();

                    if( partes.length > 4 ){
                        String elementoDesejado = partes[4];
                        System.out.println(elementoDesejado);
                    }


                }
                System.out.println(buffer);
                
            } catch ( IOException e ){
                System.out.println("Erro de I/O");
                e.printStackTrace();   
                
            }
        
        
    }


}
