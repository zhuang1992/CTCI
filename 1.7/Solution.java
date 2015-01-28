package workbench1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	void setZero(int mat[][]){
		int m = mat.length;
		int n = mat[0].length;
		boolean row[] = new boolean[m];
		boolean col[] = new boolean[n];
		for(int i = 0; i < m; i++){
			for(int j = 0;j < n; j++){
				if(mat[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}					
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0;j < n; j++){
				if(row[i] || col[j]){
					mat[i][j] = 0;
				}					
			}
		}
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
        int mat[][] = {{1,0,0},{0,6,0},{9,10,11}};                                                  
        test.showMatrix(mat);
        test.setZero(mat);
        test.showMatrix(mat);
	}
}
