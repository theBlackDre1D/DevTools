package co.init.devtools

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "request")
data class RequestEntity(
    @PrimaryKey val id: Int,

    @ColumnInfo(name = "request_name") val requestName: String,
    @ColumnInfo(name = "request_url") val requestUrl: String,
    @ColumnInfo(name = "headers") val headers: HashMap<String, Any>,
    @ColumnInfo(name = "is_successful") val isSuccessful: Boolean,
    @ColumnInfo(name = "body") val body: String
)