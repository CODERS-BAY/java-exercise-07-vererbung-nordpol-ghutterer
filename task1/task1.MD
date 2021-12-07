# Das ist eine Wiederholung der objektorientierten Konzepte.

Bitte versuche als Übung alles in Markdown zu beantworten. Hier ist ein [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. Was ist das Ziel der Objektorientierung?
 * Die Grundidee besteht darin,die Architektur einer Software an den Grundstrukturen desjenigen Bereichs der Wirklichkeit auszurichten.
 * der die gegebene Anwendung betrifft.
2. Gibt es OOP nur in Java?
 * Nein es gibt viele objektorientierte Programmiersprachen.
3. Was ist der Unterschied zwischen Objekt und Klasse?
 * Ein Objekt ist eine Einheit die nach dem Bauplan der zugeordneten Klasse erzeugt wurde. Ein Objekt verfügt somit über die Attribute 
 * die in der Klasse festgelegt sind. Diesen Attributen können im Unterschied zur Klasse Attributwerte zugewiesen werden.
4. Wie erzeuge ich eine neue Instanz? (Welches Schlüsselwort gibt es dafür)
 * Eine Instanz wird mit Hilfe des new-Operators erzeugt.
5. Was bedeutet das Schlüsselwort `static` und wo kann es überall verwendet werden?
 * Das Schlüsselwort static wird zusammen mit einer Membervariablen, Memberfunktionen, Blöcken und verschachtelten Klassen verwendet.
 * Die Anwendung von statischen Schlüsselwörtern findet überall dort statt, wo wir nicht jedes Mal eine neue Instanz erstellen möchten.
6. Wozu dient die Vererbung?
 * Die Vererbung in Java ermöglicht es dir eine hierarchische Ordnung für Klassen festzulegen und reduziert somit die Menge des redundanten Codes.
 * Das bedeutet, dass du die Attribute und Methoden einer Klasse vererben kannst und du sie damit nicht nocheinmal programmieren musst.

7. Kann in Java von mehreren Klassen geerbt werden? Wenn ja wie?
 * In Java ist dies nicht direkt möglich.
8. Welche Vererbungshierarchien kennst du? (Ein Bild reicht aus)
  * ![](../../../../AppData/Local/Temp/unnamed.png)
9. Was beudeted Casten und wie ist die Syntax in Java dafür?
  * Es bedeutet dass man einen Datentyp mittels Typecasting in einen anderen Datentyp umwandelt.
  * Syntax. dataType variableName = (dataType) variableToConvert;
  * Es gibt 2 types of Casting : Widening Type Casting und Narrowing Typecasting.
  * int x =2;
  * double i = x; Wird automatisch gemacht da der neue Datentyp grösser ist.
  * double x = 2.2;
  * int i = (int)x; Muss man explizit casten, da der neue Datentyp kleiner ist.
10. Was ist der Unterschied zwischen explizieten und implizieten Typecasting?
 * In Frage 9 schon beschrieben.
11. Erkläre die folgenden Schlüsselwörter: `super`, `this`
 * Java super zum Auflösen von Namenskonflikten in einer Vererbungshierarchie. Genau wie wir Methoden einer Oberklasse mit Hilfe von super aufrufen können,
 * kann Java super auch zum Zugriff auf die Attribute einer Oberklasse verwendet werden.
 * Java verfügt über das Schlüsselwort this um auf die aktuelle Instanz innerhalb eines Methodenrumpfes zu referenzieren. 
 * Mit Hilfe der folgenden Notation kann man mit dem Schlüsselwort this die Methoden und Attribute der eigenen Klasse referenzieren: this.
12. Für was dient der `instanceof` Operator. Gib ein sinnvolles Beispiel.
 * Der instanceof Operator wird verwendet um zu testen ob das Objekt eine Instanz des spezifischen Typs ist
 * (Class Sublass oder Interface)
   // create a variable of string type
   String name = "Programiz";

   // checks if name is instance of String
   boolean result1 = name instanceof String;
