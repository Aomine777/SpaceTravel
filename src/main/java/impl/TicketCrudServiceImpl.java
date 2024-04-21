package impl;

import entities.Ticket;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import services.TicketCrudService;

import java.util.List;

import static java.util.Objects.nonNull;

public class TicketCrudServiceImpl implements TicketCrudService {
    private EntityManager entityManager;

    public TicketCrudServiceImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Ticket create(Ticket ticket) {
        if (ticket.isNullClientOrFromPlanetOrToPlanet()) {
            throw new IllegalArgumentException("Client, FromPlanet and ToPlanet cannot be null");
        }
        entityManager.persist(ticket);
        return ticket;
    }

    @Override
    public Ticket update(Ticket ticket) {
        if (ticket.isNullClientOrFromPlanetOrToPlanet()) {
            throw new IllegalArgumentException("Client, FromPlanet and ToPlanet cannot be null");
        }
        return entityManager.merge(ticket);
    }

    @Override
    public void delete(Integer id) {
        Ticket ticket = findById(id);
        if (nonNull(ticket)) {
            entityManager.remove(ticket);
        }
    }

    @Override
    public Ticket findById(Integer id) {
        return entityManager.find(Ticket.class, id);
    }

    @Override
    public List<Ticket> findAll() {
        return entityManager.createQuery("SELECT t FROM TICKET t", Ticket.class).getResultList();
    }
}
