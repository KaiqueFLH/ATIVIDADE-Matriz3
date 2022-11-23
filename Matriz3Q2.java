package atv;
import java.util.Scanner;
public class Matriz3Q2 {

	public static void main(String[] args) {
		
			Scanner myobj = new Scanner(System.in);
		
			int matriz[][] = new int[7][4];
			String posicao="";
			int maior=0;
			
			for(int c=0;c<7;c++) {
				for(int l=0;l<4;l++) {
					System.out.println("Digite o Número Localizado na Coluna ["+(c+1)+"] : Linha ["+(l+1)+"]:");
					matriz[c][l] = myobj.nextInt();
				}
			}
			
			for(int c=0;c<7;c++) {
				for(int l=0;l<4;l++) {
					
					if(matriz[c][l]>maior) {
						maior=matriz[c][l];
						posicao="LOCALIZADO NA COLUNA ["+(c+1)+"] : LINHA ["+(l+1)+"]";
					}
				}
			}
			
			System.out.println("O MAIOR NÚMERO DA MATRIZ É: "+maior);
			System.out.println(posicao);
			

	}

}
