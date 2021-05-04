package Concrete;

import Abstract.GamerService;
import Abstract.ValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private ValidationService validationService;

	public GamerManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(validationService.validate(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " added");
		}
		else {
			System.out.println("Information is incorrect");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(validationService.validate(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " has been updated");
		}
		else {
			System.out.println("Information is incorrect");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " deleted");
	}

}
