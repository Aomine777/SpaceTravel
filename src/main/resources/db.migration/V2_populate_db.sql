INSERT INTO CLIENT (name) VALUES
    ('Emma'),
    ('Liam'),
    ('Olivia'),
    ('Noah'),
    ('Ava'),
    ('William'),
    ('Sophia'),
    ('James'),
    ('Isabella'),
    ('Benjamin')
   ;

INSERT INTO PLANET (id, name) VALUES
    ('MARS','Mars'),
    ('VEN','Venus'),
    ('JUP','Jupiter'),
    ('SAT','Saturn'),
    ('URA','Uranus'),
    ('EARTH','Earth')
   ;

INSERT INTO TICKET(created_at, client_id, from_planet, to_planet) VALUES
    ('2024-04-16 08:00:00',1,'URA','SAT'),
    ('2024-04-16 08:30:00',1,'VEN','MARS'),
    ('2024-04-16 09:00:00',1,'JUP','URA'),
    ('2024-04-16 09:30:00',1,'EARTH','JUP'),
    ('2024-04-16 10:00:00',1,'SAT','VEN'),
    ('2024-04-16 10:30:00',1,'MARS','EARTH'),
    ('2024-04-16 11:00:00',1,'JUP','SAT'),
    ('2024-04-16 11:30:00',1,'VEN','JUP'),
    ('2024-04-16 12:00:00',1,'EARTH','MARS'),
    ('2024-04-16 12:30:00',1,'MARS','VEN');