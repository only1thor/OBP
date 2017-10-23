# This repo is for assignment 4, in my OOP class

## Assignment description:
Du skal lage et program for å opprette og trekke ut forskjellige data fra hule
metallvolumer basert på kjente geometriske figurer (3D figurer/objekter).
Figurene vil være laget i metall. Av metall holder vi oss kun til jern i denne
oppgaven. Jern har egenvekt 7.8 kg/ dm 3 .

Til denne oppgaven trenger vi variabler for eventuelt lengde-, bredde-, høyde- og
eventuelt radius-mål. Les hele oppgave-teksten nøye før du starter.

a) Se på figur 11.1 i boka side 409 (9.utg) (433 (10.utg.)) der klassene GeometricObject,
Circle og Rectangle kan gi deg en idé om hvordan du skal bygge opp en
struktur/arv for denne oppgaven. Figuren tar for seg kun 2 nivåer av arv.
Klassen GeometricObject skal være abstract. Definer de variablene du mener
er nødvendig og fornuftig å definere i klassen. Konstruer nødvendige
’constructors’ til hver klasse der variabler blir satt til konkrete verdier.
Definér findArea, findVolume, findCircumference (omkrets), findSurfaceArea
og findWeight som abstrakte metoder i GeometricObject-klassen. Definer
nødvendige metoder for å hente ut variabler og for å kunne endre variabler
(get-ere og set-ere). De variablene som i dag ligger i GeometricObject i boka,
skal ikke benyttes.

b) Lag 2 klasser som tar utgangspunkt i følgende geometrier: Sirkel og
rektangel (som i figuren). Sirkelen har radius, rektangel har lengde og bredde
som variabler. Lag nødvendige ’constructors’ og programmér metodene
findArea og findCircumference i begge klasser. Legg til metoder for å hente
ut og endre variabler (get-ere og set-ere).

c) Lag klasser som utvider følgende sub-klasser:
Sirkel-klassen utvides til sylinder, kjegle og kule.
Rektangel-klassen utvides til en boks.

d) Lag metodene findSurfaceArea og findWeight. Legg til metoder for å hente ut
og endre variabler (get-ere og set-ere).

e) For å teste dette skal dere lage et hovedprogram som tester ut noen
forskjellige 3D-objekter.

f) Alle klasser skal ha en ’fornuftig’ toString-metode. Alle variabler og
metodenavn skal være engelske ord (circle istedet for sirkel, rectangle
istedet for rektangel osv.)

g) Det at legemene er hule, vil si at de har en tykkelse. Denne må angis som
egen verdi i hvert objekt. Tykkelsen skal regnes ‘utenfra og innover’. En
sylinder har tykkelse i bunn og topp og er altså ikke et rør. En sylinder er
kuttet rett i hver ende. Boks har rettvinklete hjørner.

h) Det skal leveres med en beskrivelse av alle klasser og deres innhold,
eksempelvis vha. UML.


Dere kan med fordel jobbe sammen i grupper (maks 3).
Oppgaven leveres i Canvas. Dere skal levere kun én fil, gjerne en .zip fil.
Tillegg for de som liker litt utfordring, ikke obligatorisk: Utvid også med en
klasse for trekanter med grunnlinje og høyde. Utvid denne til prisme med lengde.
Prismet er kuttet rett i endene.
Hint: her vil indre høyder bli noe vanskeligere å beregne.
