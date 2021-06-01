package com.amfo.matuus.database

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Singleton class representing Apllication inner database
 *
 */
@Database(entities = arrayOf(), version = 1)
abstract class Database : RoomDatabase() {

}