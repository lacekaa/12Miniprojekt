/**
 * Implements a visitor that creates a string representation from the fields of
 * a board and makes it available via a getter.
 * 
 * @author Marcus
 *
 */
public class FieldStringifyer implements Visitor { // TODO: change type declaration
	private String text = "";

	public String getText() {
		return text;
	}

	public void nextField(Field field) {
		text += field.toString();
	}

	public void nextRow() {
		text += "\n";
	}

	/**
	 * The text that has been gathered by the stringifyer.
	 */
	// TODO: add text variable

	/**
	 * Returns the text that has been gathered by the stringifyer so far.
	 * 
	 * @return The text of the stringifyer.
	 */
	// TODO: add getter for text

	/**
	 * Appends the string representation of the field to the text.
	 * 
	 * @param field The field whose string representation should be appended.
	 */
	// TODO: override nextField

	/**
	 * Appends a newline character ("\n") to the text.
	 */
	// TODO: override nextRow

}
