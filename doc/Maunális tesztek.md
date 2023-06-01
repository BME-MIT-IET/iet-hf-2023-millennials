**Manuális tesztek** 

**(Li Jiaxiang)**
**


**A feladat megoldása:**

`	`A feladat megoldásához a program leírását és funkcionális követelményeit kellet elemezni. Ezek alapján az alapvető működését meg lehet érteni a programnak. Meghatározhatóak voltak a funkciók. A funkciókat szétválasztva mindegyikre meg lett tervezve egy egy teszt, amelyek manuálisan a futó programban végig lettek hajtva. Végül a sikeres és sikeretelen eredények dokumentálva lettek.

**Funkcionális követelmények:**

|**Azonosító**|**Leírás**|**Ellenőrzés**|**Prioritás**|**Forrás**|**Use-case**|
| :- | :- | :- | :- | :- | :- |
|R01|A játékosok virológusokat irányítanak egy térképen.|bemutatás|alapvető|Feladat|Játék vezérlése|
|R02|<p>A térkép tetszőleges mennyiségű és oldalszámú</p><p>sokszögből áll.</p>|bemutatás|alapvető|Feladat|Játék vezérlése|
|R04|<p>A térkép szimpla mezőkből, laborokból, raktárakból,</p><p>óvóhelyekből</p><p>áll.</p>|bemutatás|alapvető|Feladat|Játék vezérlése|
|R05|A virológusok különféle genetikai kódokat tanulnak meg.|bemutatás|alapvető|Feladat|Genetikai kód letapogatása|
|R06|A virológusok különféle védőfelszereléseket is gyűjtenek.|bemutatás|alapvető|Feladat|Védőfelszerelés felvétele|
|R07|A virológusok anyagokat gyűjtenek.|bemutatás|alapvető|Feladat|Anyag felvétele|
|R08|<p>Az anyagok raktár mezőkön találhatóak meg.</p><p></p><p></p><p></p><p></p>|kiértékelés|opcionális|Feladat|Anyag felvétele|
|R09|A védőfelszerelések óvóhely mezőkön találhatóak meg.|kiértékelés|opcionális|Feladat|Védőfelszerelés felvétele|
|R10|A genetikai kódok a labor mezőkön találhatóak meg.|kiértékelés|opcionális|Feladat|Genetikai kód letapogatása|
|R11|<p>Minden virológus ágenseket kenhetnek</p><p>magukra vagy egy másik virológusra, amennyiben</p><p>megtudják egymást érinteni egy mezőn.</p><p></p>|bemutatás|alapvető|Feladat|Ágens kenése, Játék vezérlése|
|R12|Egy ágens csak adott időtartamig érvényes.|kiértékelés|fontos|Feladat|Ágens kenése,* Játék vezérlése|
|R13|Az ágensekhez genetikai kód és anyag kell.|bemutatás|fontos|Feladat|Genetikai kód letapogatása|
|R14|<p>A virológusok anyagmennyisége, ha</p><p>eléri a maximális birtokolható limitet, nem</p><p>növelhető tovább, egészen addig, ameddig az anyagmennyiség újra a limit alá nem ér.</p>|bemutatás|alapvető|feladat|Anyag felvétele, Játék vezérlése|
|R15|<p>Két virológus azonos mezőn tudja egymást</p><p>megérinteni.</p>|bemutatás|alapvető|Csapat|Ágens kenése, Játék vezérlése|
|R16|Lebénulás alatt egy virológus cselekvőképtelen.|bemutatás|alapvető|Csapat|Ágens kenése|
|R17|Egyszerre maximum 3 darab felszerelés viselhető virológusonként|kiértékelés|fontos|Feladat|Védőfelszerelés felvétele|
|R18|A védőfelszerelés csak a viselőjére van hatással.|bemutatás|alapvető|Feladat|Védőfelszerelés felvétele|
|R19|A virológusok a játék ideje alatt szabadon mozoghatnak és kenhetnek.|bemutatás|opcionális|Csapat|Játék vezérlése|
|R20|<p>Ha egy virológus az összes genetikai kóddal</p><p>rendelkezik, a játék véget ér.</p>|kiértékelés|alapvető|Feladat|Genetikai kód letapogatása, Játék vezérlése|












|**Sorszám**|**Teszteset megnevezése**|
| :-: | :-: |
|T\_01|A program elindítása|
|T\_02|A program leállítása|
|T\_03|Virológus létrehozása egy játék indítása előtt|
|T\_04|Virológus létrehozása egy játék indítása után|
|T\_05|Több virológus létrehozása a játék indítása után|
|T\_06|Virológus azonos óvóhely mezőn a loot funkció többszöri alkalmazása |
|T\_07|Virológus azonos laboratórium mezőn loot funkció többszöri alkalmazása|
|T\_08|Virológus azonos raktár mezőn loot funkció többszöri alkalmazása|
|T\_09|Virológus által ágens készítése nem elegendő alapanyagokkal|
|T\_10|Virológus által ágens készítése elegendő alapanyagokkal|
|T\_11|Virológus ágens használata másik virológuson|
|T\_12|Virológus DefenceAgent használata saját magán és hatása|
|T\_13|Virológus több mint három felszerelés felvétele|
|T\_14|Virológuson lévő felszerelések hatásai |
|T\_15|Medve vírus |
|T\_16|Virológus nyer|


**T\_01: A program elindítása**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|/code/bin/run.bat elindítása|A program elindul |A program elindult|sikeres|

**T\_02: A program leállítása**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|A menüből az ’Exit’ kiválasztása|A program bezárul|A program bezárult|sikeres|





**T\_03: Virológus létrehozása egy játék indítása előtt**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|A menüből a ’New Virologist’ kiválasztása|Felugrik egy ablak amiben meg lehet adni a virológus nevét|Felugrott egy ablak amiben meg lehet adni a virológus nevét|sikeres|
|2|A név beírása után az ’OK’ választása|Nem adódik hozzá virológus|Nem adódott hozzá virológus|sikeres|

**T\_04: Virológus létrehozása egy játék indítása után**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|A menüből a ’Start’ kiválasztása|A pályán véletlenszerűen elrendezésben megjelennek különböző mezők (laboratórium, raktár, óvóhely)|A pályán véletlenszerűen elrendezésben megjelentek különböző mezők (laboratórium, raktár, óvóhely)|sikeres|
|2|A menüből a ’New Virologist’ kiválasztása|Egy felugró ablakban megadható a virológus neve|Egy felugró ablakban megadható volt a virológus neve|sikeres|
|3|A név megadása után az ’OK’ gomb megnyomása|Létrejön a virológus egy véletlenszerűen választott mezőn|Létrejött a virológus egy véletlenszerűen választott mezőn|sikeres|

**T\_05: Több virológuss létrehozása egy játék indítása után**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|A menüből a ’Start’ kiválasztása|A pályán véletlenszerűen elrendezésben megjelennek különböző mezők (laboratórium, raktár, óvóhely)|A pályán véletlenszerűen elrendezésben megjelentek különböző mezők (laboratórium, raktár, óvóhely)|sikeres|
|2|A menüből a ’New Virologist’ kiválasztása|Egy felugró ablakban megadható a virológus neve|Egy felugró ablakban megadható volt a virológus neve|sikeres|
|3|A név megadása után az ’OK’ gomb megnyomása|Létrejön a virológus egy véletlenszerűen választott mezőn|Létrejött a virológus egy véletlenszerűen választott mezőn|sikeres|
|4|Előző két lépés megismétlése |Létrejön a második virológus|Létrejött a második virológus egy véletlenszerűen választott mezőn|sikeres|

**T\_06: Virológus azonos óvóhely mezőn a loot funkció többszöri alkalmazása**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológus kiválasztása a pályán, majd egy szomszédos mező kiválasztása, míg el nem ér egy óvóhely mezőre|A virológus egyenként lépkedve elér egy óvóhely mezőre|A virológus egyenként lépkedve elért egy óvóhely mezőre|sikeres|
|2|A virológus akcióiból a ’loot’ használása|A virológus eszközeinek listájához hozzáadódik a felvett eszköz|A virológus eszközeinek listájához hozzáadódott a felvett eszköz|sikeres|
|3|A ’loot’ ismételt alkalmazása|Nem tud újra felvenni azon a mezőn eszközt, a játék üzenettel jelzi, hogy üres az óvóhely|Nem tudott újra felvenni azon a mezőn eszközt, a játék üzenettel jelezte, hogy üres az óvóhely|sikeres|






**T\_07: Virológus azonos laboratórium mezőn a loot funkció többszöri alkalmazása**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológus kiválasztása a pályán, majd egy szomszédos mező kiválasztása, míg el nem ér egy laboratórium mezőre|A virológus egyenként lépkedve elér egy laboratórium mezőre|A virológus egyenként lépkedve elért egy óvóhely mezőre|sikeres|
|2|A virológus akcióiból a ’loot’ használása|A virológus genetikaikódok listájához hozzáadódik a genetikai kód|A virológus genetikaikódok listájához hozzáadódott a felvett eszköz|sikeres|
|3|A ’loot’ ismételt alkalmazása|A genetikaikódot már ismeri a virológus, a listában nem történik változás, a program üzenettel jelzi |A genetikaikódot már ismeri a virológus, a listában nem történt változás, a program üzenettel jelzezte|sikeres|

**T\_08: Virológus azonos raktár mezőn a loot funkció többszöri alkalmazása**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológus kiválasztása a pályán, majd egy szomszédos mező kiválasztása, míg el nem ér egy raktár mezőre|A virológus egyenként lépkedve elér egy laboratórium mezőre|A virológus egyenként lépkedve elért egy laboratórium mezőre|sikeres|
|2|A virológus akcióiból a ’loot’ használása|A virológus anyagjaihoz hozzáadódik a raktárban tárolt mennyiség|A virológus anyagjaihoz hozzáadódott a raktárban tárolt mennyiség|sikeres|
|3|A ’loot’ ismételt alkalmazása|A raktárban már nincs több anyag, nem növekedik a virológus anyagjainak a száma|A raktárban már nincs több anyag, nem növekedett a virológus anyagjainak a száma|sikeres|


**T\_09: Virológus által ágens készítése nem elegendő alapanyagokkal** 

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|A virológus genetikai kódok listájából az egyik kiválasztása|A kiválasztott genetikai kód lesz megjelenítve|A kiválasztott genetikai kód lett megjelenítve|sikeres|
|2|Az akciók közül a ’Generate’ kiválasztása |Nem készül el az ágens, üzenettel jelzi a program, hogy nincs elegendő alapanyag|Nem készült el az ágens, üzenettel jelzi a program, hogy nincs elegendő alapanyag|sikeres|

**T\_10: Virológus által ágens készítése elegendő alapanyagokkal** 

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|A virológus genetikai kódok listájából az egyik kiválasztása|A kiválasztott genetikai kód lesz megjelenítve|A kiválasztott genetikai kód lett megjelenítve|sikeres|
|2|Az akciók közül a ’Generate’ kiválasztása |Elkészül az ágens, megjelenik az ágensek listában, az alapanyagokból kivonódik a készítéshez használt mennyiség |Elkészült az ágens, megjelent az ágensek listában, az alapanyagokból kivonódott a készítéshez használt mennyiség|sikeres|






**T\_11.1: Virológus AmnesiaAgent használata egy másik virológuson**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológus a másik virólógus mezőjére való navigálása |Ugyanazon a mezőn tartózkodik mindkét virológus |Ugyanazon a mezőn tartózkodott mindkét virológus|sikeres|
|2\.1|Az ágenseket tartalmazó listából az AmnesiaAgent kiválasztása, az akciókból az ’Attack’ kiválasztása|A másik virológus genetikai kódjainak listájából véletlenszerűen kitörlődik az egyik |A másik virológus genetikai kódjainak listájából véletlenszerűen kitörlődött az egyik|sikeres|


**T\_11.2: Virológus DanceAgent használata egy másik virológuson**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológus a másik virólógus mezőjére való navigálása |Ugyanazon a mezőn tartózkodik mindkét virológus |Ugyanazon a mezőn tartózkodott mindkét virológus|sikeres|
|2|Az ágenseket tartalmazó listából az DanceAgent kiválasztása, az akciókból az ’Attack’ kiválasztása|A másik virológus vitustáncba kezd, véletlenszerűen elkezd mozogni a mezőkön|A másik virológus vitustáncba kezdett, véletlenszerűen elkezdett mozogni a mezőkön|sikeres|

**T\_11.3: Virológus ágenseinek használata egy másik virológuson**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológus a másik virólógus mezőjére való navigálása |Ugyanazon a mezőn tartózkodik mindkét virológus |Ugyanazon a mezőn tartózkodott mindkét virológus |sikeres|
|2|Az ágenseket tartalmazó listából az PoisonAgent kiválasztása, az akciókból az ’Attack’ kiválasztása|A másik virológus lebénul egy időre, ezen idő alatt semmit nem tud csinálni|A lebénult virológus továbbra is cselekvőképes|sikertelen|







**T\_12: Virológus DefenceAgent használata saját magán és hatása**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|A legenerált DefenceAgent kiválasztása majd az ’Attack’ megnyomása|A DefenceAgent eltűnik a listából a virológus védett lesz a következő támadástól|A DefenceAgent nem tűnt el a listából, egy másik mezőre való mozgás után tűnik el a listából|sikertelen|
|2|Egy másik virológus pl. AmnesiaAgent használata a védett virológuson |A használt ágens eltűnik a listából de nincs hatással a célpontra |Hatással van a védett virológusra|sikertelen|

**T\_13: Virológus maximális felszerelés kapacitásnál még egy felvétele**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Három felszereléssel rendelkező virológussal még egy felszerelést veszünk fel|Nem tudja felvenni, a felszerelés lista nem bővül az óvóhely mezőn marad a felszerelés|Még egy felszerelést fel tud venni, de ötödiket már nem|sikertelen|

**T\_14.1: Virológuson Cape felszerelés hatása** 

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológussal egy óvóhelyen egy ’Cape’ felszerelés felvétele|A ’Cape’ hozzáadódik a felszerelés listához|A ’Cape’ hozzáadódott a felszerelés listához|sikeres|
|2|Egy másik virológussal azonos mezőre megyünk és rádobunk egy ágenst|Az esetek nagyrészében nem hat az ágens az elsőre de az ágens elhasználódik|Az esetek nagyrészében nem hatott az ágens az elsőre de az ágens elhasználódott|sikeres|

**T\_14.2: Virológuson Package felszerelés hatása** 

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológussal egy óvóhelyen egy ’Package’ felszerelés felvétele|A ’Package’ hozzáadódik a felszerelés listához|A ’Package’ hozzáadódott a felszerelés listához|sikeres|
|2|Húsznál több anyag felvétele raktár mezőkről|Fel lehet venni több mint húszat|Nem tesztelhető mivel nincs annyi generált anyag az összes raktárt nézve|nem tesztelhető|

**T\_14.2: Virológuson Gloves felszerelés hatása** 

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológussal egy óvóhelyen egy ’Gloves’ felszerelés felvétele|A ’Gloves’ hozzáadódik a felszerelés listához|A ’Gloves’ hozzáadódott a felszerelés listához|sikeres|
|2|Egy másik virológussal azonos mezőre lépünk, majd pl. DanceAgentet használunk az első virológuson|A DanceAgent a támadó virológuson fejti ki hatását, elhasználódik mind a DanceAgent és a Gloves is |Visszafele hat a DanceAgent és elhasználódik, azonban a Gloves nem használódik el, a listában marad|sikertelen|


**T\_15: Medve vírus** 

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológussal rálépünk egy medve vírust tartalmazó mezőre|A virológus megfertőződik a medve vírussal és véletlenszerűen el kezd mozogni|Véletlenszerűen mozog magától, azonban közben irányítható marad a virológus|sikertelen|

**T\_16: Virológus nyer**

|**Lépés sorszám**|**Lépés leírás**|**Elvárt eredmény**|**Tényleges eredmény**|**Minősítés**|
| :- | :- | :- | :- | :- |
|1|Egy virológussal mind a négy fajta Agent megtanulása|A játék befejeződik, a program üzenettel jelzi a győztes virológus nevét|A játék befejeződött, a program üzenettel jelezte a győztes virológus nevét|sikeres|

