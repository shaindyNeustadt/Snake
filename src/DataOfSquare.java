import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

	// ArrayList that contains the colors
	ArrayList<Color> colorList = new ArrayList<Color>();
	int color; // 2: snake , 1: food, 0:empty
	SquarePanel square;

	public DataOfSquare(int col) {

		// Lets add the color to the arrayList
		colorList.add(Color.darkGray);// 0
		colorList.add(Color.BLUE); // 1
		colorList.add(Color.white); // 2
		color = col;
		square = new SquarePanel(colorList.get(color));
	}

	public void lightMeUp(int c) {
		square.ChangeColor(colorList.get(c));
	}
}