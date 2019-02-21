package cache.accesseur;

public interface PenseeURL {
	public static final String DSN = "jdbc:sqlite:C:/sqlite/bases/cache.inspiration.db";
	public static final String SQL_ENREGISTRER_PENSEE = "insert into pensee(auteur, message) values(?,?)";
	public static final String SQL_LISTER_PENSEES = "SELECT * FROM pensee";
}
