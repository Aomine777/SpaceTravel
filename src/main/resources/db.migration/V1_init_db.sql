CREATE TABLE CLIENT (
    id SERIAL PRIMARY KEY,
    name VARCHAR(200),
    UNIQUE (name)
);


CREATE TABLE PLANET (
    id VARCHAR(10) PRIMARY KEY ,
    name VARCHAR(500) NOT NULL CHECK (length(name) >= 1)
);


CREATE TABLE TICKET (
    id SERIAL PRIMARY KEY ,
    created_at TIMESTAMP,
    client_id INT,
    from_planet VARCHAR(10),
    to_planet VARCHAR(10),
    FOREIGN KEY (client_id) REFERENCES CLIENT(id),
    FOREIGN KEY (from_planet) REFERENCES PLANET(id),
    FOREIGN KEY (to_planet) REFERENCES PLANET(id)
);