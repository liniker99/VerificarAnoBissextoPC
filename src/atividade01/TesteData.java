
package atividade01;

public class TesteData {

    public static void main(String[] args) {
			Data d1 = new Data(30, 11, 2017);
			Data d2 = new Data(28, 02, 2000);
			Data d3 = new Data(45, 01, 1980);
			
			System.out.println("Datas:");
			System.out.println("Primeira Data: " +d1.mostrarData());
			System.out.println("Segunda Data: " +d2.mostrarData());
			System.out.println("Terceira Data: " +d3.mostrarData());
			
			System.out.println("************************************");
			System.out.println("\nVerificando Datas:");
			try {
				System.out.println("Primeira Data: " +d1.validaData());	
			}catch(DataInvalidaException e) {
				System.out.println("Erro: " +e);
			}
			
			try {
				System.out.println("Segunda Data: " +d2.validaData());
			}catch(DataInvalidaException e) {
				System.out.println("Erro: " +e);
			}
			
			try {
				System.out.println("Terceira Data: " +d3.validaData());	
			}catch(DataInvalidaException e) {
				System.out.println("Erro Data 3: " +e);
			}
			
            System.out.println("************************************");
			System.out.println("Verificar anos que são Bissexto:");
			System.out.println("Primeira Data: " +d1.verificaBissexto());
			System.out.println("Segunda Data: " +d2.verificaBissexto());
			System.out.println("Terceira Data: " +d3.verificaBissexto());
			
			System.out.println("\n************************************");
			System.out.println("Data seguinte:");
			d1.dataSeguinte();
			d2.dataSeguinte();
			d3.dataSeguinte();
			
			System.out.println("************************************");
			System.out.println("Datas:");
			System.out.println("Primeira Data: " +d1.mostrarData());
			System.out.println("Segunda Data: " +d2.mostrarData());
			System.out.println("Terceira Data: " +d3.mostrarData());
			System.out.println("----------------------------------");
	}
}
