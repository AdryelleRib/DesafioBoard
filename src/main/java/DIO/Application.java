package DIO;

import DIO.PERSISTENCE.MIGRATION.MigrationStrategy;
import DIO.UI.MainMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

import static DIO.PERSISTENCE.CONFIG.ConnectionConfig.getConnection;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws SQLException {
		try (var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
	}

}
