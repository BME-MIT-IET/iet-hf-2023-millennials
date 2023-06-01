# **UI tesztek**

## György Márk Attila

---

### Teszteléshez módosított java osztályok:
- MenuBar
- NeWViorologistDialog
- LaboratoryPanel
- MainFrame
- ShelterPanel
- VirologistFieldPanel
- VirologistIcon
- WarehousePanel

### Összesen:
- 5db teszt, amik letesztelik, hogy az alkalmazás elindul és megfelelően működnek a gombok.

Az UI tesztek során a fenti osztályok módosítására volt szükség, mivel eredetileg nem voltak felkészítve arra, hogy UI teszteket hajtsunk rajtuk végre. A módosítások többsége azért történt, mert a program nem volt felkészítve arra, hogy mit tegyen, ha nem találja meg az adott képet. Ennek eredményeként a módosított osztályokban a képek csak akkor lesznek betöltve, ha megtalálhatóak. Ezenkívül problémát jelentett, hogy az egyes UI elemeket nem tároltuk változókban, csupán lokálisan helyeztük el egy panelen, és ennek a panelnek a tartalma nem volt lekérdezhető, hogy az AssertJ Swing meg tudja nyomni a gombokat például. Ennek eredményeként a módosítások között szerepelt az UI elemek tárolása változókban, hogy lehessen rájuk hivatkozni és ellenőrizni azok állapotát a tesztek során.
