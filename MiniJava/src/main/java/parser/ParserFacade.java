package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserFacade {
    public void parse(String filePath) {
        Parser parser = new Parser();
        try {
            // start parsing
            parser.startParse(new Scanner(new File(filePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
