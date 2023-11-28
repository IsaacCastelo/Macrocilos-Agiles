drop database AgileMeso;
create database AgileMeso;
use AgileMeso;

create table MediosFisicos(
MediosFisicos_id int(10) not null AUTO_INCREMENT primary key,
nombre varchar(20)

);
create table DistribucionVolumen(
DistribucionVolumen_id int(10) not null auto_increment primary key,
etapa varchar(20),
semana int(10),
fechaInicio DATE ,
fechaFin  DATE ,
mesociclo int(10),
ciclicidad float(10,3),
acentos int(10) ,
medioFisicos int(10),
esfuerzo int(10),
MediosFisicos_id int(10),

 FOREIGN KEY (MediosFisicos_id) REFERENCES MediosFisicos (MediosFisicos_id)
);
create table calcularEtapas(
calcularEtapas_id int(10) not null auto_increment primary key,
tipoEtapa varchar(10),
min int(10),
max int(10),
prom int(10),
ins int(10),
semanas int(10),
volumenEtapa int(30),
MediosFisicos_id int(10),

 FOREIGN KEY (MediosFisicos_id) REFERENCES MediosFisicos (MediosFisicos_id)
);
create table encargados(
encargados_id int(10) not null auto_increment primary key,
deporte varchar(10),
rama varchar(10),
jefeRama varchar(10),
EntAuxPrepFis varchar(10),
metodologo varchar(10),
inicioPlan DATE,
finPlan DATE,
totalSemanas int(10),
MediosFisicos_id int(10),

 FOREIGN KEY (MediosFisicos_id) REFERENCES MediosFisicos (MediosFisicos_id)
);
