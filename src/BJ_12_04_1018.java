import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BJ_12_04_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();

        String[][] board = new String[n][m];
        String[][] board_original = new String[n][m];
        int count = 0;

        String[] mark = {"B", "W"};
        ArrayList<String> mark_list = new ArrayList<>(Arrays.asList(mark));

        for(int i=0; i<n; i++) {
            board[i] = sc.nextLine().split("");
        }
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                board_original[i][j] = board[i][j];
            }
        }

        int min = 64;

        for(int i0=0; i0<n-7; i0++) {
            for(int i1=0;i1<m-7; i1++) {
                count = 0;
        
                for(int i=0; i<board.length; i++) {
                    for(int j=0; j<board[i].length; j++) {
                        board[i][j] = board_original[i][j];
                    }
                }

                for(int i=i0; i<i0+8; i++) {
                    for(int j=i1; j<i1+8; j++) {
                        if(i == i0) {
                            if(j == i1) {

                            } else if(j == i1+7) {
                                if(board[i][j-1].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else {
                                if(board[i][j-1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            }
                        } else if(i == i0+7) {
                            if(j == i1) {
                                if(board[i-1][j].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else if(j == i1+7) {
                                if(board[i][j-1].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i-1][j].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else {
                                if(board[i-1][j].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i][j-1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            }
                        } else {
                            if(j == i1) {
                                if(board[i-1][j].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else if(j == i1+7) {
                                if(board[i][j-1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i-1][j].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else {
                                if(board[i][j-1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i-1][j].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            }
                        }
                    }
                }

                
                System.out.println("1 - count : " + count);

                if(min > count) {
                    min = count;
                }
                
                count = 0;
        
                for(int i=0; i<board.length; i++) {
                    for(int j=0; j<board[i].length; j++) {
                        board[i][j] = board_original[i][j];
                    }
                }
                
                for(int i=i0+7; i>=i0; i--) {
                    for(int j=i1+7; j>=i1; j--) {
                        if(i == i0+7) {
                            if(j == i1+7) {

                            } else if(j == i1) {
                                if(board[i][j+1].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else {
                                if(board[i][j+1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            }
                        } else if(i == i0) {
                            if(j == i1+7) {
                                if(board[i+1][j].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else if(j == i1) {
                                if(board[i][j+1].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i+1][j].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else {
                                if(board[i+1][j].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i][j+1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            }
                        } else {
                            if(j == i1+7) {
                                if(board[i+1][j].equals(board[i][j])) {
                                    count++;
                                    
                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else if(j == i1) {
                                if(board[i][j+1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i+1][j].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            } else {
                                if(board[i][j+1].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                } else if(board[i+1][j].equals(board[i][j])) {
                                    count++;

                                    board[i][j] = mark_list.get(((mark_list.indexOf(board[i][j])+1)%mark_list.size()));
                                }
                            }
                        }
                    }
                }
                

                System.out.println("2 - count : " + count);

                if(min > count) {
                    min = count;
                }
            }
        }

        System.out.println(min);

        sc.close();
    }
}