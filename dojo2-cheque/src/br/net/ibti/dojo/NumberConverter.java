package br.net.ibti.dojo;

public class NumberConverter {

	public static String parseRoman(Integer i) {
		
		
		
		
		
		return mod(i, "I", "V");

//		if (i == 1000){
//			return "M";
//		}
//
//		if (i<5){
//			if (i == 1) {
//			return "I";
//			} else if (i == 2) {
//	
//				return "II";
//	
//			} else if (i == 3) {
//				return "III";
//			} else if (i == 4) {
//				return "IV";
//			}
//		} else if(i >= 5)
//		{
//			
//			if (i == 5)
//			{
//				return "V";
//			}else if(i == 6){
//				return "VI";
//			}else if(i == 7){
//				return "VII";
//			}else if(i == 8){
//				return "VIII";
//			}else if(i == 9){
//				return "IX";
//			}
//			
//			
//		}
//		return null;
	}

	public static String mod(Integer i, String diminutivo, String decimal) {
		
		int resto = i % 5;
		
		if(resto == 4){
			return diminutivo + decimal;
		}
		else{
			
			return somaI(resto, diminutivo);
			
			
		}
		
		
		
		
	}

	private static String somaI(Integer i, String letra){
		String ret = "";
		for(int w=0;w<i;w++){
			ret += letra;
		}
		return ret;
	}
		
	
	
}



//			//		return null;


