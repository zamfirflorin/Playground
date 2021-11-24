package telacad.spring.reflection;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class QuickTest {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3};
		


		int[][] matrix = {{1, 0, 0, 1, 0}, {1, 0, 1, 0, 0},{0, 0, 1, 0, 1},{1, 0, 1, 0, 1},{1, 0, 1, 1, 0}};
		ArrayList<Integer> result = riverSizes(matrix);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
	
	public static ArrayList<Integer> riverSizes(int[][] matrix) {
		int length = matrix.length; 
		int width = matrix[0].length;
		boolean[][] aux = new boolean[length][width];
		ArrayList<Integer> result = new ArrayList<>();

		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				int line = i;
				int col = j;
				
				int up = i <= 0 ? 0 : matrix[i - 1][j];
				int down = i == matrix.length - 1 ? 0 : matrix[i + 1][j];
				int left = j <= 0 ? 0 : matrix[i][j - 1];
				int right = j == matrix[i].length - 1 ? 0 : matrix[i][j + 1];	
				
				int element = matrix[i][j];
				boolean wasVisited = aux[i][j];
				int counter = 0;
				if (element == 1 && !wasVisited) {
					counter += 1;
					boolean nextToVisit = col + 1 >= width ? true : aux[line][col + 1];
					
					while (right == 1 && !nextToVisit) {
						counter++;
						aux[line][col + 1] = true;
						right = col >= width - 1 ? 0 : matrix[line][col + 1];
						col += 1;
						nextToVisit = col + 1 >= width ? true : aux[line][col];
					}
					line = i;
					col = j;
					nextToVisit = line + 1 >= length ? true : aux[line + 1][col];
					while (down == 1 && !nextToVisit) {
						counter++;
						aux[line + 1][col] = true;
						down = line == length - 1 ? 0 : matrix[line + 1][col];
						line++;
						nextToVisit = line >= length ? true : aux[line][col];
					}
					line = i;
					col = j;
					nextToVisit = col == 0 ? true : aux[line][col - 1];
					while (left == 1 && !nextToVisit) {
						counter++;
						aux[line][col - 1] = true;
						left = col != 0 ? matrix[line][col - 1] : 0;
						col--;
						nextToVisit = col <= 0 ? true : aux[line][col];
					}
					line = i;
					col = j;
					nextToVisit = line == 0 ? true : aux[line - 1][col];
					while (up == 1 && !nextToVisit) {
						counter++;
						aux[line - 1][col] = true;
						up = line != 0 ? matrix[line - 1][col] : 0;
						line--;
						nextToVisit = line <= 0 ? true : aux[line][col];
					}
					result.add(counter);
				}

			}
		}

    return result;
  }

}
