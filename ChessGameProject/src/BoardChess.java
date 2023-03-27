import javax.swing.*;
import java.awt.*;

public class BoardChess {
	
	private JPanel chessBoard;

    public BoardChess() {
        chessBoard = new JPanel(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel square = new JPanel();
                if ((i + j) % 2 == 0) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.GRAY);
                }
                chessBoard.add(square);
            }
        }

        JFrame frame = new JFrame("Chess Board");
        frame.add(chessBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setResizable(false);
    }
	
	
	public static void main(String[] args) {
		
		new BoardChess();

	}

}
