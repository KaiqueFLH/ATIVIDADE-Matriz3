package atividades;
import java.util.Scanner;
public class Matriz3Q5 {

	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		
		int matriz[][] = new int[3][4];
		
		for(int c=0;c<3;c++) {
			for(int l=0;l<4;l++) {
				System.out.println("DIGITE O NÚMERO LOCALIZADO NA COLUNA ["+(c+1)+"] : LINHA ["+(l+1)+"]:");
				matriz[c][l] = myobj.nextInt();
			}
		}
		
		System.out.println("CANTO SUPERIOR ESQUERDO = "+matriz[0][0]);
		System.out.println("CANTO INFERIOR ESQUERDO = "+matriz[0][3]);
	}

}
