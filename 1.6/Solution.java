package workbench1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	void rotate(int mat[][], int rad){
		int m = mat.length-2*rad;
		int n = mat[0].length-2*rad;
		if(m <= 1)
			return ;
		for(int i = 0; i < n-1; i++){
			int temp = mat[rad][rad+i];
			mat[rad][rad+i] = mat[rad+m-i-1][rad];
			mat[rad+m-i-1][rad] = mat[rad+m-1][rad+n-i-1];
			mat[rad+m-1][rad+n-i-1] = mat[rad+i][rad+n-1];
			mat[rad+i][rad+n-1] = temp;
		}
		rotate(mat, rad+1);
		return;
	}
	
	void showMatrix(int mat[][]){
		int m = mat.length;
		int n = mat[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0;j < n; j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args){
		Solution test = new Solution();
        int mat[][] = {{1,2,3},{5,6,7},{9,10,11}};                                                  
        test.showMatrix(mat);
        test.rotate(mat, 0);
        test.showMatrix(mat);
	}
}
