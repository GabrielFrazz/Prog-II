package entities;

import java.io.IOException;

public class Container {

    private Form[] forms;

    public Container(Form[] forms) {
        this.forms = forms;
    }

    public void print(Out o) throws IOException{
        o.flush(forms);
    }

}