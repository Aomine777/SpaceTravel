import entities.Client;
import entities.Planet;
import entities.Ticket;
import impl.ClientCrudServiceImpl;
import impl.PlanetCrudServiceImpl;
import services.ClientCrudService;
import services.PlanetCrudService;

public class Main {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudServiceImpl();
        PlanetCrudService planetService = new PlanetCrudServiceImpl();

        Client newClient = new Client();
        newClient.setName("Test Client");
        newClient = clientService.create(newClient);
        System.out.println("Created client: " + newClient.getName());

        newClient.setName("Updated Client");
        newClient = clientService.update(newClient);
        System.out.println("Updated client: " + newClient.getName());

        Client foundClient = clientService.findById(newClient.getId());
        System.out.println("Found client: " + foundClient.getName());

        clientService.delete(newClient.getId());
        System.out.println("Deleted client with id: " + newClient.getId());


        Planet newPlanet = new Planet();
        newPlanet.setId("PLT");
        newPlanet.setName("Test Planet");
        newPlanet = planetService.create(newPlanet);
        System.out.println("Created planet: " + newPlanet.getName());

        newPlanet.setName("Updated Planet");
        newPlanet = planetService.update(newPlanet);
        System.out.println("Updated planet: " + newPlanet.getName());

        Planet foundPlanet = planetService.findById(newPlanet.getId());
        System.out.println("Found planet: " + foundPlanet.getName());

        planetService.delete(newPlanet.getId());
        System.out.println("Deleted planet with id: " + newPlanet.getId());
    }
}