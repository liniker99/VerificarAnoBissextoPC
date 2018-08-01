
package atividade01;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public boolean verificaBissexto(){
        if(ano % 4 == 0){
            System.out.println("\nAno Bissexto!");
            return true;
	}else{
            System.out.println("\nNão Bissexeto!");
            return false;
	}
    }
    
    public String mostrarData(){
        return dia + "/" + mes + "/" + ano;
    }
    
    public void dataSeguinte() {
	dia++;
	if((dia == 32) && (mes == 1 || mes == 3 || mes == 5 || mes == 7)){
            mes ++;
            dia = 1;
	}else {
	if((dia == 31) && (mes == 4 || mes ==6 || mes == 11)){
            mes ++;
            dia = 1;
	}else{
	if(dia == 29 && mes == 12 ){
            mes ++;
            dia = 1;
	}
	}
	}
}
	public boolean validaData(){
            if(dia <= 31 && dia > 0 && mes <= 12 && mes > 0 ){
		return true;
	}else{
            throw new DataInvalidaException("Data Invalida");
	}
	}
}
