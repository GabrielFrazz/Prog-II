
package entities;

public class Form {

    private String form;

    public Form(){

    }
    
    public Form(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString(){
        return "" + form;
    }
}