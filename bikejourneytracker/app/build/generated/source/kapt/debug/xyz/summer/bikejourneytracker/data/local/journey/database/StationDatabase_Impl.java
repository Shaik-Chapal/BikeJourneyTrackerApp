package xyz.summer.bikejourneytracker.data.local.journey.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao;
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao_Impl;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StationDatabase_Impl extends StationDatabase {
  private volatile StationDao _stationDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `station_beer` (`adress` TEXT NOT NULL, `fid` INTEGER NOT NULL, `id` INTEGER NOT NULL, `kapasiteet` INTEGER NOT NULL, `kaupunki` TEXT NOT NULL, `name` TEXT NOT NULL, `namn` TEXT NOT NULL, `nimi` TEXT NOT NULL, `operaattor` TEXT NOT NULL, `osoite` TEXT NOT NULL, `stad` TEXT NOT NULL, `x` REAL NOT NULL, `y` REAL NOT NULL, PRIMARY KEY(`fid`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6b7cc4ff8295d24b47af1d4a76398c1e')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `station_beer`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsStationBeer = new HashMap<String, TableInfo.Column>(13);
        _columnsStationBeer.put("adress", new TableInfo.Column("adress", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("fid", new TableInfo.Column("fid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("kapasiteet", new TableInfo.Column("kapasiteet", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("kaupunki", new TableInfo.Column("kaupunki", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("namn", new TableInfo.Column("namn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("nimi", new TableInfo.Column("nimi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("operaattor", new TableInfo.Column("operaattor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("osoite", new TableInfo.Column("osoite", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("stad", new TableInfo.Column("stad", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("x", new TableInfo.Column("x", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStationBeer.put("y", new TableInfo.Column("y", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStationBeer = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStationBeer = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStationBeer = new TableInfo("station_beer", _columnsStationBeer, _foreignKeysStationBeer, _indicesStationBeer);
        final TableInfo _existingStationBeer = TableInfo.read(db, "station_beer");
        if (!_infoStationBeer.equals(_existingStationBeer)) {
          return new RoomOpenHelper.ValidationResult(false, "station_beer(xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity).\n"
                  + " Expected:\n" + _infoStationBeer + "\n"
                  + " Found:\n" + _existingStationBeer);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "6b7cc4ff8295d24b47af1d4a76398c1e", "e6bde5288ac21e03c2488131df643959");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "station_beer");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `station_beer`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(StationDao.class, StationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public StationDao stationDao() {
    if (_stationDao != null) {
      return _stationDao;
    } else {
      synchronized(this) {
        if(_stationDao == null) {
          _stationDao = new StationDao_Impl(this);
        }
        return _stationDao;
      }
    }
  }
}
