package fromjavascript;

import java.nio.file.Path;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ScriptTest {
	public static void main(String[] args) throws Exception {
		Path path = java.nio.file.Paths.get("jjstest/sales.txt");
		Stream<String> lines = java.nio.file.Files.lines(path);
		DoubleStream ds = lines.mapToDouble(a -> Double.parseDouble(a));
		System.out.println("Total: " + ds.sum());

		lines = java.nio.file.Files.lines(path);
		ds = lines.mapToDouble(a -> Double.parseDouble(a));
		System.out.println("Average: " + ds.average().getAsDouble());
		
	}
}
