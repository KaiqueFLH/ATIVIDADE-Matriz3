package atividades;
import java.util.Random;
public class Matriz3Q6 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int matriz[][] = new int[7][8];
		
		for(int c=0;c<7;c++) {
			for(int l=0;l<8;l++) {
				matriz[c][l] = aleatorio.nextInt(100);
				System.out.println("COLUNA ["+(c+1)+"] : LINHA ["+(l+1)+"]:"+matriz[c][l]);
				matriz[c][l]+=matriz[c][l];
			}
			
		}
		System.out.println("=========================================================================");
		System.out.println("=========================================================================");
		System.out.println("RESULTADO SOMA MATRIZ [7,8]:");
		for(int c=0;c<7;c++) {
			for(int l=0;l<8;l++) {
				System.out.println("COLUNA ["+(c+1)+"] : LINHA ["+(l+1)+"]:"+matriz[c][l]);
			}
		}
	}
}
