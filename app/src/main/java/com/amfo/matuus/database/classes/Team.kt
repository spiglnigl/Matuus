package com.amfo.matuus.database.classes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data class representing a team
 */
@Entity
data class Team(
    /** Auto-generated Id of the team. */
    @PrimaryKey(autoGenerate = false) val teamId: Int,
    /** Name of the team.*/
    @ColumnInfo(name = "teamName") val teamName: String,
    /** Three character long abbreviation of the team */
    @ColumnInfo(name = "teamAbbreviation") val teamAbbreviation: String
)
