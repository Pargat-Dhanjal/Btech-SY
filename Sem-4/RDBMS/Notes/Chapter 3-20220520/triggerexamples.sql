-- view example
select * from course

create or replace view course_view as
select courseid, coursename from course
where coursename is not null
with check option

select * from course_view

insert into course_view values(110,'cs')
insert into course_view values(111)


-- materialized VIEW (postgres syntax)

	--1. listing existing views
	select * from pg_catalog.pg_views;

	--2. listing specific / user defined view
	select viewname from pg_catalog.pg_views
	where viewname = 'student_info';
	
	--3. finding query/definition associated with view
	select definition from pg_views where viewname = 'student_info'

	--4. create materialized view
	CREATE MATERIALIZED VIEW student_info_materialzed AS SELECT roll,name FROM student;
	
	-- 5. view materialized view
	select * from student_info_materialzed

	-- 6. update entries in existing TABLE
	
	update student
	set name='name changed'
	where roll = 102
	
	--7. check normal view and materialized view results
	
	select * from student_info
	
		-- change will appear
		
	select * from student_info_materialzed
		
		-- no CHANGE
	
	--8. refresh materialized view for updates

	REFRESH MATERIALIZED VIEW student_info_materialzed;
	
		-- materialized view is updated now
	

---- Domain CONSTRAINTS

-- create domain
 CREATE DOMAIN baseknowledge VARCHAR(90) NOT NULL DEFAULT 'N/A';
 
-- add new column in existing table
 alter table course add column course_base baseknowledge

-- drop column first 
 Query:  alter table course drop column course_base
-- then domain can be dropped
 Query:  drop domain baseknowledge

	


-- Example 1
CREATE TABLE T1 (
	a INTEGER, 
	b CHAR(10)
);
CREATE TABLE T2 (
	c CHAR(10), 
	d INTEGER
);

CREATE OR REPLACE FUNCTION add()
  RETURNS trigger AS
$$
BEGIN
         INSERT INTO T2 VALUES(NEW.b,NEW.a);
 
    RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';

CREATE TRIGGER test_trigger
  AFTER INSERT
  ON T1
  FOR EACH ROW
  EXECUTE PROCEDURE add();

  insert into T1 values(1,'l');

  select * from T2;
  
  drop trigger test_trigger on T1
drop function add

alter table student add column age int ;

--example 2 to enforce constraint

	--1. create function

CREATE OR REPLACE FUNCTION age_constraint()
  RETURNS trigger AS
$$
BEGIN
   IF (NEW.age < 0) THEN 
        RAISE EXCEPTION 'No negative age allowed';
    END IF; 
    RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';
	
	-- 2. create trigger

CREATE TRIGGER age_trigger
  BEFORE INSERT
  ON student
  FOR EACH ROW
  EXECUTE PROCEDURE age_constraint();

  insert into student values(1654,'cs',21);

  insert into student values(1654,'cs',-21) ;

-- drop TRIGGER
  drop trigger age_trigger on student
-- drop function
  drop function age_constraint



3. create log file to keep old entries
4. New record with current system date
5. Find derived attribute
6. Add constraints ex; text length should be greater than 0
7. Salary increments by 10%


reference link for syntax and examples: 
1. https://severalnines.com/blog/postgresql-triggers-and-stored-function-basics
2. https://www.w3resource.com/PostgreSQL/postgresql-triggers.php
3. 
  

-- Example 3. updating previous entries while adding new one

alter table student add column city varchar(20)

alter table student add column address varchar(20)

update student set city = 'vidyavihar'


	-- update column address as Mumbai when city is Vidyavihar
	
CREATE OR REPLACE FUNCTION update_data()
  RETURNS trigger AS
$$
BEGIN
UPDATE student 
        SET address = 'mumbai'
                WHERE city = 'vidyavihar';
 
    RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';

CREATE TRIGGER update_data_trigger
  before INSERT
  ON student
  FOR EACH ROW
  EXECUTE PROCEDURE update_data();
  
  
        insert into student values(109,'new student',1,'mumbai','vidyavihar');

select * from student


  
---Example 4. updating values
  
  CREATE OR REPLACE FUNCTION update_data()
  RETURNS trigger AS
$$
BEGIN
UPDATE person 
        SET age = age + 1
                WHERE city = 'mumbai';
 
    RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';


CREATE TRIGGER update_data_trigger
  before INSERT
  ON person
  FOR EACH ROW
  EXECUTE PROCEDURE update_data();
  
    insert into person values(100,'y','mumbai','mh', 32);
	
	
	
	
	--Example 5. derived attribute age
	
 CREATE OR REPLACE FUNCTION update_age()
  RETURNS trigger AS
$$
BEGIN
UPDATE person 
     SET age = (current_date - dob)/365;
    -- set age = age('2017-01-01','2011-06-24');    
     
     RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';


CREATE TRIGGER update_data_age
  before INSERT
  ON person
  FOR EACH ROW
  EXECUTE PROCEDURE update_age();


  insert into person(id, name, city, state, dob) values (1808,'j','pune','mh', '2000-06-01' )	
	
