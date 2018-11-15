package voetbalvereniging;

public interface Transfereerbaar {
	boolean transfereren(Vereniging verenigingVerleden, Vereniging verenigingToekomst, int bedrag) throws ContributieNietBetaaldException;
}
