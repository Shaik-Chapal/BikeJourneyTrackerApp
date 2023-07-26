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
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class JourneyDao_Impl implements JourneyDao {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllBeers;

  private final EntityUpsertionAdapter<JourneyEntity> __upsertionAdapterOfJourneyEntity;

  public JourneyDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfDeleteAllBeers = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM table_beer";
        return _query;
      }
    };
    this.__upsertionAdapterOfJourneyEntity = new EntityUpsertionAdapter<JourneyEntity>(new EntityInsertionAdapter<JourneyEntity>(__db) {
      @Override
      @NonNull
      public String createQuery() {
        return "INSERT INTO `table_beer` (`departure`,`returnTime`,`departureStationId`,`departureStationName`,`returnStationId`,`returnStationName`,`coveredDistance`,`durationSec`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final JourneyEntity entity) {
        if (entity.getDeparture() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getDeparture());
        }
        if (entity.getReturnTime() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getReturnTime());
        }
        statement.bindLong(3, entity.getDepartureStationId());
        if (entity.getDepartureStationName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getDepartureStationName());
        }
        statement.bindLong(5, entity.getReturnStationId());
        if (entity.getReturnStationName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getReturnStationName());
        }
        statement.bindLong(7, entity.getCoveredDistance());
        statement.bindLong(8, entity.getDurationSec());
      }
    }, new EntityDeletionOrUpdateAdapter<JourneyEntity>(__db) {
      @Override
      @NonNull
      public String createQuery() {
        return "UPDATE `table_beer` SET `departure` = ?,`returnTime` = ?,`departureStationId` = ?,`departureStationName` = ?,`returnStationId` = ?,`returnStationName` = ?,`coveredDistance` = ?,`durationSec` = ? WHERE `departure` = ?";
      }

      @Override
      public void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final JourneyEntity entity) {
        if (entity.getDeparture() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getDeparture());
        }
        if (entity.getReturnTime() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getReturnTime());
        }
        statement.bindLong(3, entity.getDepartureStationId());
        if (entity.getDepartureStationName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getDepartureStationName());
        }
        statement.bindLong(5, entity.getReturnStationId());
        if (entity.getReturnStationName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getReturnStationName());
        }
        statement.bindLong(7, entity.getCoveredDistance());
        statement.bindLong(8, entity.getDurationSec());
        if (entity.getDeparture() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getDeparture());
        }
      }
    });
  }

  @Override
  public Object insertBeers(final List<JourneyEntity> beers, final boolean clearCache,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> JourneyDao.DefaultImpls.insertBeers(JourneyDao_Impl.this, beers, clearCache, __cont), continuation);
  }

  @Override
  public Object deleteAllBeers(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllBeers.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllBeers.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object upsertBeers(final List<JourneyEntity> beers,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfJourneyEntity.upsert(beers);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, JourneyEntity> getBeers() {
    final String _sql = "SELECT * FROM table_beer";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<JourneyEntity>(_statement, __db, "table_beer") {
      @Override
      @NonNull
      protected List<JourneyEntity> convertRows(@NonNull final Cursor cursor) {
        final int _cursorIndexOfDeparture = CursorUtil.getColumnIndexOrThrow(cursor, "departure");
        final int _cursorIndexOfReturnTime = CursorUtil.getColumnIndexOrThrow(cursor, "returnTime");
        final int _cursorIndexOfDepartureStationId = CursorUtil.getColumnIndexOrThrow(cursor, "departureStationId");
        final int _cursorIndexOfDepartureStationName = CursorUtil.getColumnIndexOrThrow(cursor, "departureStationName");
        final int _cursorIndexOfReturnStationId = CursorUtil.getColumnIndexOrThrow(cursor, "returnStationId");
        final int _cursorIndexOfReturnStationName = CursorUtil.getColumnIndexOrThrow(cursor, "returnStationName");
        final int _cursorIndexOfCoveredDistance = CursorUtil.getColumnIndexOrThrow(cursor, "coveredDistance");
        final int _cursorIndexOfDurationSec = CursorUtil.getColumnIndexOrThrow(cursor, "durationSec");
        final List<JourneyEntity> _result = new ArrayList<JourneyEntity>(cursor.getCount());
        while (cursor.moveToNext()) {
          final JourneyEntity _item;
          final String _tmpDeparture;
          if (cursor.isNull(_cursorIndexOfDeparture)) {
            _tmpDeparture = null;
          } else {
            _tmpDeparture = cursor.getString(_cursorIndexOfDeparture);
          }
          final String _tmpReturnTime;
          if (cursor.isNull(_cursorIndexOfReturnTime)) {
            _tmpReturnTime = null;
          } else {
            _tmpReturnTime = cursor.getString(_cursorIndexOfReturnTime);
          }
          final int _tmpDepartureStationId;
          _tmpDepartureStationId = cursor.getInt(_cursorIndexOfDepartureStationId);
          final String _tmpDepartureStationName;
          if (cursor.isNull(_cursorIndexOfDepartureStationName)) {
            _tmpDepartureStationName = null;
          } else {
            _tmpDepartureStationName = cursor.getString(_cursorIndexOfDepartureStationName);
          }
          final int _tmpReturnStationId;
          _tmpReturnStationId = cursor.getInt(_cursorIndexOfReturnStationId);
          final String _tmpReturnStationName;
          if (cursor.isNull(_cursorIndexOfReturnStationName)) {
            _tmpReturnStationName = null;
          } else {
            _tmpReturnStationName = cursor.getString(_cursorIndexOfReturnStationName);
          }
          final int _tmpCoveredDistance;
          _tmpCoveredDistance = cursor.getInt(_cursorIndexOfCoveredDistance);
          final int _tmpDurationSec;
          _tmpDurationSec = cursor.getInt(_cursorIndexOfDurationSec);
          _item = new JourneyEntity(_tmpDeparture,_tmpReturnTime,_tmpDepartureStationId,_tmpDepartureStationName,_tmpReturnStationId,_tmpReturnStationName,_tmpCoveredDistance,_tmpDurationSec);
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
