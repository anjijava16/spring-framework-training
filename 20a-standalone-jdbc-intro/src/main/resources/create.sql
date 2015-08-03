create table person
(
id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
name varchar(255),
age int
);

insert into person(name,age) values ('ross', 35);
insert into person(name,age) values ('rachel', 30);
insert into person(name,age) values ('monica', 33);