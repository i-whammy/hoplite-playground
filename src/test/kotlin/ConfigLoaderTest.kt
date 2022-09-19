import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConfigLoaderTest {

    @Test
    internal fun testDb() {
        assertEquals(Db("localhost", 3306), ConfigLoader().db())
    }
}