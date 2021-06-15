create table if not exists role
(
    uuid   uuid not null
    constraint role_pkey primary key,
    name varchar(255)
    );

create table if not exists my_user
(
    uuid   uuid not null
    constraint users_pkey
    primary key,
    name uuid unique
);

create table if not exists worker
(
    uuid  uuid not null
    constraint worker_pkey
    primary key,
    email varchar(255),
    name  varchar(255)
    );

CREATE TABLE user_role
(
    user_id uuid NOT NULL,
    role_id uuid NOT NULL,
    PRIMARY KEY (user_id, role_id),

    CONSTRAINT fk_user_role_role FOREIGN KEY (role_id) REFERENCES role (uuid),
    CONSTRAINT fk_user_role_user FOREIGN KEY (user_id) REFERENCES my_user (uuid)
);

create table if not exists work_type
(
    uuid uuid not null
    constraint work_type_pkey
    primary key,
    name varchar(255)
    );

create table if not exists request
(
    uuid             uuid not null
    constraint request_pkey
    primary key,
    circulation_time varchar(255),
    first_name       varchar(255),
    last_name        varchar(255),
    organization     varchar(255),
    msg              varchar,
    my_user_uuid     uuid
    constraint fkmgjso6xk6080cm662p8ju6wub
    references my_user,
    work_type_uuid   uuid
    constraint fk9k0x383qw2e0jy8lo1b75u3vf
    references work_type
    );

create table if not exists log
(
    uuid   uuid not null
    constraint my_log_pkey
    primary key,
    method varchar(255),
    result varchar,
    time timestamp
    );


