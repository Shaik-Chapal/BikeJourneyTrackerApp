package xyz.summer.bikejourneytracker.data.remote.journey.constant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lxyz/summer/bikejourneytracker/data/remote/journey/constant/JourneyApiConst;", "", "()V", "BASE_URL", "", "GetJourneys", "app_debug"})
public final class JourneyApiConst {
    @org.jetbrains.annotations.NotNull
    public static final xyz.summer.bikejourneytracker.data.remote.journey.constant.JourneyApiConst INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "http://www.api.skygreenblue.xyz/api/";
    
    private JourneyApiConst() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lxyz/summer/bikejourneytracker/data/remote/journey/constant/JourneyApiConst$GetJourneys;", "", "()V", "ENABLE_PLACEHOLDERS", "", "ENDPOINT", "", "LIMIT", "", "Query", "app_debug"})
    public static final class GetJourneys {
        @org.jetbrains.annotations.NotNull
        public static final xyz.summer.bikejourneytracker.data.remote.journey.constant.JourneyApiConst.GetJourneys INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ENDPOINT = "Journey";
        public static final int LIMIT = 10;
        public static final boolean ENABLE_PLACEHOLDERS = false;
        
        private GetJourneys() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lxyz/summer/bikejourneytracker/data/remote/journey/constant/JourneyApiConst$GetJourneys$Query;", "", "()V", "PAGE", "", "PER_PAGE", "app_debug"})
        public static final class Query {
            @org.jetbrains.annotations.NotNull
            public static final xyz.summer.bikejourneytracker.data.remote.journey.constant.JourneyApiConst.GetJourneys.Query INSTANCE = null;
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String PAGE = "pageNumber";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String PER_PAGE = "pageSize";
            
            private Query() {
                super();
            }
        }
    }
}