INSERT INTO role (uuid, name)
VALUES ('410c6088-f00b-4244-9f3b-4ee6a1f1f1be', 'ADMIN'),
       ('92c1453e-b731-4d7b-8c2c-945339f9b2fd', 'USER');

INSERT INTO worker (uuid, email, name)
VALUES  ('95906c4c-cd11-11eb-b8bc-0242ac130003','test@mail.ru','kolya'),
        ('c9b388b0-cd11-11eb-b8bc-0242ac130003','test2@mail.ru','roma'),
        ('cf90b564-cd11-11eb-b8bc-0242ac130003','test3@mail.ru','sasha');

INSERT INTO work_type(uuid, name)
VALUES ('008de77c-cd12-11eb-b8bc-0242ac130003','ремонт компьютеров'),
       ('1a8f11e6-cd12-11eb-b8bc-0242ac130003','сопровождение'),
       ('963a20e6-cd13-11eb-b8bc-0242ac130003','доработка');
