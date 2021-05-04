package Concrete;

import Abstract.ValidationService;
import Entities.Gamer;

public class ValidationManager implements ValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		if (gamer.getNationalIdentity().length() > 10 & gamer.getFirstName().length() == 3) {
			return true;
		}
		else {
			System.out.println("National Identity or first name is not valid");
			return false;
		}
	}
}
