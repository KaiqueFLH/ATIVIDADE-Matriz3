package atividades;
import java.util.Scanner;
public class Matriz3Q4 {

	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		
		int matriz[][] = new int[5][5],matrizCubo[][] = new int[5][5];

		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				System.out.println("DIGITE O NÚMERO LOCALIZADO NA COLUNA ["+(c+1)+"] : LINHA ["+(l+1)+"]:");
				matriz[l][c] = myobj.nextInt();
			}
		}
		
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				matrizCubo[l][c]= (matriz[l][c]*matriz[l][c]*matriz[l][c]);
			}
		}
		System.out.println("===================================================================");
		System.out.println("MATRIZ AO CUBO:");
		
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				System.out.println("COLUNA ["+(c+1)+"] : LINHA ["+(l+1)+"]:" + matrizCubo[l][c]);
			}
		}
	}

}
