package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona p = new Persona();

		System.out.println("Nombre: ");
		p.setNombre(scanner.nextLine());
		System.out.println("Apellido: ");
		p.setApellido(scanner.nextLine());
		System.out.println("Edad: ");
		p.setEdad(scanner.nextInt());

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

		scanner.close();
	}

}