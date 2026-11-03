package org.example.flink;

import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableEnvironment;

import static org.apache.flink.table.api.Expressions.$;

/**
 * Szkolenie Apache Flink, temat T2 - Table API i Flink SQL.
 *
 * Szkielet uzupełniany w warsztacie w2. Program uruchamiamy w IntelliJ (lokalny mini-klaster
 * w procesie IDE), a dane czytamy z Kafki działającej w środowisku BigData26. Brokery ogłaszają
 * się nazwami kafka-1..3, dlatego na hoście potrzebny jest wpis w /etc/hosts:
 *     127.0.0.1 kafka-1 kafka-2 kafka-3
 */
public class HouseStatsApp {

    static final String BOOTSTRAP = "kafka-1:9092,kafka-2:9093,kafka-3:9094";

    public static void main(String[] args) throws Exception {

        // Kontekst: tylko Table API i SQL, tryb strumieniowy
        TableEnvironment tEnv = TableEnvironment.create(EnvironmentSettings.inStreamingMode());

        // ===== 1. Tabela źródłowa house_events =====
        // TODO: ten sam DDL co w SQL Client - tEnv.executeSql("""CREATE TABLE ...""");

        // ===== 2. Agregacja w Table API =====
        // TODO: Table sums = tEnv.from("house_events").groupBy(...).select(...);

        // ===== 3. Wynik - changelog w konsoli IntelliJ =====
        // TODO: sums.execute().print();
    }
}
