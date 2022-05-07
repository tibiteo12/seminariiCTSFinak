package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Reader {

	@Override
	public List<Aplicant> readAplicanti(String file) {
		Scanner input2 = null;
		try {
			input2 = new Scanner(new File(file));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev = new Elev();
			readDateAplicant(input2, elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}

}
