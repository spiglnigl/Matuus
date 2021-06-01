package com.amfo.matuus.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.amfo.matuus.database.classes.Team

@Dao
interface TeamDAO {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(team: Team)

    @Query("Select *" +
            "from Team")
    fun getAllTeams(): List<Team>

    @Query("Select *" +
            "from Team" +
            "where teamId = :teamId")
    fun getTeam(teamId: Int): Team

    @Query("Select *" +
            "from Team" +
            "where teamName = :teamId")
    fun getTeamFromName(teamName: String): List<Team>

    @Query("Select *" +
            "from Team" +
            "where teamAbbreviation = :teamAbbreviation")
    fun getTeamsFromAbbr(teamAbbreviation: String): List<Team>
}
