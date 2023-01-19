package be.vdab.profiles.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@DataJpaTest
class DataSourceTest {
    private final DataSource dataSource;

    public DataSourceTest(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Test
    void databaseNaam() throws SQLException {
        try (var connection = dataSource.getConnection()) {
            System.out.println(connection.getCatalog());
        }
    }

}
