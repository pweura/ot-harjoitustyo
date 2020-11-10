# Vaatimusmäärittely

## Sovelluksen tarkoitus

Auttaa käyttäjää seuraamaan edistymistään opintokursseillaan. Erityisesti edistymistä kurssin aikana kurssin osasuoritusten ja pistekertymän
avulla.

## Käyttäjät

Sovelluksella on vain normaaleja käyttäjiä, joilla on oikeus vain tallentamiinsa tietoihin. Käyttäjätilillä on vain vapaamuotoinen nimi,
ei salasanaa.

## Käyttöliittymäluonnos

- Sovellus aukeaa näkymään, jossa voi kirjautua sisään tai luoda uuden käyttäjän.
- Kurssinäkymä: Kirjautumisen jälkeen näkymässä on allekkain kesken olevat kurssit. Kurssin nimen olla on taulukkona osasuoritusten tiedot.
Kurssin oikealla puolella on nappi, josta kurssin voi merkitä suoritetuksi, jolloin se poistetaan. Kurssien alla on nappi, josta pääsee
luomaan uuden kurssin.
- Kurssin luomissivulla on kenttiä, jotka käyttäjä voi täyttää ja sitten klikkaamalla nappia luoda kurssin tai perua
- Näkymä kurssin tietojen päivittämistä varten

## Perusversion toiminnallisuus

### Ennen kirjautumista
- Käyttäjä voi luoda käyttäjätunnuksen
  - Tunnuksen täytyy olla uniikki ja vähintään 5 merkkiä pitkä
- Käyttäjä voi kirjautua sisään
  - Jos käyttäjän syöttämä käyttäjätunnus on olemassa, kirjautuminen onnistuu
  - Jos käyttäjän syöttämää käyttäjätunnusta ei ole olemassa, käyttäjälle ilmoitetaan, että tunnusta ei ole olemassa

### Kirjautumisen jälkeen käyttäjä noi
- nähdä kurssinsa ja niiden tilanteen
- luoda kurssin
  - Luotu kurssi näkyy vain sen luoneelle käyttäjälle
- muuttaa kurssin tietoja eli päivittää ne
  - Muokkaamalla taulukossa jo olevia tietoja
  - Lisäämällä taulukkoon uusi rivi
- poistaa kurssin merkkaamalla sen suoritetuksi
- kirjautua ulos

## Jatkokehitysideoita
- Salasana, jonka pitää olla yli 8 merkkiä pitkä ja sisältää ainakin yksi numero ja yksi erikoismerkki
- Historia: Erillinen näkymä käyttäjän suorittamista kursseista. Jokaisella kurssilla on uniikki nimi. Kurssille voi lisätä seuraavia
tietoja: opintopistemäärä, suorituksen päivämäärä ja arvosana
- Kalenterinäkymä: Näkymässä on kalenteri, jossa jokaisella rivillä on myös yhteenveto sillä viikolla palautettavista osasuorituksista
ja ne ovat merkittynä myös kurssia vastaavalla symbolilla palautuspäivän kohdalle. Tämä olisi uusi oletusnäkymä, jossa olisi linkki
kurssinäkymään.
- Kun käyttäjä merkitsee kurssin suoritetuksi, sovellus ehdottaa lisäystä historiaan samalla nimellä ja antaa käyttäjälle tilaisuuden
täyttää suorituksen muut tiedot. Käyttäjä voi siis valita, että ei lisää suoritusta historiaan.
