create database "java_m721";
create user "m721_admin" with encrypted password '<password>';
grant all privileges on database "java_m721" to "m721_admin";

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- drop table "public"."catalogue";

create table "public"."catalogue" (
	id uuid DEFAULT uuid_generate_v4 (),
	short_name VARCHAR NOT NULL,
    full_name VARCHAR NOT NULL,
    description TEXT,
    PRIMARY KEY (id)
)