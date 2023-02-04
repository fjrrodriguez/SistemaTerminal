SISTEMA TERMINAL DE TRANSPORTES:
Se gestiona el horario de viajes de una terminal de transporte.
Para ello se crearon les paquetes:
1. Controllers
2. Repository
3. Service
--En el paquete de controladores se crearon cuatro claeses:
	1. BusesController
	2. DestinoController
	3. PasajeroController
	4. ViajesController
	Cada una de estas clases permite por medio de peticiones Get y post acceder a los repositoriso creados y hacer modificaciones de los datos
--En el paquete Repository se creó:
	1. Paquete de modelos (models)
	2. Clase ViajesRepository: Contiene el repositorio que registra todos los viajes realizados en el terminal(Pasajeros subidos en un bus, datos del bus y destino)
	3. TerminalCentro: Contiene el repositorio de los pasajeros, destinos y buses
	Models contiene los modelos de destino, bus, pasajero y viaje
--En el paquete Service se crearon las interfaces y clases para cada uno de los servicios
	1. IViajesService
	2. IBusesService
	3. IPasajerosService
	4. IDestinosService
	5. ViajesService
	6. BusesService
	7. PasajerosService
	8. DestinosService

Se habilito el puerto 8085
-GETMAPPING
	-listar pasajeros: localhost:8085/api/pas/bring/all 
	-listar buses: localhost:8085/api/rest/bus/bring/all
	-listar destinos: localhost:8085/api/rest/dest/bring/all
	-listar registro de viajes: quedo pendiente por completar
-POSTMAPPING
	-añadir pasajero: localhost:8085/api/pas/savePasajer
	-anadir bus: localhost:8085/api/rest/bus/saveBus
	-añadir destino: localhost:8085/api/rest/dest/saveDestino
	-añadir registro de viaje: quedo pendiente por terminar






