package si.uni_lj.fri.pbd.sensecontext.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "rule_table")
data class Rule (
    @PrimaryKey(autoGenerate = true)
    val rule_id: Long,
    val aspect: String?,
    val min_slope: Double?,
    val max_slope: Double?,
    val elevation_min: Double?,
    val elevation_max: Double?,
    val user_hiking: Boolean, // if notification is shown when user is hiking, otherwise notification can be shown anytime,
    val notification_name: String,
    val notification_text: String
)