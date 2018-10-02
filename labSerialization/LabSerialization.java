package labSerialization;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
	public static void main(String[] args) {
		ListVsSetDemo demo = new ListVsSetDemo(new ColoredSquare(4, Color.RED), new ColoredSquare(6, Color.BLUE),
				new ColoredSquare(4, Color.RED), new ColoredSquare(8, Color.YELLOW));

		// testDemo(demo);
		String path = "src/labSerialization/Demo.ser";
		serialize(demo, path);
		ListVsSetDemo newDemo = deserialize(path);
		testDemo(newDemo);

	};

	private static void serialize(ListVsSetDemo demo, String fileName) {
		try (ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream(fileName))) {
			serializer.writeObject(demo); // serialize demo object
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static ListVsSetDemo deserialize(String fileName) {
		try (ObjectInputStream deserializer = new ObjectInputStream(new FileInputStream(fileName))) {
			return (ListVsSetDemo) deserializer.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void testDemo(ListVsSetDemo demo) {
		System.out.println("List:");
		System.out.println(demo.getListElements());
		System.out.println("Set:");
		System.out.println(demo.getSetElements());
	}

}
