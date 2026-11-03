# Flink-T2-TableAPI

Projekt startowy do warsztatu **T2 - Table API i Flink SQL** ze szkolenia
"Zaawansowane przetwarzanie strumieni danych w Apache Flink" (scenariusz *HouseStats*,
środowisko *BigData26*, Apache Flink 2.3.0).

## Wymagania

- Java 17 lub 21, Maven (IntelliJ IDEA ma wbudowany),
- działające środowisko BigData26 (profil `flink`),
- wpis w `/etc/hosts` - brokery Kafki ogłaszają się nazwami kontenerów:

  ```
  127.0.0.1 kafka-1 kafka-2 kafka-3
  ```

## Uruchomienie

1. Otwórz katalog projektu w IntelliJ IDEA (*File -> Open*), zaufaj projektowi Maven.
2. Uruchom konfigurację **HouseStatsApp** (plik `.run/HouseStatsApp.run.xml`). Dołącza ona
   zależności z zakresem `provided` do classpath i ustawia opcje JVM wymagane przez Flinka.
3. Program działa w lokalnym mini-klastrze w procesie IDE - jego zadań nie zobaczysz w Web UI
   klastra BigData26.

Treść zadań: warsztat T2 (MkDocs, `apache-flink/w2`).
