/**
 * SudokuSolver.java
 * Copyright (C) Jeremy Felipe 2016
 */

/**
 * SudokuSolver
 * 
 * @author Jeremy Felipe
 *
 *
 */
public class SudokuSolver {

  // Data Field
  int[][] sudo;


  /**
   * 
   */
  public SudokuSolver(int[][] sudo) {
    
    this.sudo = sudo;
  }


  public int solve ( int input) {
    if ()
  }


  private boolean checkDone(int[][] check) {
    boolean solved = true;
    int solCheck = 0;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        solCheck +=check[i][j];
      }
    }
  }
}
