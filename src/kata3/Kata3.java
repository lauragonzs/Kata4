package kata3;

import java.io.File;
import java.util.List;
import kata4.EmailLoader;
import kata4.FileLoader;
import kata4.Loader;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        Loader loader = new EmailLoader(new FileLoader(new File("emails.txt")));
        List<String> emails = loader.load();
        for(String email : emails){
            histogram.increment(email.split("@")[1]);
        }
        
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram display", histogram);
        histogramDisplay.execute();
    }
    
}

