package voetbalvereniging;

interface Omkoopbaar {
	int omkopen(int geld, String dreigBrief) throws NietTeVertrouwenException;
	
}
class NietTeVertrouwenException extends Exception{}