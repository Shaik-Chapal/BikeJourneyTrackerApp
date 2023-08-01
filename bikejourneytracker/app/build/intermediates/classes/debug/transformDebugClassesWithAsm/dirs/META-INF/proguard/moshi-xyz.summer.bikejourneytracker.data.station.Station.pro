-if class xyz.summer.bikejourneytracker.data.station.Station
-keepnames class xyz.summer.bikejourneytracker.data.station.Station
-if class xyz.summer.bikejourneytracker.data.station.Station
-keep class xyz.summer.bikejourneytracker.data.station.StationJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
