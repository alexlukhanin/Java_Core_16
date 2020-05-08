/**
 * 
 */
package ua.lviv.lgs.hw16;

/**
 * @author alexl
 *
 */
public class Human {

	private int age;
	private double weight;
	private double height;
	public String name;

	/**
	 * @param age
	 * @param weight
	 * @param height
	 * @param name
	 * 
	 */
	public Human(int age, double weight, double height, String name) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;

	}

	/**
	 * 
	 */
	public Human() {
		super();
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}

	public void walk() {

		System.out.println("Human " + name + " is walking");
	}

	public void run() {

		System.out.println("Human " + name + " is running");
	}

	public void talk() {

		System.out.println("Human " + name + " is talking");
	}

}
