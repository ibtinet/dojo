package br.net.ibti.dojo;

public class MoneyConverter {

	private static String[] unidades = new String[]{"","um", "dois", "tres", "quatro", "cinco", "seis", "sete","oito", "nove"};
	
	private static String[] dezenas = new String[]{"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
	
	private static String[] gambiArray = new String[] {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
	
	public static String numberToReal(double money) {
		
		String value= "";
		
		String num = ""+new Double(money).intValue();
		
		if(money > 9 && money < 19) {
			return gambiArray[new Double(money).intValue() - 10] + " reais";
		} else if( money > 19 ){			
			int dez = Integer.parseInt("" + num.charAt(num.length() - 2));
			value = dezenas[dez] ;
		}
		
		int un = Integer.parseInt("" + num.charAt(num.length() - 1));
		if(!value.equals("") && un != 0 ){
			value += " e "; 
		}
		value += unidades[un];
		
	
		return money == 1.0 ? (value += " real") : (value += " reais");
	}

}
