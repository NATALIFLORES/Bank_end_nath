public class Usandofor{
    public static void main (String[] args){
        int numero, total;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        for (int i = 0; i <= 10; i++){
            total = numero * i;
            System.out.println(numero+" X "+i+" : "+total);
        }
    }
}
public class Relogio {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		for (int i = 0;i <=60; i++) {
			for(int g = 0; g<=60; g++) {
			
			System.out.println(i+"Min: "+g+"seg: ");
			}
		}
		
	}

}