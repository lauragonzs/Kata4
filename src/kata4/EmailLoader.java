package kata4;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.regex.Pattern;

public class EmailLoader implements Loader {
    private final Loader loader;
    

    public EmailLoader(Loader loader) {
        this.loader = loader;
    }
    
    @Override
    public List<String> load(){
        List<String> list = new ArrayList<>();
        List<String> source = loader.load();
        for(String line : source){
            if(isEmail(line)) list.add(line); 
        }
        return list;
    }

    private static final Pattern emailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private boolean isEmail(String line) {
        return emailPattern.matcher(line).matches();
    }
    
     
    
    
    
    
    
}
