
# Rapport


Jag började med att lägga till JSON classen till appen sedan gjorde jag en recycler view i layouten så att jag har något att utgå ifrån. 
Efterdet skapade jag en view holder samt getters och setters för själva json datan. jag skapade också textviews för varje json data som fanns. Man kan se en getter och setter i figur 1. 
Json data är en data som man själv skriver in eller någon annan som man sedan hämtar för att visa upp den med hjälp av något i detta fallet var det recycler view. 
getters och setter är att man hämtar dessa olika texter och sedan lägger in det i variablerna,med hjälp av en kod som säger att man ska hämta storleken så hämtar man alla 
en efter en istället för att ersätta det gamla om det skulle vara så att man har mer data. 
Efterdet skapade jag en adapter för recycler viewn, tyvär så var det vid detta tillfälle som jag fick problem med min kod och inget fungerade, men det löste sig i framtiden
I figur 2 så kan man se hur jag skapde min adapter, men man kan också se varför det var lite fel. Jag hade bara string istället för att tänka på att vissa var för int.
Eller att vara mer tydlig så är det en viewholder vad denna gör är att den håller dessa o säger hur den ska visas i vilken position. 
till sist så la jag till en about class för att fixa till det sista till applikationen.
## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.
Figur 1:
```
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

```
Figur 2: 
```
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Id.setText(Itemlist.get(position).getName());
        holder.Login.setText(Itemlist.get(position).getName());
        holder.Location.setText(Itemlist.get(position).getName());
        holder.Size.setText(Itemlist.get(position).getName());
        holder.AuxData.setText(Itemlist.get(position).getName());
        holder.Name.setText(Itemlist.get(position).getName());
        holder.Company.setText(Itemlist.get(position).getName());
        holder.Cost.setText(Itemlist.get(position).getName());
        holder.Category.setText(Itemlist.get(position).getName());
```

Bilder läggs i samma mapp som markdown-filen.

![](Appscreen.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
