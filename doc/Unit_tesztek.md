# **Unit tesztek**

## Tálos Martin:

---

### Tesztelt java osztályok:
- DefenceAgent
- DefenceGenetic
- PoisonAgent
- PoisonGenetic

### Összesen:
- 21 db teszt, a fent említett osztályok metódusainak elvárt visekledésének vizsgálatához

Unit teszteknél felmerülő probléma a tesztelendő osztály függőségei, ugyanis ezektől meg kell szabadulni annak érdekében, hogy csakis az adott osztály saját metódusainak megfelelő működését kelljen tesztelni, véletlenül sem a tesztelendő metódusban, egy másik osztály példányán hívott metódus megfelelő működését. Ezek a külső függőségek elronthatják a teszt megfelelő futását (a teszt failed lesz, annak ellenére, hogy a hiba nem a tesztelendő metódusában keletkezett). Mindennek elkerülése végett a Mockito framework használatára volt szükség, mely eltávolítja az adott osztály függőségeit, azoknak úgynevezett mock-olásával. A tesztek további részeinél a jól megszokott junit.Assert assertion metódusai lettek használva, az elvárt eredmények ellenőrzéséhez.

<br>

---

<br>

## Simon Borbála:

---

### Tesztelt java osztályok:
- Axe
- Cave
- Gloves
- Package
- Amino
- Nukleotid
- Substance

### Összesen:
- 18 db teszt, a fent említett osztályok metódusainak viselkedésének vizsgálatához

Az egységtesztek célja, hogy egy adott osztály metódusainak működését ellenőrizzék egyesével. Így biztosítani tudjuk, hogy a metódus tényleg azt végzi el, amire tervezték és a későbbiekben esetleges fejlesztések esetén nem változtattunk annyit a kódon, hogy egy meglévő metódus működését is tönkretettük közben. Az _assert_ függvények segítségével ellenőrizzük az elvárt működést. Ha az adott metódusunk egy másik függvényt hív meg, a mock által megvalósított osztály segítségével nézhetjük meg, hogy tényleg meg lett hívva a megfelelő metódus.