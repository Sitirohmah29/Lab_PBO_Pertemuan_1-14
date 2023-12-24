package com.ibik.pbo.Pembelajaran;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements MouseListener {

    private int[][] board = new int[3][3]; // 0 = empty, 1 = X, 2 = O
    private int turn = 1; // 1 = X, 2 = O
    private boolean gameOver = false;

    public TicTacToe() {
        setSize(300, 300);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addMouseListener(this);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawBoard(g);

        if (gameOver) {
            displayWinner();
        }
    }

    private void drawBoard(Graphics g) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = i * 100 + 50;
                int y = j * 100 + 50;

                if (board[i][j] == 1) {
                    g.drawLine(x - 40, y - 40, x + 40, y + 40);
                    g.drawLine(x + 40, y - 40, x - 40, y + 40);
                } else if (board[i][j] == 2) {
                    g.drawOval(x - 40, y - 40, 80, 80);
                }
            }
        }
    }

    private void displayWinner() {
        int winner = checkWinner();
        if (winner == 1) {
            JOptionPane.showMessageDialog(this, "Player X wins!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        } else if (winner == 2) {
            JOptionPane.showMessageDialog(this, "Player O wins!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "It's a tie!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private int checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                return board[i][0];
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != 0) {
                return board[0][j];
            }
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
            return board[0][0];
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
            return board[0][2];
        }

        // Check for a tie
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return 0; // The game is not over yet
                }
            }
        }

        return -1; // It's a tie
    }

    public void mouseClicked(MouseEvent e) {
        if (gameOver) {
            return;
        }

        int x = e.getX() / 100;
        int y = e.getY() / 100;

        if (board[x][y] == 0) {
            board[x][y] = turn;
            turn = (turn == 1) ? 2 : 1;
            repaint();

            int winner = checkWinner();
            if (winner != 0) {
                gameOver = true;
                repaint();
                displayWinner();
            }
        }
    }

    // Other MouseListener methods (mousePressed, mouseReleased, mouseEntered, mouseExited)
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new TicTacToe();
    }
}
