package atividades;
import java.util.Scanner;
public class Matriz3Q3 {

	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		int matriz[][] = new int[5][5];
		int linha4=0,coluna2=0,diagonalP=0,diagonalS=0,somaTotal=0;
		
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				System.out.println("Digite o Número Localizado na Coluna ["+(c+1)+"] : Linha ["+(l+1)+"]: ");
				matriz[l][c]=myobj.nextInt();
			}
		}
		for(int c=0;c<5;c++) {
				linha4 += matriz[3][c];
			
		}
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				if(c==1) {
					coluna2 += matriz[l][c];
				}
				
			}
		}
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				if(c==l) {
					diagonalP += matriz[l][c];
				}
			}
		}
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				if(c+l==4) {
					diagonalS += matriz[l][c];
				}
			}
		}
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				somaTotal += matriz[l][c];
			}
		}
		System.out.println("===================================================================================");
		System.out.println("MATRIZ M:");
		for(int c=0;c<5;c++) {
			for(int l=0;l<5;l++) {
				System.out.println("COLUNA ["+(c+1)+"] : LINHA["+(l+1)+"]:"+matriz[l][c]);
			}
		}
		
		System.out.println("===================================================================================");
		System.out.println("AS SOMAS DOS VALORES DA LINHA 4 SÃO: "+linha4);
		System.out.println("===================================================================================");
		System.out.println("AS SOMAS DOS VALORES DA COLUNA 2 SÃO: "+coluna2);
		System.out.println("===================================================================================");
		System.out.println("AS SOMAS DOS VALORES DA DIAGONAL PRINCIPAL SÃO: "+diagonalP);
		System.out.println("===================================================================================");
		System.out.println("AS SOMAS DOS VALORES DA DIAGONAL SECUNDÁRIA SÃO: "+diagonalS);
		System.out.println("===================================================================================");
		System.out.println("AS SOMAS DE TODOS OS VALORES SÃO: "+somaTotal);
		System.out.println("===================================================================================");
	}
}