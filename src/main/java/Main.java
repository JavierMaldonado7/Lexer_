
import java.io.*;
public class Main {


    public static void main( String[] args ) throws IOException {

        File fil = new File("src/main/java/test.txt");

        String[] argv = {fil.getCanonicalPath()};
        BufferedReader yy_reader;


        try {


            yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(new FileInputStream(argv[0])));

            Yylex lexer = new Yylex( yy_reader );

            lexer.yylex();

        }

        catch ( Exception exception ) {

            System.out.println( "Exception in Main "+ exception.toString() );
            exception.printStackTrace();

        }

    }

}
