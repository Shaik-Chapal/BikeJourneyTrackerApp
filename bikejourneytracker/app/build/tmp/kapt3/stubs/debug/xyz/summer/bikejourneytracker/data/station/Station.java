package xyz.summer.bikejourneytracker.data.station;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0010H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0010H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u0010H\u00c6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0005H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!\u00a8\u00066"}, d2 = {"Lxyz/summer/bikejourneytracker/data/station/Station;", "", "address", "", "fid", "", "id", "kapasiteet", "kaupunki", "name", "namn", "nimi", "operaattor", "osoite", "stad", "x", "", "y", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getAddress", "()Ljava/lang/String;", "getFid", "()I", "getId", "getKapasiteet", "getKaupunki", "getName", "getNamn", "getNimi", "getOperaattor", "getOsoite", "getStad", "getX", "()D", "getY", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Station {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String address = null;
    private final int fid = 0;
    private final int id = 0;
    private final int kapasiteet = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String kaupunki = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String namn = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nimi = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String operaattor = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String osoite = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String stad = null;
    private final double x = 0.0;
    private final double y = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final xyz.summer.bikejourneytracker.data.station.Station copy(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "adress")
    java.lang.String address, @com.squareup.moshi.Json(name = "fid")
    int fid, @com.squareup.moshi.Json(name = "id")
    int id, @com.squareup.moshi.Json(name = "kapasiteet")
    int kapasiteet, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "kaupunki")
    java.lang.String kaupunki, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "namn")
    java.lang.String namn, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "nimi")
    java.lang.String nimi, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "operaattor")
    java.lang.String operaattor, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "osoite")
    java.lang.String osoite, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "stad")
    java.lang.String stad, @com.squareup.moshi.Json(name = "x")
    double x, @com.squareup.moshi.Json(name = "y")
    double y) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Station(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "adress")
    java.lang.String address, @com.squareup.moshi.Json(name = "fid")
    int fid, @com.squareup.moshi.Json(name = "id")
    int id, @com.squareup.moshi.Json(name = "kapasiteet")
    int kapasiteet, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "kaupunki")
    java.lang.String kaupunki, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "namn")
    java.lang.String namn, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "nimi")
    java.lang.String nimi, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "operaattor")
    java.lang.String operaattor, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "osoite")
    java.lang.String osoite, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "stad")
    java.lang.String stad, @com.squareup.moshi.Json(name = "x")
    double x, @com.squareup.moshi.Json(name = "y")
    double y) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getFid() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getKapasiteet() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKaupunki() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNamn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNimi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperaattor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOsoite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStad() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getX() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double getY() {
        return 0.0;
    }
}