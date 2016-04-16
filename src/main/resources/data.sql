DROP TABLE "visitors";
DROP TABLE "events";
DROP TYPE status;

CREATE TYPE status AS ENUM ('PENDING','ACCEPTED','DECLINED');

CREATE TABLE "events" (
    "id" bigint NOT NULL,
    "uuid" text NOT NULL,
    "name" text NOT NULL,
    "tables_count" INT NOT NULL CHECK (tables_count > 0), --fix (12) number of seats on each table
    "tables_left" INT NOT NULL, --to save complex queries
    "comments" text NOT NULL, --wedding info
    CONSTRAINT pk_event PRIMARY KEY (id),
    CONSTRAINT uniq_event_uuid UNIQUE (uuid)
);

CREATE TABLE "visitors" (
    "id" bigint NOT NULL,
    "uuid" text NOT NULL,
    "event_id" bigint NOT NULL,
    "name" text NOT NULL,
    "status" status NOT NULL DEFAULT 'PENDING',
    "table_reg" int CHECK (table_reg > 0),
    CONSTRAINT pk_visitors PRIMARY KEY (id),
    CONSTRAINT uniq_visitors_uuid UNIQUE (uuid)        
);

ALTER TABLE "visitors" ADD 
    CONSTRAINT "fk_visitor_event" 
    FOREIGN KEY (event_id) REFERENCES "events" (id)
    ON DELETE CASCADE ON UPDATE CASCADE;

INSERT INTO events VALUES (1,'8138b506-5b67-464a-8cd4-342805a665cc','Orestis',15,15,'kalos orisate');
INSERT INTO events VALUES (2,'3e04e6fc-dd5c-4d8d-b90c-46e3eba0a3a9','Mike',20,20,'kalos kalos');
INSERT INTO visitors VALUES (1,'fe3d69d3-f1da-45d5-89b8-2d3f9fb3168b',2,'george','PENDING');
INSERT INTO visitors VALUES (2,'f5d15fa9-2f16-4760-98c5-e7b5e0b5f620',2,'noob','ACCEPTED');