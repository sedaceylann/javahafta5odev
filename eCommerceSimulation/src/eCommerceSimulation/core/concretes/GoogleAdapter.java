package eCommerceSimulation.core.concretes;

import eCommerceSimulation.core.asbtracts.GoogleService;
import eCommerceSimulation.googleAuth.WithGoogle;

public class GoogleAdapter implements GoogleService {

	@Override
	public void registerWithGoogle(String message) {
		WithGoogle withGoogle = new WithGoogle();
		withGoogle.registerWithGoogle(message);
	}

}