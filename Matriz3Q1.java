package atv;
import java.util.Random;
public class Matriz3Q1 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		int matriz[][]=new int[5][5];
		double totalPares=0,somaPares=0;
		
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				matriz[l][c] = aleatorio.nextInt(10);
				System.out.println("O NUMERO DA COLUNA "+(c+1)+" : LINHA "+(l+1)+" É: "+matriz[l][c]);
			}
		}
		
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				if(matriz[l][c]%2==0) {
					totalPares++;
					somaPares+=matriz[l][c];
				}
			}
		}
		System.out.println("A MÉDIA DOS VALORES PARES É: "+somaPares/totalPares);
		
		

	}

}
