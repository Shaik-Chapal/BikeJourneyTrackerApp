package xyz.summer.bikejourneytracker.data.local.journey.constant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lxyz/summer/bikejourneytracker/data/local/journey/constant/JourneyDatabaseConst;", "", "()V", "NAME", "", "TABLE_BEER", "VERSION", "", "app_debug"})
public final class JourneyDatabaseConst {
    @org.jetbrains.annotations.NotNull
    public static final xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst INSTANCE = null;
    
    /**
     * Database name.
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME = "database_beer";
    
    /**
     * Database version.
     */
    public static final int VERSION = 1;
    
    /**
     * Table Beer.
     * Dto -> [fully qualified dto name]
     * Entity -> [fully qualified entity name]
     * Model -> [fully qualified model name]
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_BEER = "table_beer";
    
    private JourneyDatabaseConst() {
        super();
    }
}