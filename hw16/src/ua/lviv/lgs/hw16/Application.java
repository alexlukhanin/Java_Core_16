/**
 * 
 */
package ua.lviv.lgs.hw16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author alexl
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws NoSuchFieldException
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		/* non reflection way to create players */
		Player player1 = new Player(22, 95.5, 198.5, "Aaron", "SG");
		Player player2 = new Player(24, 105, 208, "John", "PF");
		Player player3 = new Player(28, 110, 212, "Mark", "C");

		/* Reflection: */
		Class<Human> humanClass = Human.class;

		/* Information about Human class */
		System.out.println();
		System.out.println("Constructors of class " + humanClass.getSimpleName() + ":");
		Constructor<?>[] constructors1 = humanClass.getConstructors();
		for (int i = 0; i < constructors1.length; i++) {
			Constructor<?> constructor = constructors1[i];
			System.out.println(constructor);
		}

		System.out.println();
		System.out.println("Declared Fields of class " + humanClass.getSimpleName() + ":");
		Field[] declaredFields1 = humanClass.getDeclaredFields();
		for (int i = 0; i < declaredFields1.length; i++) {
			Field field = declaredFields1[i];
			System.out.println(field);
		}

		System.out.println();
		System.out.println("Declared Methods of class " + humanClass.getSimpleName() + ":");
		Method[] declaredMethods1 = humanClass.getDeclaredMethods();
		for (int i = 0; i < declaredMethods1.length; i++) {
			Method method = declaredMethods1[i];
			System.out.println(method);
		}

		/* Information about Player class */

		Class<Player> playerClass1 = Player.class;
		Class<? extends Player> playerClass2 = player2.getClass();

		Class<?>[] interfaces = playerClass1.getInterfaces();
		System.out.println();
		int counter = 0;
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println(interfaces[i]);
			counter++;
		}
		if (counter == 0) {
			System.out.println("Class " + playerClass1.getSimpleName() + " has not any interfaces");
		}

		System.out.println("Super class of the class '" + playerClass2.getSimpleName() + "' is "
				+ playerClass2.getSuperclass().toString());
		System.out.println();
		System.out.println("Super class of the class '" + humanClass.getSimpleName() + "' is "
				+ humanClass.getSuperclass().toString());

		System.out.println();
		Constructor<Player> constructor1 = playerClass1.getConstructor(int.class, double.class, double.class,
				String.class, String.class);

		Player player4 = constructor1.newInstance(26, 98, 205, "Mat", "SF");
		System.out.println(player4);
		System.out.println();
		Method method = playerClass1.getMethod("playBasketball");
		method.invoke(player4);

		System.out.println();
		Field[] fields = playerClass1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		System.out.println("\nTask Maximum:");
		// 2.
		Field field1 = fields[0];
		field1.setAccessible(true);
		field1.set(player4, "PF");
		System.out.println(player4);
		String s = playerClass1.getName();
		System.out.println(s);

		System.out.println();
		System.out.println("Declared Methods of class " + playerClass1.getSimpleName() + ":");
		Method[] declaredMethods2 = playerClass1.getMethods();
		for (Method method2 : declaredMethods2) {
			System.out.println(method2);
		}
		// 3.
		System.out.println();
		Method MyMethod = playerClass1.getMethod("playBasketball", null);
		Method MyMethod1 = playerClass1.getMethod("setName", String.class);

		MyMethod.invoke(player3, null);
		MyMethod1.invoke(player2, "Peter");
		System.out.println(player2);

		Human newInstanceHuman = humanClass.getConstructor(int.class, double.class, double.class, String.class)
				.newInstance(48, 85.2, 178.5, "Jack");
		System.out.println(newInstanceHuman);
		humanClass.getMethod("run", null).invoke(newInstanceHuman, null);
		playerClass1.getMethod("walk", null).invoke(player1, null);
		System.out.println();
		Field field4 = playerClass2.getField("name");
		System.out.println(field4);
		field4.set(player1, "Sonny");
		System.out.println(player1);
		
	}

}
