package si.uni_lj.fri.pbd.sensecontext.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun add_weather_hour(weatherHour: WeatherHour)

    @Query("SELECT * FROM weather_table ORDER BY id ASC")
    fun readAllData(): List<WeatherHour>
}