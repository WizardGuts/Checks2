import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public enum CheckersPieceType {
	PLAYER1(1), PLAYER2(-1);
	
	final int direction;
	
	CheckersPieceType(int direction) {
		this.direction = direction;
	}
}