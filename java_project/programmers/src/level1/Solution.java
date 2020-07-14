package level1;

import java.util.Scanner;

public class Solution {

	static Scanner sc = new Scanner(System.in);

	public static int solution(int[][] board, int[] moves) {
		int [] box = new int[5];
		int answer = 0;
		int mcnt=0;
		int bcnt=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
		System.out.print(board[i][j]);
			}
			System.out.println("");
		}
		
		
		for(int boxes : box) {
			
		moves[mcnt] = sc.nextInt();
		
		for(int i=0;i<5;i++) {
			if(board[i][moves[mcnt]]>0 && board[i][moves[0]]<6 ) {
				box[bcnt]=board[i][moves[mcnt]];
				board[i][moves[mcnt]]=0;
				System.out.print(box[bcnt]+" ");
				if(bcnt > 0 && box[bcnt]==box[bcnt-1]) {
					answer+=2;
					bcnt-=1;
				}
				mcnt++;
				bcnt++;
				break;
			}
			
		}
		}

		return answer;
	}

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, 
						  { 0, 0, 1, 0, 3 }, 
						  { 0, 2, 5, 0, 1 }, 
						  { 4, 2, 4, 4, 2 },
						  { 3, 5, 1, 3, 1 } };
		

		int[] moves = new int[5];
		int answer = 0;
		
		answer = solution(board, moves);
		System.out.println("터뜨린 인형수 : "+answer);

	}

}
