Objektovo-orientované programovanie na FIIT STU 2025 by JetBrains
=================================================================

Je čas na zmrzlinu? Ak je dosť teplo, zobrazíme veselý obrázok zmrzliny.

## Vlastnosti

- Open-Meteo.com obsahuje voľne dostupné REST API na získanie aktuálneho počasia na planéte.
- Napojíme sa na túto službu cez REST klienta, zistíme aktuálne počasie a ak je dostatočne teplo a nefúka priveľmi, zobrazíme veselú zmrzlinu. Ak je zima, ukážeme smutnú zmrzlinu.

![Veselá zmrzlina](screenshot.png)

## Technikálie a technológie

- Java 24 (s preview vlastnosťami). Ukážeme si jednoduché spúšťanie cez `void main()`.
- Gradle: správa závislostí, build projektu
- OkHttp: klient pre komunikáciu nad HTTP
- [Moshi](https://github.com/square/moshi): prevod medzi textovými odpoveďami zo služby (JSON) na objektový model
- JUnit 5: na jednotkové testy
- Swing: grafické rozhranie
- [IntelliJ IDEA](https://www.jetbrains.com/idea/): vývojové prostredie

## Commity v `git`

Commity v `git` ukazujú postupný vývoj tohto projektu.

## Užitočné vlastnosti v IntelliJ IDEA

- [klient HTTP](https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html): analógia k Postman a podobným službám. Možno spúšťať ľubovoľné dopyty nad HTTP a verzovať ich v textových súboroch.
- _Shift Shift_: univerzálne vyhľadávanie
- _Ctrl Ctrl_: _Run Anything_: rýchle spúšťanie programu a iných konfigurácií
- _⌘+E_ / Ctrl+E: posledne zobrazené súbory a panely
- _Ctrl+Shift-T_: prepínanie medzi produkčnou triedou a jej unit testom
