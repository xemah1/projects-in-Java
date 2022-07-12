public class Main {

    public static void main(String[] args) throws InterruptedException {
        int x = 228;    //114 ve 115 ortası
        int y = 30;
        int r = 148;
        //int f = 6;
	String [][] board = new String[x][y];

        // creates eyes
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 8 && j == 103){board[j][i] = " ";} if (i == 9 && j == 103){board[j][i] = " ";}
                if (i == 8 && j == 104){board[j][i] = " ";} if (i == 9 && j == 104){board[j][i] = " ";}
                if (i == 8 && j == 105){board[j][i] = " ";} if (i == 9 && j == 105){board[j][i] = " ";}
                if (i == 8 && j == 106){board[j][i] = " ";} if (i == 9 && j == 106){board[j][i] = " ";}
                if (i == 8 && j == 107){board[j][i] = " ";} if (i == 9 && j == 107){board[j][i] = " ";}
                if (i == 8 && j == 108){board[j][i] = " ";} if (i == 9 && j == 108){board[j][i] = " ";}
                if (i == 8 && j == 109){board[j][i] = " ";} if (i == 9 && j == 109){board[j][i] = " ";}
                if (i == 8 && j == 110){board[j][i] = " ";} if (i == 9 && j == 110){board[j][i] = " ";}



                if (i == 8 && j == 116){board[j][i] = " ";} if (i == 9 && j == 116){board[j][i] = " ";}
                if (i == 8 && j == 117){board[j][i] = " ";} if (i == 9 && j == 117){board[j][i] = " ";}
                if (i == 8 && j == 118){board[j][i] = " ";} if (i == 9 && j == 118){board[j][i] = " ";}
                if (i == 8 && j == 119){board[j][i] = " ";} if (i == 9 && j == 119){board[j][i] = " ";}
                if (i == 8 && j == 120){board[j][i] = " ";} if (i == 9 && j == 120){board[j][i] = " ";}
                if (i == 8 && j == 121){board[j][i] = " ";} if (i == 9 && j == 121){board[j][i] = " ";}
                if (i == 8 && j == 122){board[j][i] = " ";} if (i == 9 && j == 122){board[j][i] = " ";}
                if (i == 8 && j == 123){board[j][i] = " ";} if (i == 9 && j == 123){board[j][i] = " ";}
            }
        }

        //creates mouth
        for (int i = 14; i < 16; i++) {
            for (int j = 102; j <= 124; j++) {
                board[j][i] = " ";
            }
        }

        //creates smile
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 14 && j == 101){board[j][i] = " ";} if (i == 15 && j == 101){board[j][i] = " ";}
                if (i == 14 && j == 100){board[j][i] = " ";} if (i == 13 && j == 100){board[j][i] = " ";} if (i == 15 && j == 100){board[j][i] = " ";}
                if (i == 14 && j == 99){board[j][i] = " ";} if (i == 13 && j == 99){board[j][i] = " ";} if (i == 15 && j == 99){board[j][i] = " ";}
                if (i == 14 && j == 98){board[j][i] = " ";} if (i == 13 && j == 98){board[j][i] = " ";}
                if (i == 14 && j == 97){board[j][i] = " ";} if (i == 13 && j == 97){board[j][i] = " ";}
                if (i == 14 && j == 96){board[j][i] = " ";} if (i == 13 && j == 96){board[j][i] = " ";}
                if (i == 12 && j == 95){board[j][i] = " ";} if (i == 13 && j == 95){board[j][i] = " ";}
                if (i == 12 && j == 94){board[j][i] = " ";} if (i == 13 && j == 94){board[j][i] = " ";}


                if (i == 14 && j == 125){board[j][i] = " ";} if (i == 15 && j == 125){board[j][i] = " ";}
                if (i == 14 && j == 126){board[j][i] = " ";} if (i == 13 && j == 126){board[j][i] = " ";} if (i == 15 && j == 126){board[j][i] = " ";}
                if (i == 14 && j == 127){board[j][i] = " ";} if (i == 13 && j == 127){board[j][i] = " ";} if (i == 15 && j == 127){board[j][i] = " ";}
                if (i == 14 && j == 128){board[j][i] = " ";} if (i == 13 && j == 128){board[j][i] = " ";}
                if (i == 14 && j == 129){board[j][i] = " ";} if (i == 13 && j == 129){board[j][i] = " ";}
                if (i == 14 && j == 130){board[j][i] = " ";} if (i == 13 && j == 130){board[j][i] = " ";}
                if (i == 12 && j == 131){board[j][i] = " ";} if (i == 13 && j == 131){board[j][i] = " ";}
                if (i == 12 && j == 132){board[j][i] = " ";} if (i == 13 && j == 132){board[j][i] = " ";}
            }
        }

        //creates hi! text
        board[r-1][16] = " ";board[r][16] = " ";board[r+1][16] = " ";
        board[r-1][17] = " ";board[r][17] = " ";board[r+1][17] = " ";
        board[r-1][18] = " ";board[r][18] = " ";board[r+1][18] = " ";board[r+2][18] = " ";board[r+3][18] = " ";board[r+4][18] = " ";
        board[r-1][19] = " ";board[r][19] = " ";board[r+1][19] = " ";
        board[r-1][20] = " ";board[r][20] = " ";board[r+1][20] = " ";
        board[r-1][21] = " ";board[r][21] = " ";board[r+1][21] = " ";

        board[r+5][16] = " ";board[r+6][16] = " ";board[r+7][16] = " ";
        board[r+5][17] = " ";board[r+6][17] = " ";board[r+7][17] = " ";
        board[r+5][18] = " ";board[r+6][18] = " ";board[r+7][18] = " ";
        board[r+5][19] = " ";board[r+6][19] = " ";board[r+7][19] = " ";
        board[r+5][20] = " ";board[r+6][20] = " ";board[r+7][20] = " ";
        board[r+5][21] = " ";board[r+6][21] = " ";board[r+7][21] = " ";

        board[r+10][16] = " ";board[r+11][16] = " ";board[r+12][16] = " ";board[r+13][16] = " ";board[r+14][16] = " ";
        board[r+15][16] = " ";board[r+16][16] = " ";board[r+17][16] = " ";board[r+18][16] = " ";
        board[r+13][16] = " ";board[r+14][16] = " ";board[r+15][16] = " ";
        board[r+13][17] = " ";board[r+14][17] = " ";board[r+15][17] = " ";
        board[r+13][18] = " ";board[r+14][18] = " ";board[r+15][18] = " ";
        board[r+13][19] = " ";board[r+14][19] = " ";board[r+15][19] = " ";
        board[r+13][20] = " ";board[r+14][20] = " ";board[r+15][20] = " ";
        board[r+10][21] = " ";board[r+11][21] = " ";board[r+12][21] = " ";board[r+13][21] = " ";board[r+14][21] = " ";
        board[r+15][21] = " ";board[r+16][21] = " ";board[r+17][21] = " ";board[r+18][21] = " ";

        board[r+21][16] = " ";board[r+22][16] = " ";board[r+23][16] = " ";
        board[r+21][17] = " ";board[r+22][17] = " ";board[r+23][17] = " ";
        board[r+21][18] = " ";board[r+22][18] = " ";board[r+23][18] = " ";
        board[r+21][19] = " ";board[r+22][19] = " ";board[r+23][19] = " ";
        board[r+21][21] = " ";board[r+22][21] = " ";board[r+23][21] = " ";

        //prints the array
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (board[j][i] == " " || board[j][i] == "-" || board[j][i] == "|" || board[j][i] == "_"){

                }else {
                    if (i == y - 1) {
                        board[j][i] = "_";
                    } else {
                        board[j][i] = "*";
                    }
                }
                System.out.print(board [j][i]);

            }
            System.out.println();
        }
        int t=0;
        while (t<10) {
            t += 1;
            board = motion1(board);
            Thread.sleep(3000); //keeps eye open

            //clearScreen(); //clears screen
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (board[j][i] == " " || board[j][i] == "-" || board[j][i] == "|" || board[j][i] == "_"){

                    }else {
                        if (i == y - 1) {
                            board[j][i] = "_";
                        } else {
                            board[j][i] = "*";
                        }
                    }
                    System.out.print(board [j][i]);

                }
                System.out.println();
            }
            board = motion2(board);
            Thread.sleep(500); //keeps half eye open

            //clearScreen(); //clears screen
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (board[j][i] == " " || board[j][i] == "-" || board[j][i] == "|" || board[j][i] == "_"){

                    }else {
                        if (i == y - 1) {
                            board[j][i] = "_";
                        } else {
                            board[j][i] = "*";
                        }
                    }
                    System.out.print(board [j][i]);

                }
                System.out.println();
            }
            board = motion3(board);
            Thread.sleep(1000); //keeps eye closed

            //clearScreen(); //clears screen
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (board[j][i] == " " || board[j][i] == "-" || board[j][i] == "|" || board[j][i] == "_"){

                    }else {
                        if (i == y - 1) {
                            board[j][i] = "_";
                        } else {
                            board[j][i] = "*";
                        }
                    }
                    System.out.print(board [j][i]);

                }
                System.out.println();
            }
            board = motion4(board);
            Thread.sleep(500); //keeps half eye closed

            //clearScreen(); //clears screen
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (board[j][i] == " " || board[j][i] == "-" || board[j][i] == "|" || board[j][i] == "_"){

                    }else {
                        if (i == y - 1) {
                            board[j][i] = "_";
                        } else {
                            board[j][i] = "*";
                        }
                    }
                    System.out.print(board [j][i]);

                }
                System.out.println();
            }
        }
    }
    public static String [][] motion1(String [][] board){
        for (int i = 103; i < 111; i++) {
            board[i][8] = "*";
        }
        for (int i = 116; i < 124; i++) {
            board[i][8] = "*";
        }
        return board;
    }
    public static String [][] motion2(String [][] board){
        for (int i = 103; i < 111; i++) {
            board[i][9] = "*";
        }
        for (int i = 116; i < 124; i++) {
            board[i][9] = "*";
        }
        return board;
    }
    public static String [][] motion3(String [][] board){
        for (int i = 103; i < 111; i++) {
            board[i][9] = " ";
        }
        for (int i = 116; i < 124; i++) {
            board[i][9] = " ";
        }
        return board;
    }
    public static String [][] motion4(String [][] board){
        for (int i = 103; i < 111; i++) {
            board[i][8] = " ";
        }
        for (int i = 116; i < 124; i++) {
            board[i][8] = " ";
        }
        return board;
    }
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
