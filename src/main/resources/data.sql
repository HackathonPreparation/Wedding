DROP TABLE "events";
DROP TABLE "visitors";
DROP TYPE status;

CREATE TYPE status AS ENUM ('PENDING','ACCEPTED','DECLINED');

CREATE TABLE "events" (
    "uuid" text NOT NULL,
    "name" text NOT NULL,
    "tables_count" INT NOT NULL CHECK (tables_count > 0), --fix (12) number of seats on each table
    "tables_left" INT NOT NULL, --to save complex queries
    "comments" text NOT NULL, --wedding info
    CONSTRAINT pk_event PRIMARY KEY (id),
    CONSTRAINT uniq_event_uuid UNIQUE (uuid)
);

CREATE TABLE "visitors" (
    "uuid" text NOT NULL,
    "event_id" bigint NOT NULL,
    "name" text NOT NULL,
    "status" status NOT NULL DEFAULT 'PENDING',
    "table_reg" int NOT NULL CHECK (table_reg > 0),
    CONSTRAINT pk_visitors PRIMARY KEY (id),
    CONSTRAINT uniq_visitors_uuid UNIQUE (uuid)        
);

ALTER TABLE "visitors" ADD 
    CONSTRAINT "fk_visitor_event" 
    FOREIGN KEY (event_id) REFERENCES "events" (id)
    ON DELETE CASCADE ON UPDATE CASCADE;
