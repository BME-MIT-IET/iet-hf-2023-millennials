# Build keretrendszer

## Simon Borbála

---

A build keretrendszer legenerálása után több probléma is adódott, de mivel nem kifejezett hibák voltak error üzenettel, nem volt egyszerű megtalálni, hogy hol lehet a hiba.
- Első gond a rossz sourseSets-ek megadása volt, mivel egzakt meg lett adva több útvonal, de elég volt a gradle-nek a code/src-t megadni, a többit magától is megtalálta.
- A következő a duplicateStrategy kikapcsolása volt, mivel a kód build közben fennakadt duplikációkon.
- A végső gond az volt, hogy a tesztek valós eredményétől függetlenül, a build minden tesztre azt mondta, hogy sikeresen lefut. Ennek a megoldása az implementation-ök megadásával valósult meg, nem volt elég a testImplementation a gradle-nek.

## Zólomy Balázs Attila

---

A build keretrendszer alapjait állítottam össze, amivel később a csapattársak tovább dolgoztak. A build.gradle fájlt állítottam össze, húztam be a megfelelő dependenciákat és futtattam a programot.
A GitHub workflow script-jét állítottam össze, hogy a GitHub Actions tudjon megfelelően működni és build-eljen a program. A Projekt Laboratorium tárgy programját, nem Gradle alapokon lévő kodját és
build rendszerét állítottam össze, hogy tudjon működni és legyen kiindulási alap a továbbfejlesztéshez és a JUnit tesztek írásához.

Workflow kibővítése Unit tesztek futtatásához, eredmények automatikus elkészítéséhez.