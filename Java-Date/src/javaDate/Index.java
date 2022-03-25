package javaDate;

import java.util.Calendar;
import java.util.Scanner;

public class Index {

	private static void mostrarcalendario(Calendar calendar) {
		
		 System.out.println("\n\n|   Ano   | "+ calendar.get(Calendar.YEAR));
	     System.out.println("|   Mês   | "+ calendar.get(Calendar.MONTH));
	     System.out.println("|   Dia   | "+ calendar.get(Calendar.DAY_OF_MONTH));
	     System.out.println("|   Hora  | "+ calendar.get(Calendar.HOUR));
	     System.out.println("|   Min   | "+ calendar.get(Calendar.MINUTE));
	     System.out.println("|   Seg   | "+ calendar.get(Calendar.SECOND));
	}
	
	
	public static void main(String[] args) {
		int ano, mes, dia, hora, minutos, segundos;
		
		Scanner scanner = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		
		System.out.print("Digite o ano: ");
		ano = scanner.nextInt();
		System.out.print("\nDigite o mês: ");
		mes = scanner.nextInt();
		System.out.print("\nDigite o dia: ");
		dia = scanner.nextInt();
		System.out.print("\nDigite a hora: ");
		hora = scanner.nextInt();
		System.out.print("\nDigite os minutos: ");
		minutos = scanner.nextInt();
		System.out.print("\nDigite os segundos: ");
		segundos = scanner.nextInt();
		
		calendario.set(ano, mes, dia, hora, minutos, segundos);
		
		int opcao, quant;
		
		do{
		     System.out.println("Escolha uma das opções abaixo: ");
		     System.out.println("1 - Adicionar Dias");
		     System.out.println("2 - Adicionar Mêses");
		     System.out.println("3 - Adicionar Anos");
		     System.out.println("4 - Subtrair Dias");
		     System.out.println("5 - Subtrair Meses");
		     System.out.println("6 - Subtrair Anos");
		     System.out.println("0 - Finalizar");
		     
		     opcao = scanner.nextInt();
		     switch (opcao){
		    	 case 0 :
		    		 break;
		    		 
		    	 case 1:
		    		 System.out.print("Informe o valor: ");
		    		 quant = scanner.nextInt();
		    		 calendario.set(Calendar.DAY_OF_MONTH, calendario.get(Calendar.DAY_OF_MONTH) + quant);
		    		 mostrarcalendario(calendario);
		    		 break;
		    		 
		    	 case 2: 
		    		 System.out.print("Informe o valor: ");
		    		 quant = scanner.nextInt();
		    		 calendario.set(Calendar.MONTH, calendario.get(Calendar.MONTH) + quant);
		    		 mostrarcalendario(calendario);
		    		 break;
		    		 
		    	 case 3: 
		    		 System.out.print("Informe o valor: ");
		    		 quant = scanner.nextInt();
		    		 calendario.set(Calendar.YEAR, calendario.get(Calendar.YEAR) + quant);
		    		 mostrarcalendario(calendario);
		    		 break;
		    		 
		    	 case 4: 
		    		 System.out.print("Informe o valor: ");
		    		 quant = scanner.nextInt();
		    		 calendario.set(Calendar.DAY_OF_MONTH, calendario.get(Calendar.DAY_OF_MONTH) - quant);
		    		 mostrarcalendario(calendario);
		    		 break;
		    		 
		    	 case 5: 
		    		 System.out.print("Informe o valor: ");
		    		 quant = scanner.nextInt();
		    		 calendario.set(Calendar.MONTH, calendario.get(Calendar.MONTH) - quant);
		    		 mostrarcalendario(calendario);
		    		 break;
		    		 
		    	 case 6: 
		    		 System.out.print("Informe o valor: ");
		    		 quant = scanner.nextInt();
		    		 calendario.set(Calendar.YEAR, calendario.get(Calendar.YEAR) - quant);
		    		 mostrarcalendario(calendario);
		    		 break;
		    		 
		     }
		     
		}while(opcao != 0);
		scanner.close();
		
		
	}



	}


