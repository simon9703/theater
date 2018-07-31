CREATE DATABASE flavor;

use flavor;


create table people(
    id int primary key auto_increment,
    name varchar(20),
    interest varchar(50),
    age double);
	
insert into people values(null,'张思蒙11','看电视',21.8),(null,'张思蒙22','听音乐',17.5),(null,'张思蒙33','上上网',32.9);
insert into people values(null,'张思蒙44','游泳',12.1),(null,'张思蒙55','看电影',25.6),(null,'张思蒙66','看书',36);