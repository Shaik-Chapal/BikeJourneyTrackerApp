package xyz.summer.bikejourneytracker.data.local.journey.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StationDao_Impl implements StationDao {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllStation;

  private final EntityUpsertionAdapter<StationEntity> __upsertionAdapterOfStationEntity;

  public StationDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfDeleteAllStation = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM station_beer";
        return _query;
      }
    };
    this.__upsertionAdapterOfStationEntity = new EntityUpsertionAdapter<StationEntity>(new EntityInsertionAdapter<StationEntity>(__db) {
      @Override
      @NonNull
      public String createQuery() {
        return "INSERT INTO `station_beer` (`adress`,`fid`,`id`,`kapasiteet`,`kaupunki`,`name`,`namn`,`nimi`,`operaattor`,`osoite`,`stad`,`x`,`y`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final StationEntity entity) {
        if (entity.getAdress() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getAdress());
        }
        statement.bindLong(2, entity.getFid());
        statement.bindLong(3, entity.getId());
        statement.bindLong(4, entity.getKapasiteet());
        if (entity.getKaupunki() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getKaupunki());
        }
        if (entity.getName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getName());
        }
        if (entity.getNamn() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getNamn());
        }
        if (entity.getNimi() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getNimi());
        }
        if (entity.getOperaattor() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getOperaattor());
        }
        if (entity.getOsoite() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getOsoite());
        }
        if (entity.getStad() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getStad());
        }
        statement.bindDouble(12, entity.getX());
        statement.bindDouble(13, entity.getY());
      }
    }, new EntityDeletionOrUpdateAdapter<StationEntity>(__db) {
      @Override
      @NonNull
      public String createQuery() {
        return "UPDATE `station_beer` SET `adress` = ?,`fid` = ?,`id` = ?,`kapasiteet` = ?,`kaupunki` = ?,`name` = ?,`namn` = ?,`nimi` = ?,`operaattor` = ?,`osoite` = ?,`stad` = ?,`x` = ?,`y` = ? WHERE `fid` = ?";
      }

      @Override
      public void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final StationEntity entity) {
        if (entity.getAdress() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getAdress());
        }
        statement.bindLong(2, entity.getFid());
        statement.bindLong(3, entity.getId());
        statement.bindLong(4, entity.getKapasiteet());
        if (entity.getKaupunki() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getKaupunki());
        }
        if (entity.getName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getName());
        }
        if (entity.getNamn() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getNamn());
        }
        if (entity.getNimi() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getNimi());
        }
        if (entity.getOperaattor() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getOperaattor());
        }
        if (entity.getOsoite() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getOsoite());
        }
        if (entity.getStad() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getStad());
        }
        statement.bindDouble(12, entity.getX());
        statement.bindDouble(13, entity.getY());
        statement.bindLong(14, entity.getFid());
      }
    });
  }

  @Override
  public Object insertStations(final List<StationEntity> beers, final boolean clearCache,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> StationDao.DefaultImpls.insertStations(StationDao_Impl.this, beers, clearCache, __cont), continuation);
  }

  @Override
  public Object deleteAllStation(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllStation.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllStation.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object upsertStations(final List<StationEntity> beers,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfStationEntity.upsert(beers);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, StationEntity> getStation() {
    final String _sql = "SELECT * FROM station_beer";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<StationEntity>(_statement, __db, "station_beer") {
      @Override
      @NonNull
      protected List<StationEntity> convertRows(@NonNull final Cursor cursor) {
        final int _cursorIndexOfAdress = CursorUtil.getColumnIndexOrThrow(cursor, "adress");
        final int _cursorIndexOfFid = CursorUtil.getColumnIndexOrThrow(cursor, "fid");
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfKapasiteet = CursorUtil.getColumnIndexOrThrow(cursor, "kapasiteet");
        final int _cursorIndexOfKaupunki = CursorUtil.getColumnIndexOrThrow(cursor, "kaupunki");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfNamn = CursorUtil.getColumnIndexOrThrow(cursor, "namn");
        final int _cursorIndexOfNimi = CursorUtil.getColumnIndexOrThrow(cursor, "nimi");
        final int _cursorIndexOfOperaattor = CursorUtil.getColumnIndexOrThrow(cursor, "operaattor");
        final int _cursorIndexOfOsoite = CursorUtil.getColumnIndexOrThrow(cursor, "osoite");
        final int _cursorIndexOfStad = CursorUtil.getColumnIndexOrThrow(cursor, "stad");
        final int _cursorIndexOfX = CursorUtil.getColumnIndexOrThrow(cursor, "x");
        final int _cursorIndexOfY = CursorUtil.getColumnIndexOrThrow(cursor, "y");
        final List<StationEntity> _result = new ArrayList<StationEntity>(cursor.getCount());
        while (cursor.moveToNext()) {
          final StationEntity _item;
          final String _tmpAdress;
          if (cursor.isNull(_cursorIndexOfAdress)) {
            _tmpAdress = null;
          } else {
            _tmpAdress = cursor.getString(_cursorIndexOfAdress);
          }
          final int _tmpFid;
          _tmpFid = cursor.getInt(_cursorIndexOfFid);
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final int _tmpKapasiteet;
          _tmpKapasiteet = cursor.getInt(_cursorIndexOfKapasiteet);
          final String _tmpKaupunki;
          if (cursor.isNull(_cursorIndexOfKaupunki)) {
            _tmpKaupunki = null;
          } else {
            _tmpKaupunki = cursor.getString(_cursorIndexOfKaupunki);
          }
          final String _tmpName;
          if (cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = cursor.getString(_cursorIndexOfName);
          }
          final String _tmpNamn;
          if (cursor.isNull(_cursorIndexOfNamn)) {
            _tmpNamn = null;
          } else {
            _tmpNamn = cursor.getString(_cursorIndexOfNamn);
          }
          final String _tmpNimi;
          if (cursor.isNull(_cursorIndexOfNimi)) {
            _tmpNimi = null;
          } else {
            _tmpNimi = cursor.getString(_cursorIndexOfNimi);
          }
          final String _tmpOperaattor;
          if (cursor.isNull(_cursorIndexOfOperaattor)) {
            _tmpOperaattor = null;
          } else {
            _tmpOperaattor = cursor.getString(_cursorIndexOfOperaattor);
          }
          final String _tmpOsoite;
          if (cursor.isNull(_cursorIndexOfOsoite)) {
            _tmpOsoite = null;
          } else {
            _tmpOsoite = cursor.getString(_cursorIndexOfOsoite);
          }
          final String _tmpStad;
          if (cursor.isNull(_cursorIndexOfStad)) {
            _tmpStad = null;
          } else {
            _tmpStad = cursor.getString(_cursorIndexOfStad);
          }
          final double _tmpX;
          _tmpX = cursor.getDouble(_cursorIndexOfX);
          final double _tmpY;
          _tmpY = cursor.getDouble(_cursorIndexOfY);
          _item = new StationEntity(_tmpAdress,_tmpFid,_tmpId,_tmpKapasiteet,_tmpKaupunki,_tmpName,_tmpNamn,_tmpNimi,_tmpOperaattor,_tmpOsoite,_tmpStad,_tmpX,_tmpY);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
