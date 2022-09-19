import com.sksamuel.hoplite.ConfigLoaderBuilder
import com.sksamuel.hoplite.addResourceSource

class ConfigLoader {
    var config: Config = ConfigLoaderBuilder.default().addResourceSource("/uat.properties").build().loadConfigOrThrow<Config>()

    fun db(): Db {
        return config.db
    }
}

data class Db(val host: String, val port: Int)

data class Config(val db: Db)