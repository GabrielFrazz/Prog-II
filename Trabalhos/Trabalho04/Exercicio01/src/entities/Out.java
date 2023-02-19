package entities;

import java.io.IOException;

public abstract class Out {
    
    public abstract void flush(Form[] forms) throws IOException;

}