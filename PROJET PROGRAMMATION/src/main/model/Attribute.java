package main.model;

/**
 * This class represent an attribute of a table, a column where we put values.
 * 
 * For example, we can have a table "Car" and an attribute "matriculation" where we put the matriculation of the car.
 * @author Céline
 *
 */
public class Attribute {

	/**
	 * The name of the attribute.
	 */
	private String name;

	/**
	 * The type of the attribute that is an enumeration (wich contains VARCHAR, NUMBER...).
	 */
	private AttributeType type;

	/**
	 * Initialize the name and the type of the Attribute whith those passed in parameter.
	 * @param name the name of the Attribute
	 * @param type the type of the Attribute
	 */
	public Attribute(String name, AttributeType type) {
		this.setName(name);
		this.setType(type);
	}

	/**
	 * Return the name of the Attribute.
	 * @return the name of the Attribute
	 */
	public String getName() {

		return name;
	}

	/**
	 * Return the type of the Attribute which is an element of the enumeration named "AttributeType".
	 * @return the type of the Attribute
	 */
	public AttributeType getType() {

		return type;
	}

	/**
	 * Set a new name to the Attribute.
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set a new type to the Attribute.
	 * @param type the new type
	 */
	public void setType(AttributeType type) {
		this.type = type;
	}

	public boolean equals(Attribute other) {
		boolean ret = false;

		if (other != null) {
			if (other.getName().equals(name) && other.getType() == type)
				ret = true;
		}
		return ret;
	}
}
