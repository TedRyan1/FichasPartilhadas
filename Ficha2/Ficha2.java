package Ficha2;

import java.util.concurrent.TimeUnit;

public class Ficha2 {

	
	




	public static void main(String[] args) {
		System.out.println("Area=" + areaTriang(3,4));
		System.out.println("Area Retangulo = " + areaRetang(7, 8));
		System.out.println("Factorial = " + factor(5));
		System.out.println("FactorRecursivo =" + factorRecursivo(5));
		System.out.println("Numero Vogais = " + numTotalVogais("Fabio"));
		numVogais("retangulo");
	}
	
	//Exercicio 1
	public static double areaTriang (double altura, double base){
		return (base * altura)/2;
	}
	
	//Exercicio 2
	public static double areaRetang (double altura, double comprimento){
		return altura * comprimento;
	}
	
	//Exercicio 3
	public static double areaCalc (double x, double y, double z)
	{
		double calc;
		if(z==1){
			calc = areaTriang(x,y);
			
		}
		else{
			calc = areaRetang(x,y);
		}
	    return calc;
	}
	//Exercicio 4
	public static double factor(int n){
		int fact = 1;
	    for (int i = 1; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	//Exercicio 5
	public static double factorRecursivo (int n)
	{
		{    
			  if (n == 0) // tem de parar no 1 senao rebenta e ele vaifazendo sempre o mesmo   
			    return 1;    
			  else    
			    return(n * factorRecursivo (n-1));    
			 }    
		
	}

// Exercicio 6
	public static int numTotalVogais(String frase)
	{
		int count = 0;
        for (int i = 0; i < frase.length(); i++)
        {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o' || frase.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
	
	
	
	//Exercio 7
	
	public static void numVogais(String frase)
	{
		int counta = 0;
		int counte = 0;
		int counti = 0;
		int counto = 0;
		int countu = 0;
		
		
		
		
		
        for (int i = 0; i < frase.length(); i++)
        {
            
        	
        	switch (frase.charAt(i) ){
        	case 'a':
        	counta++;
        	break;
        	
        	case 'e':
        	counte++;
        	break;
        	case 'i':
        	counti++;
        	break;
        	case 'o':
        	counto++;
        	break;
        	
        	
        	case 'u':
        	countu++;
        	break;
        	
        
        
        }
      
        }
	System.out.println("A:" + counta);
	System.out.println("E:" + counte);
	System.out.println("I:" + counti);
	System.out.println("O:" + counto);
	System.out.println("U:" + countu);
	
	}
	
	
	
	
	// Exercicio 8
	public static void calculateTime(long seconds) {
        int day = (int)TimeUnit.SECONDS.toDays(seconds);        
        long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

        System.out.println("Day " + day + " Hour " + hours + " Minute " + minute + " Seconds " + second);
        
        // https://stackoverflow.com/questions/25903354/java-convert-seconds-to-minutes-hours-and-days/25903874

    }

}


	
