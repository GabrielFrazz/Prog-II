package entities;

public class Data {
    
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data(Integer dia, Integer mes, Integer ano) {
        if(mes > 0 && mes <=12){
        this.mes = mes;
        }
        if(mes == 2){
            if(dia>0 && dia <=28){
                this.dia = dia;
            }
        }
        else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia>0 && dia <=31){
                this.dia = dia;
            }
        }
        else{
            if(dia>0 && dia <=30){
                this.dia = dia;
            } 
        }
        this.ano = ano;
    }

    public void setDia(Integer dia){
        this.dia = dia;
    }

    public Integer getDia(){
        return dia;
    }

    public void setMes(Integer mes){
        this.mes = mes;
    }

    public Integer getMes(){
        return mes;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public Integer getAno(){
        return ano;
    }

    public void avancaDia(){
        if(mes == 2){
            if(dia == 28){
                this.mes = this.mes + 1;
                this.dia = 1;
                return;
            }
        }
        else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia ==31){
                if(mes == 12){
                    this.ano = ano +1;
                    this.dia = 1;
                    this.mes = 1;
                    return;
                }
                else{
                    this.mes = mes +1;
                    this.dia = 1;
                    return;
                }
            }
        }
        else{
            if(dia ==30){
                this.mes = mes +1;
                this.dia = 1;
                return;
            } 
        }
        this.dia = this.dia + 1;
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

}