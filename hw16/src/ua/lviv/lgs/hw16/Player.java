/**
 * 
 */
package ua.lviv.lgs.hw16;

/**
 * @author alexl
 *
 */
public class Player extends Human {

	private String position;

	/**
	 * @param age
	 * @param weight
	 * @param height
	 * @param name
	 * @param position
	 */
	public Player(int age, double weight, double height, String name, String position) {
		super(age, weight, height, name);
		this.position = position;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [position=" + position + ", getAge()=" + getAge() + ", getWeight()=" + getWeight()
				+ ", getHeight()=" + getHeight() + ", getName()=" + getName() + "]";
	}

	public void playBasketball() {

		System.out.println("Player " + super.getName().toString() + " is playing Basketball");
	}

}
