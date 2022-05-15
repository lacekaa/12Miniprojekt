/**
 * An abstract base class for fields.
 * 
 * @author Marcus
 */
public abstract class Field {
	private int x;
	private int y;
	private boolean marked;

	public boolean isMarked() {
		return marked;
	}

	public void setMarked(boolean marked) {
		this.marked = marked;
	}

	public Field(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + "," + this.y + "," + this.marked + "," + this.getColor() + ")";
	}

	/**
	 * The x coordinate of the field.
	 */
	// TODO: x field

	/**
	 * The y coordinate of the field.
	 */
	// TODO: y field

	/**
	 * The marked state of the field.
	 */
	// TODO: marked field

	/**
	 * Creates a new field at the specified position.
	 * 
	 * @param x The x coordinate.
	 * @param y The y coordinate.
	 */
	// TODO: constructor with x and y

	/**
	 * Sets the marked state of the field.
	 * 
	 * @param marked True to mark, false to unmark.
	 */
	// TODO: setter for marked

	/**
	 * Determines whether the field is marked.
	 * 
	 * @return True if the field is marked, false otherwise.
	 */
	// TODO: getter form marked.

	/**
	 * Returns a string that represents the field's color.
	 * 
	 * @return The color of the field.
	 */
	public abstract String getColor();

	/**
	 * Returns a string representation to representing the state of the field. The
	 * string representation starts with an opening bracket followed by the x
	 * coordinate followed by a comma followed by the y coordinate followed by a
	 * comma followed by the marked state followed by a comma followed by the color
	 * followed by a closing bracket.
	 * 
	 * @return A string representation of the following form: (x,y,marked,color).
	 */
	// TODO: override java.lang.Object.toString()
}
