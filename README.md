# ADP_PRAC2_P4
Patrón de diseño: Metodo Plantilla. ADP PRAC2 2014-2015 tardor (semestre 1) Pregunta 4. UOC, Grado Ingeniería Informática

Operació busLineData() 

El patró aplicat és el mètode plantilla, d’aquesta manera la operació busLineData() engloba vàries operacions parcials permetent que es refini a la classe filla.
Una es declara i codifica a la classe mare, BusLine. (Aquesta classe pot ser abstracta o no, encara que arreu es troba definida com abstracta per aquest patró.) - sumKmRoutes() demanant les dades a les instàncies de Route que formen part de BusLine i fent la suma dels ‘float’ dels quilòmetres dels trajectes. 
Aquesta fa servei del mètode getTotalKms() de la classe Route, fent servir el patró Expert.

L’altra operació parcial declarada a BusLine, és getNumberCities() que es declara amb visibilitat protected, perquè es pugui accedir desde les classes filles. Si la classe mare és abstracta, aquesta operació s’ha de deixar indicada només amb la signatura a la classe mare i implementar a la filla. Si no és abstracta BusLine, es pot deixar buida i s’ha de sobreescriure amb el codi que li pertoqui a cada una d’elles. A CityBusLine, retornarà el valor enter 1, a InterCityBusLine haurà de comptar les ciutats per las que passa i retornar el valor enter.

Amb aquests dos valors busLineData() podrà formar la tupla i retornar els valors que es requereixen


Exercici 5

La instància de la classe concreta (filla) prendrà un camí comú en el procediment implementat a la classe abstracta (mare) BusLine, i una part específica implementada a la classe concreta. En tots dos casos, la part comú, es demanen les dades dels trajectes Route i es sumen.

En la part específica de cada una estarà implementada la codificació que es necessita en cada una. En CityBusLine, retorna un 1, ja que no passa per cap ciutat més. En InterCityBus, ha d’obtenir el número de ciutats i retornar el valor.

Al final tots dos valors es tornen a la tupla <totalKms: Float, totalCities : Integer> 
